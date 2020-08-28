import java.util.Scanner;
public class Operator3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a=scan.nextInt();
		if (a>=0) System.out.println("절대값 : "+a);
		else System.out.println(-a);
	}

}
