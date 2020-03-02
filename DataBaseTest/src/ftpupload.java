

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
        String root = request.getSession().getServletContext().getRealPath(fsl); //웹서버 컨테이너 정보
	    System.out.println("루트경로: " + root );
        //업로드 폴더에(루트폴더) 
		int size = 5*1024*1024;
	 	String name = "";
	 	String subject = "";
	 	String fileName1 = "";
	 	String originalName1 = "";
	 	MultipartRequest multi = null;
	try{
			// 파일 업로드 수행 구문
		multi = new MultipartRequest(
				request, //요청정보
				root, // 업로드 절대경로
				size, // 제한사이즈 (5메가)
				"UTF-8", // 인코딩 방식
				new DefaultFileRenamePolicy()
				);
		// 첨부파일 여러개 가져옴 
		Enumeration files = multi.getFileNames();
		// 파일명만 가져온다 
		String file1 = (String)files.nextElement();
		//multi에서 해당 이름을 알려주고 실제 시스템상 명칭 알아냄( 리얼네임 )
		fileName1 = multi.getFilesystemName(file1);
		System.out.println("ssssssssss is OK"+fileName1);
		}catch(Exception e) {
			out.print(e.getMessage());
			System.out.println("file upload fail : " + e.getMessage()); // 로그기록 
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
            ftpClient.connect(serverIp, serverPort);  //ftp 연결
            ftpClient.setControlEncoding("utf-8");    //ftp 인코딩설정
            int reply = ftpClient.getReplyCode();     //응답코드받기
            
            if (!FTPReply.isPositiveCompletion(reply)) {  //응답이 false 라면 연결 해제 exception 발생
                ftpClient.disconnect();
                throw new Exception(serverIp+" FTP 서버 연결 실패");
            }
            
            ftpClient.setSoTimeout(1000 * 10);   //timeout 설정
            ftpClient.login(user, password);     //ftp 로그인
            ftpClient.changeWorkingDirectory("/test"); // 경로 업로드 저장위치
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE); //파일타입설정
            ftpClient.enterLocalActiveMode();  //active 모드 설정
            
            fis = new FileInputStream(fileObj);
            return ftpClient.storeFile(FileName, fis); //파일 업로드
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




