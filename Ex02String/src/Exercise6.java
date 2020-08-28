import java.util.Scanner;
public class Exercise6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		while(true) {
		System.out.print("메일 주소 입력(@포함) : ");
		String mail=scan.next();
		System.out.println();
		boolean filter=mail.contains("@");
		boolean filter2=mail.contains(".");
		if (filter==true && filter2==true) {
			String[] arr=mail.split("@");
			System.out.println("입력된 메일주소명 : "+arr[0]);	
			System.out.println("메일서버 이름 : "+arr[1]);	
				break;}//if
		else System.out.println(" [잘못 입력하셨습니다. @포함 메일서버주소까지 모두 입력하셔야 합니다.]" );
		System.out.println();
	}}//while,main

}//class

