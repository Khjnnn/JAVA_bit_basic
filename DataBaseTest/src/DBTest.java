import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.sql.Statement;
 
public class DBTest {

static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; // jdbc 드라이버 주소 
static final String DB_URL = "jdbc:mysql://10.10.10.109:3306/dream?useSSL=false";// DB 접속 주소
 //localhost는 접속하려는 데이터베이스 주소를 입력하시면 됩니다. localhost를 사용하면 됩니다. 
 
static final String USERNAME = "root"; //DB ID 
static final String PASSWORD = "1234"; //DB Password 
	public static void main(String[] args) { // MySql에 사용하는여러 객체를 만들어줍니다. 
		Connection conn = null; 
		Statement stmt = null; 
		ResultSet rs = null; 
		System.out.print("User Table 접속 : "); 

		try { 
	Class.forName(JDBC_DRIVER); 
	//	Class 클래스의 forName()함수를 이용해서 해당 클래스를 메모리로 로드 하는 것입니다. 
	//URL, ID, password를 입력하여 데이터베이스에 접속합니다. 
	conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD); // 접속결과를 출력합니다. 
	if (conn != null){
		System.out.println("성공");
		} else{
			System.out.println("실패");
		} 
	} catch (ClassNotFoundException e) {
		System.out.println("Class Not Found Exection"); 
		e.printStackTrace(); 
	} catch (SQLException e) {
		System.out.println("SQL Exception : " + e.getMessage()); e.printStackTrace(); 
	}
	
 }
}


