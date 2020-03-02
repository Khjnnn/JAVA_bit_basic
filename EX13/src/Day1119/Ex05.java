package Day1119;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
// TCP 통신 : 주소값 / 포트:7777
//  
public class Ex05 {
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(7777);
			InetAddress serverAddress = InetAddress.getByName("10.10.10.112");
			byte[] msg = new byte[500];
			
			DatagramPacket outPacket = new DatagramPacket(msg,1,serverAddress,7777);
			DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
			
			socket.send(outPacket);
			socket.receive(inPacket);
			System.out.println("intpacket: "+new String(inPacket.getData()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
