

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


/**
 * Servlet implementation class upload
 */
@WebServlet("/upload")
public class upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public upload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String fsl = File.separator;
        String root = request.getSession().getServletContext().getRealPath(fsl)+"/upload"; //������ �����̳� ����
	    System.out.println("��Ʈ���: " + root);
        //���ε� ������ ���� ���ε�
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
		}catch(Exception e) {} 
	Enumeration files = multi.getFileNames();
	
	
	// ���ϸ� �����´� 
	String file1 = (String)files.nextElement();
	
	//multi���� �ش� �̸��� �˷��ְ� ���� �ý��ۻ� ��Ī �˾Ƴ�( ������� )
	fileName1 = multi.getFilesystemName(file1);
	
	//multi���� �˰��ִ� ���� �����̸��� ����1�� ���� �˾Ƴ�(����ڰ� �ø� ���ϸ�) 
	originalName1 = multi.getOriginalFileName(file1);

	System.out.println("���ϸ� : " + originalName1);

	System.out.println("�������ϸ� : " + fileName1 );
		/*
		///////////////////////////////////////////
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Boolean connect = false;
		response.setContentType("images/jpg"); 
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://10.10.10.109:3306/dream", "user", "1234");
			System.out.println(conn + ": DB connect ok");
		} catch (Exception e) {
			System.out.println("DB connect fail");			
		}
		
			String query_select = "select count(write_num) from upload_img";
			int a = 0;
			String b = "";
			String SQL = "INSERT INTO dream.upload_img VALUES (?, ?)";
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(query_select); // �ε��� ī��Ʈ 
				a = Integer.valueOf(String.valueOf(rs)); // �ε��� ���� ���
				a++;
				b = String.valueOf(a);
				pstmt = conn.prepareStatement(SQL);
				pstmt.setString(1, b);
				pstmt.setString(2, uploadDir);
				pstmt.executeUpdate();


				String path = getServletContext().getRealPath("/images/google_logo.png");
				// byte�迭�� ��ȯ�ؾ߸� blob���� �÷��� ������ �� �ִ�.
				ByteArrayOutputStream bout = new ByteArrayOutputStream();
				FileInputStream fin = new FileInputStream(path);

				
				
				pstmt.setString(2, b);
			

			} catch (Exception e) {
				e.printStackTrace();
			}
			
*/
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
