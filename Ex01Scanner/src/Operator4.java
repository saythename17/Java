import java.util.Scanner;
public class Operator4 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a =scan.nextInt();
	int b =scan.nextInt();
	int c =scan.nextInt();
	int total=a+b+c;
	int max=(a>b && a>c)?a:(b>c)?b:c;
	int min=(a<b && a<c)?a:(b<c)?b:c;
	System.out.println("�� : "+total+"\t"+"��� : "+(total/3));
	System.out.println("�ִ밪 : "+max);
	System.out.println("�ּҰ� : "+min);
}
}
