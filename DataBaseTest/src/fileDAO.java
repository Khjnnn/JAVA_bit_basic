import java.sql.*;

public class fileDAO {
	private Connection conn;
			Statement stmt = null;

	public fileDAO() {
		try {
			String dbURL = "jdbc:mysql://10.10.10.109:3306/dream";
			String dbID = "user";
			String dbPW = "1234";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPW);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
