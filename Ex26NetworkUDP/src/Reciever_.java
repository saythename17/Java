import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Reciever_ {
	public static void main(String[] args) {
		//★1) Datagram(우편)을 받을 우체통(DatagramSocket) 준비
		try {									//port번호┐
			DatagramSocket socket=new DatagramSocket(10003);
			
			//★2)받은 우편물(data)을 담을수 있는 박스(DatagramPacket)준비
			//빈 byte배열 생성
			byte[] buf=new byte[1024];//1024-여유있는 사이즈로
			DatagramPacket packet=new DatagramPacket(buf, buf.length);			
			System.out.println("waiting message...");
			//메세지(data)를 받아 Packet 안 buf배열에 넣기
			socket.receive(packet);//←메세지 받을때까지 커서는 여기서 대기
			
			//byte[](buf)→String 변환
			String s=new String(buf);
			System.out.println("received message : "+s);
		} catch (SocketException e) {} catch (IOException e) {}

	}

}
