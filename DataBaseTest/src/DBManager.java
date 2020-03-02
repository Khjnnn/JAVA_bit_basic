import java.sql.*;

public class DBManager {
	DBManager(){
		
	}
	
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Boolean connect = false;

	public boolean DBconnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dream", "root", "1234");
			System.out.println(conn + ": DB connect");
			return true;
		} catch (Exception e) {
			System.out.println("DB connect ");
			return false;
		}
	} //
	
	public boolean DBTableCreate(String tableName) {

		String query_create = "create table" + tableName + "("
				+ "id int not null auto_increment primary key,"
				+ "name varchar(10)" + ")";
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(query_create);
			System.out.println("만들기성공");
			return true;
		} catch (Exception e) {
		} return false;

	}

}
