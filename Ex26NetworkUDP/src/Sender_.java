import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Sender_ {
	public static void main(String[] args) {
		//UDP : User Data Program ≒ 편지부치기, 택배보내기		
		try {
			//★1)우편 보낼 우체통만들기
			DatagramSocket socket=new DatagramSocket();
			//보낼 데이터 키보드로 입력받기
			Scanner scan=new Scanner(System.in);
			System.out.print("send message: ");
			String msg=scan.nextLine();
			
			//★2)데이터를 우편으로 보내기 위해 우편박스(DatagramPacket)에 넣기
			InetAddress add= InetAddress.getByName("192.168.0.143");
			//└받는 사람 주소
			//상자에 [IP주소, port번호] 작성		보낼데이터-바이트배열로  ┐
			DatagramPacket packet=new DatagramPacket(msg.getBytes(),
					msg.getBytes().length/*보낼데이터 길이*/,
					add/*주소*/,10003/*port번호*/);			
			//★3)우체통에 우편박스 보내기
			socket.send(packet);
			System.out.println("Complete");
		} catch (SocketException e) {} catch (UnknownHostException e) {} catch (IOException e) {}
	}

}
