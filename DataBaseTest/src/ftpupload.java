

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class ftpupload
 */
@WebServlet("/ftpupload")
public class ftpupload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ftpupload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	///////////////
		PrintWriter out = response.getWriter();
		String fsl = File.separator;
        String root = request.getSession().getServletContext().getRealPath(fsl); //������ �����̳� ����
	    System.out.println("��Ʈ���: " + root );
        //���ε� ������(��Ʈ����) 
		int size = 5*1024*1024;
	 	String name = "";
	 	String subject = "";
	 	String fileName1 = "";
	 	String originalName1 = "";
	 	MultipartRequest multi = null;
	try{
			// ���� ���ε� ���� ����
		multi = new MultipartRequest(
				request, //��û����
				root, // ���ε� ������
				size, // ���ѻ����� (5�ް�)
				"UTF-8", // ���ڵ� ���
				new DefaultFileRenamePolicy()
				);
		// ÷������ ������ ������ 
		Enumeration files = multi.getFileNames();
		// ���ϸ� �����´� 
		String file1 = (String)files.nextElement();
		//multi���� �ش� �̸��� �˷��ְ� ���� �ý��ۻ� ��Ī �˾Ƴ�( ������� )
		fileName1 = multi.getFilesystemName(file1);
		System.out.println("ssssssssss is OK"+fileName1);
		}catch(Exception e) {
			out.print(e.getMessage());
			System.out.println("file upload fail : " + e.getMessage()); // �αױ�� 
		} 
	    File filePath = new File(root);
	    File mFile = new File(filePath,fileName1);
	    String ftpPath = "ftp://10.10.10.109/test/";
	    FtpClient ftp = new FtpClient(ftpPath);
	    try {
			ftp.upload(mFile, fileName1);
			System.out.println("upload is OK : "+fileName1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

class FtpClient {
    private String serverIp;
    private int serverPort;
    private String user;
    private String password;
    private String filePath ; 
    public FtpClient(String filePath) {
        this.serverIp = "10.10.10.109";
        this.serverPort = 21;
        this.user = "user1";
        this.password = "1234";
        this.filePath = filePath;
    }
    public boolean upload(File fileObj, String FileName) throws SocketException, IOException, Exception {
        FileInputStream fis = null;
        FTPClient ftpClient = new FTPClient();
        
        try {
            ftpClient.connect(serverIp, serverPort);  //ftp ����
            ftpClient.setControlEncoding("utf-8");    //ftp ���ڵ�����
            int reply = ftpClient.getReplyCode();     //�����ڵ�ޱ�
            
            if (!FTPReply.isPositiveCompletion(reply)) {  //������ false ��� ���� ���� exception �߻�
                ftpClient.disconnect();
                throw new Exception(serverIp+" FTP ���� ���� ����");
            }
            
            ftpClient.setSoTimeout(1000 * 10);   //timeout ����
            ftpClient.login(user, password);     //ftp �α���
            ftpClient.changeWorkingDirectory("/test"); // ��� ���ε� ������ġ
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE); //����Ÿ�Լ���
            ftpClient.enterLocalActiveMode();  //active ��� ����
            
            fis = new FileInputStream(fileObj);
            return ftpClient.storeFile(FileName, fis); //���� ���ε�
        } finally {
            if (ftpClient.isConnected()) {
                ftpClient.disconnect();
            }
            if (fis != null) {
                fis.close();
            }
        }
    }
}




