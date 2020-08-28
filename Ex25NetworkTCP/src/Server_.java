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
		//TCP[Transmission control Protocol]���
		//IP�ּҸ� �˾ƾ� ��Ű���
		//�ڹٿ��� ����PC�� IP�ּ� �������� �����ϴ� Ŭ���� : InetAddress			
		try {//	����IP�ּ� Ȯ�����ִ� �ڵ妤	�̸�,���� ��ǻ�� IP�ּҦ�
			System.out.println(InetAddress.getLocalHost());
		} catch (UnknownHostException e) {}
		//1. IP�ּ� - ��ǻ���� �����ּ�(����) : 42�ﰳ (in IPv4)
		//2. port��ȣ - ��ǻ�;� ���α׷� �з���ȣ(65000��) : 0~1024������ ���X	
		//����� ���α׷��� ��ġ�� �ʱ�����		*)�λ���(IP��ȣ), n�� �ױ�(port��ȣ)
		
		//****���� ���α׷� ����
		//��1. ��������(������������ �����Ҽ� �ִ� �÷�����,������ �Ŵ� ��ġ)
		//�������ϱ��ۼ��� �����Ӱ� ���� ����/Ŭ���̾�Ʈ���� ���ϱ���)->������ �����		
		try {								//port��ȣ ������
			ServerSocket serverSocket=new ServerSocket(10002);
			System.out.println("�������� ����");
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� ��");
			
			//��2. Ŭ���̾�Ʈ�� �����Ҷ� ���� Ŀ�� ���-Ŭ���̾�Ʈ�� �����ϸ�  Socket�� ����
			Socket socket=serverSocket.accept();
			System.out.println("NOWŬ���̾�Ʈ ����");
			
			//��3. �����͸� �ޱ� ���� �������ε�(InputStream) OPEN
			InputStream is=socket.getInputStream();//Byte Stream-1��
			//Byte Stream is�� String Stream���� ��ȯ 
			InputStreamReader isr=new InputStreamReader(is);//�ѱ��ھ�
			BufferedReader reader=new BufferedReader(isr);//���� Stream
			
			//��4. stream�� �̿��ؼ� ������ �б�
			while(true) {
				String msg=reader.readLine();//���پ�-msg���������� Ŀ�� ��ٸ�
				if(msg==null) break;
				System.out.println("recieved Messege : "+msg); }
			
			//��5.������ �ޱⰡ �������� Stream �ݱ�
			reader.close();//�Ѳ����� �� �ٴ���
		} catch (IOException e) {System.out.println("�������");}
		
	}
	

}