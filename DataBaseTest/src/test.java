
public class test {
	public static void main(String[] args) {
		DBCon1 m = new DBCon1();
		
		m.DBconnection();
	 	m.DBTableSelect("dream_img");
	 	m.DBTableSelectAll("user_info");
	 	
	 	
		
	}
}
