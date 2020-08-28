import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client_ {
	public static void main(String[] args) {
		//Ŭ���̾�Ʈ�� ������ IP�ּҿ� port��ȣ�� �˾ƾ� ���� ����
		String  serverIP="192.168.0.143";
		serverIP="127.0.0.1";//loop back : ���� PC�� ��Ī�ϴ� Ư���� IP�ּ�
		serverIP="localhost";//������Ī/IP�ּҸ� ���ڷ� �ٲ� �ּ� : ������ �ּ�
		
		//***Ŭ���̾�Ʈ �۾�
		//��1. ������ ������ Socket����(IP�ּ�, port��ȣ)
		try {
			Socket socket= new Socket(serverIP,10002);
			System.out.println("������ ���� ����");
			
			//��2. ������ �����͸� ������ ���� Stream(���Ӵ�)����
			//�����͸� �������� ���Ӵ�(Socket)���� �������ε�(OutputStream)���¸��
			OutputStream os=socket.getOutputStream();
			//OutputStream:�����͸� byte������ ����-���ڿ��� ������ ����
			//�� ���� ��Ʈ�� PrintWriterȰ��
			PrintWriter writer=new PrintWriter(os,true);
			System.out.println("Successful Stream Connect"); 
			//���� �����͸� Ű����� �Է¹ޱ�
			Scanner scan=new Scanner(System.in);
			while(true) {
				System.out.print("send messege : ");
				String msg=scan.nextLine();
				if(msg.equalsIgnoreCase("Bye")) break;
				
				//��3. stream�� ���� ������ ����
				writer.println(msg);//�� System.out.println();
				writer.flush();		
			}		
			//��4. ���������۳�����  Stream�ݱ� (�丣�������κ����� �������ν�Ʈ�ݱ�)
			writer.close();
			System.out.println("�޼��� ���� �Ϸ�");
		} catch (UnknownHostException e) {
			System.out.println("�����ּ� �̻�,IP�ּҰ� ���ų��߸���");
		} catch (IOException e) {
			System.out.println("������ ��� �Ұ�");
		}
		
		

	}

}
