import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.sql.Statement;
 
public class DBTest {

static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; // jdbc ����̹� �ּ� 
static final String DB_URL = "jdbc:mysql://10.10.10.109:3306/dream?useSSL=false";// DB ���� �ּ�
 //localhost�� �����Ϸ��� �����ͺ��̽� �ּҸ� �Է��Ͻø� �˴ϴ�. localhost�� ����ϸ� �˴ϴ�. 
 
static final String USERNAME = "root"; //DB ID 
static final String PASSWORD = "1234"; //DB Password 
	public static void main(String[] args) { // MySql�� ����ϴ¿��� ��ü�� ������ݴϴ�. 
		Connection conn = null; 
		Statement stmt = null; 
		ResultSet rs = null; 
		System.out.print("User Table ���� : "); 

		try { 
	Class.forName(JDBC_DRIVER); 
	//	Class Ŭ������ forName()�Լ��� �̿��ؼ� �ش� Ŭ������ �޸𸮷� �ε� �ϴ� ���Դϴ�. 
	//URL, ID, password�� �Է��Ͽ� �����ͺ��̽��� �����մϴ�. 
	conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD); // ���Ӱ���� ����մϴ�. 
	if (conn != null){
		System.out.println("����");
		} else{
			System.out.println("����");
		} 
	} catch (ClassNotFoundException e) {
		System.out.println("Class Not Found Exection"); 
		e.printStackTrace(); 
	} catch (SQLException e) {
		System.out.println("SQL Exception : " + e.getMessage()); e.printStackTrace(); 
	}
	
 }
}

