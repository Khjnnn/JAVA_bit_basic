package Day1119;

import java.net.InetAddress;
// URL (Uniform Resource Location)
/* 
 * 
 */

public class Ex04 {
	public static void main(String[] args) {
	
		try {
			InetAddress ip = InetAddress.getByName("www.naver.com");
			InetAddress ip2 = InetAddress.getLocalHost();
			//��Ʈ������ ����Ʈ�� > 
			byte[] A = {};
			InetAddress ip3 = InetAddress.getByAddress(A);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

