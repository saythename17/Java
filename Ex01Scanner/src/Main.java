
import java.util.Scanner;
import java.util.Random;
public class Main {
	
	public static void main(String[] args) {      
		//Ű���� �Է��� �ڷ����� �°� ���� �� �ִ� �༮
		//            ����ü(������) 
		Scanner scan=new Scanner(System.in);
		//       ����������(byte), ������ /
		int num=scan.nextInt();
		System.out.println(num);
		
		//�������� ������ִ� �ɷ��� ����  Random��ü
		Random rnd=new Random();
		int n=rnd.nextInt();
		System.out.println(n);//int��(-21��~21�����)�� ������
		int n2=rnd.nextInt(10);//0~9������ ������ 10�������� �ϳ��� ������
		System.out.println(n2);//������ ������ ������ ����� ���
		int n3=rnd.nextInt(6)+5;//5~10������ Ư���� ������ ������
		System.out.println(n3);
		double n4=rnd.nextInt();// 0.0~0.999999������
		System.out.println(n4);
		double n5=rnd.nextInt() * 100;//10.0~99.999��
		System.out.printf("%.2f",n5);
		
		
		
		
		
		
		
		//Ű�����Է��� �ڷ����� �°� ��Ȳ���ִ� ����� ���� Scanner��ü
		//new�� ��ü�� ���� �� ���
		/*
		 * Scanner scan = new Scanner(System.in);//��������(4byte)������ //�ѹ����Է��� ������ ���ڿ� �Է���
		 * ���� //String scan1=scan.next(); //char ch=scan1.charAt(0);//0��° ���� ���
		 * //System.out.println(ch); String blank=scan.nextLine();//���͸� �Է��Ҷ����� �Է� (����
		 * ����) System.out.println(blank);
		 */
	}

}
