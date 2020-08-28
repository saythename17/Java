import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Sender_ {
	public static void main(String[] args) {
		//UDP : User Data Program �� ������ġ��, �ù躸����		
		try {
			//��1)���� ���� ��ü�븸���
			DatagramSocket socket=new DatagramSocket();
			//���� ������ Ű����� �Է¹ޱ�
			Scanner scan=new Scanner(System.in);
			System.out.print("send message: ");
			String msg=scan.nextLine();
			
			//��2)�����͸� �������� ������ ���� �����ڽ�(DatagramPacket)�� �ֱ�
			InetAddress add= InetAddress.getByName("192.168.0.143");
			//���޴� ��� �ּ�
			//���ڿ� [IP�ּ�, port��ȣ] �ۼ�		����������-����Ʈ�迭��  ��
			DatagramPacket packet=new DatagramPacket(msg.getBytes(),
					msg.getBytes().length/*���������� ����*/,
					add/*�ּ�*/,10003/*port��ȣ*/);			
			//��3)��ü�뿡 �����ڽ� ������
			socket.send(packet);
			System.out.println("Complete");
		} catch (SocketException e) {} catch (UnknownHostException e) {} catch (IOException e) {}
	}

}