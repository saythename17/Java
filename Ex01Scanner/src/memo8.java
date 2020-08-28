import java.util.Scanner;
public class memo8 {
	public static void main(String[] args) {
		System.out.print("원의 반지름 입력 : ");
		Scanner scan=new Scanner(System.in);
		double r=scan.nextDouble();
		double area=3.14*r*r;
		System.out.println("원의 면적 : "+area);
		
	}

}
