

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
        String root = request.getSession().getServletContext().getRealPath(fsl)+"/upload"; //웹서버 컨테이너 정보
	    System.out.println("루트경로: " + root);
        //업로드 폴더에 파일 업로드
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
		}catch(Exception e) {} 
	Enumeration files = multi.getFileNames();
	
	
	// 파일명만 가져온다 
	String file1 = (String)files.nextElement();
	
	//multi에서 해당 이름을 알려주고 실제 시스템상 명칭 알아냄( 리얼네임 )
	fileName1 = multi.getFilesystemName(file1);
	
	//multi에서 알고있는 파일 원본이름을 파일1을 통해 알아냄(사용자가 올린 파일명) 
	originalName1 = multi.getOriginalFileName(file1);

	System.out.println("파일명 : " + originalName1);

	System.out.println("실제파일명 : " + fileName1 );
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
				rs = stmt.executeQuery(query_select); // 인덱스 카운트 
				a = Integer.valueOf(String.valueOf(rs)); // 인덱스 갯수 계산
				a++;
				b = String.valueOf(a);
				pstmt = conn.prepareStatement(SQL);
				pstmt.setString(1, b);
				pstmt.setString(2, uploadDir);
				pstmt.executeUpdate();


				String path = getServletContext().getRealPath("/images/google_logo.png");
				// byte배열로 변환해야만 blob형의 컬럼에 저장할 수 있다.
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
