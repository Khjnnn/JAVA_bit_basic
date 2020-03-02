import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCon1 {
	
	
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Boolean connect = false;
	
	DBCon1(){
		
	}
	public boolean DBconnection() { // DB 연결 메소드 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://10.10.10.109:3306/dream", "user", "1234");
			System.out.println(conn + ": DB connect ok");
			return true;
		} catch (Exception e) {
			System.out.println("DB connect fail");
			return false;
		}
	} // 메소드 종료


	
	public boolean DBTableSelectAll(String tableName) { // DB 테이블명입력 셀렉트문 (회원정보) 
		String query_select = "select * from " + tableName;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query_select);
			while(rs.next()){
			System.out.println("index : " + rs.getString(1));
			System.out.println("id : " + rs.getString(2));
			System.out.println("pw : " + rs.getString(3));
			System.out.println("nickname : " + rs.getString(4));

			}
			
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public boolean DBTableSelect(String tableName) { // DB 셀렉트문 (테이블명)
		String query_select = "select * from dream."+tableName;	
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query_select); //셀렉트 문에만
			while(rs.next()){
			System.out.println(" index: "+ rs.getString(1));
			System.out.println(" path: " + rs.getString(3)); //속성순서 맞게 변경 수정 
			}
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} 
	}
	
	
	
	
	public boolean DBTableCreate(String tableName) { // DB생성문 (생략) 

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


