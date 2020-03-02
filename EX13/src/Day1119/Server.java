package Day1119;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {

	public static void main(String[] args) {
		try {
		DatagramSocket socket = new DatagramSocket(7777);
		DatagramPacket inPacket, outPacket;
		
		byte[] inMsg = new byte[10];
		byte[] outMsg = "하이하이".getBytes();
		
		while(true) {
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			System.out.println("inMsg " + new String(inMsg));
			socket.receive(inPacket);
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			outPacket = new DatagramPacket(outMsg, outMsg.length, address,port);
			socket.send(outPacket);
		}
		}catch(Exception e)
		{
			
		}
	}
	
}