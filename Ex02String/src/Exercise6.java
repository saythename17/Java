import java.util.Scanner;
public class Exercise6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		while(true) {
		System.out.print("���� �ּ� �Է�(@����) : ");
		String mail=scan.next();
		System.out.println();
		boolean filter=mail.contains("@");
		boolean filter2=mail.contains(".");
		if (filter==true && filter2==true) {
			String[] arr=mail.split("@");
			System.out.println("�Էµ� �����ּҸ� : "+arr[0]);	
			System.out.println("���ϼ��� �̸� : "+arr[1]);	
				break;}//if
		else System.out.println(" [�߸� �Է��ϼ̽��ϴ�. @���� ���ϼ����ּұ��� ��� �Է��ϼž� �մϴ�.]" );
		System.out.println();
	}}//while,main

}//class

