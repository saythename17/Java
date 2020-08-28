import java.util.Scanner;
public class Operate1 {
	public static void main(String[] args) {
		System.out.print("πﬁ¿∫ µ∑ : ");
		Scanner scan=new Scanner(System.in);
		int cash=scan.nextInt();
		System.out.print("ªÛ«∞ ∞°∞› : ");
		int price=scan.nextInt();
		System.out.println();
		System.out.println("∫Œ∞°ºº : "+price/10+"\n"+"¿‹µ∑ : "+(cash-(price+price/10)));
	}

}
