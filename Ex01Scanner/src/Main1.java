import java.util.Random;
import java.util.Scanner;
public class Main1 {
	//��ǻ�Ͱ� ���� ������ ���ڸ� ����ڰ� Ű����� ���� �Է��Ͽ� ������ ���ߴ� ����
	//���� ������(0~9)
	public static void main(String[] args) {
		//���� �����
		Random rnd=new Random();
		int com=rnd.nextInt(10);
				
		Scanner scan=new Scanner(System.in);
		while(true) {
		System.out.print("Input : ");
		int user=scan.nextInt();
		
		//���䰪�� ��
		if (user > com)	System.out.println(user + "���� ����");
		else if(user < com)	System.out.println("���� ŭ");
		else {System.out.println("���� ����");break;}

		}//while�� ��
	}
}
