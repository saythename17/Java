import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Reciever_ {
	public static void main(String[] args) {
		//��1) Datagram(����)�� ���� ��ü��(DatagramSocket) �غ�
		try {									//port��ȣ��
			DatagramSocket socket=new DatagramSocket(10003);
			
			//��2)���� ������(data)�� ������ �ִ� �ڽ�(DatagramPacket)�غ�
			//�� byte�迭 ����
			byte[] buf=new byte[1024];//1024-�����ִ� �������
			DatagramPacket packet=new DatagramPacket(buf, buf.length);			
			System.out.println("waiting message...");
			//�޼���(data)�� �޾� Packet �� buf�迭�� �ֱ�
			socket.receive(packet);//��޼��� ���������� Ŀ���� ���⼭ ���
			
			//byte[](buf)��String ��ȯ
			String s=new String(buf);
			System.out.println("received message : "+s);
		} catch (SocketException e) {} catch (IOException e) {}

	}

}