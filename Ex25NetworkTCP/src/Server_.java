import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server_ {
	public static void main(String[] args) {
		//TCP[Transmission control Protocol]통신
		//IP주소를 알아야 통신가능
		//자바에서 본인PC의 IP주소 관련정보 관리하는 클래스 : InetAddress			
		try {//	본인IP주소 확인해주는 코드┐	이름,본인 컴퓨터 IP주소┐
			System.out.println(InetAddress.getLocalHost());
		} catch (UnknownHostException e) {}
		//1. IP주소 - 컴퓨터의 고유주소(숫자) : 42억개 (in IPv4)
		//2. port번호 - 컴퓨터안 프로그램 분류번호(65000개) : 0~1024까지는 사용X	
		//→기존 프로그램과 겹치지 않기위해		*)부산항(IP번호), n번 항구(port번호)
		
		//****서버 프로그램 구현
		//●1. 서버소켓(서버에연결해 접속할수 있는 플러그잭,랜선을 꼽는 장치)
		//서버소켓구멍수는 자유롭게 구현 가능/클라이언트에서 소켓구현)->서버에 연결됨		
		try {								//port번호 지정┐
			ServerSocket serverSocket=new ServerSocket(10002);
			System.out.println("서버소켓 생성");
			System.out.println("클라이언트의 접속을 기다리는 중");
			
			//●2. 클라이언트가 접속할때 까지 커서 대기-클라이언트가 접속하면  Socket을 리턴
			Socket socket=serverSocket.accept();
			System.out.println("NOW클라이언트 접속");
			
			//●3. 데이터를 받기 위한 무지개로드(InputStream) OPEN
			InputStream is=socket.getInputStream();//Byte Stream-1씩
			//Byte Stream is를 String Stream으로 변환 
			InputStreamReader isr=new InputStreamReader(is);//한글자씩
			BufferedReader reader=new BufferedReader(isr);//보조 Stream
			
			//●4. stream을 이용해서 데이터 읽기
			while(true) {
				String msg=reader.readLine();//한줄씩-msg받을때까지 커서 기다림
				if(msg==null) break;
				System.out.println("recieved Messege : "+msg); }
			
			//●5.데이터 받기가 끝났으니 Stream 닫기
			reader.close();//한꺼번에 싹 다닫힘
		} catch (IOException e) {System.out.println("통신종료");}
		
	}
	

}
