import java.util.Scanner;
public class Operate1 {
	public static void main(String[] args) {
		System.out.print("���� �� : ");
		Scanner scan=new Scanner(System.in);
		int cash=scan.nextInt();
		System.out.print("��ǰ ���� : ");
		int price=scan.nextInt();
		System.out.println();
		System.out.println("�ΰ��� : "+price/10+"\n"+"�ܵ� : "+(cash-(price+price/10)));
	}

}
