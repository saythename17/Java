import java.util.Scanner;
public class Operator2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("left upside point x : ");
		int xl=scan.nextInt();
		System.out.print("left upside point y : ");
		int yl=scan.nextInt();
		System.out.print("right under point x : ");
		int xr=scan.nextInt();
		System.out.print("right under point y : ");
		int yr=scan.nextInt();
		System.out.println("The double-pointed rectangular width : "+((xr-xl)*(yr-yl)));
		
	}

}