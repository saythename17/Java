import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client_ {
	public static void main(String[] args) {
		//클라이언트는 서버의 IP주소와 port번호를 알아야 접속 가능
		String  serverIP="192.168.0.143";
		serverIP="127.0.0.1";//loop back : 본인 PC를 지칭하는 특별한 IP주소
		serverIP="localhost";//본인지칭/IP주소를 문자로 바꾼 주소 : 도메인 주소
		
		//***클라이언트 작업
		//●1. 서버와 연결할 Socket생성(IP주소, port번호)
		try {
			Socket socket= new Socket(serverIP,10002);
			System.out.println("서버와 연결 성공");
			
			//●2. 서버에 데이터를 보내기 위한 Stream(해임달)생성
			//데이터를 내보내는 해임달(Socket)에게 무지개로드(OutputStream)오픈명령
			OutputStream os=socket.getOutputStream();
			//OutputStream:데이터를 byte단위로 보냄-문자열을 보내기 불편
			//∴ 보조 스트림 PrintWriter활용
			PrintWriter writer=new PrintWriter(os,true);
			System.out.println("Successful Stream Connect"); 
			//보낼 데이터를 키보드로 입력받기
			Scanner scan=new Scanner(System.in);
			while(true) {
				System.out.print("send messege : ");
				String msg=scan.nextLine();
				if(msg.equalsIgnoreCase("Bye")) break;
				
				//●3. stream을 통해 데이터 전송
				writer.println(msg);//≒ System.out.println();
				writer.flush();		
			}		
			//●4. 데이터전송끝나면  Stream닫기 (토르를지구로보내고 바이프로스트닫기)
			writer.close();
			System.out.println("메세지 전송 완료");
		} catch (UnknownHostException e) {
			System.out.println("서버주소 이상,IP주소가 없거나잘못됨");
		} catch (IOException e) {
			System.out.println("서버와 통신 불가");
		}
		
		

	}

}
