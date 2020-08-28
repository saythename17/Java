import java.util.Scanner;
public class control1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a=1;
		while(a<n+1)
		{
			System.out.print(a*3+" ");
			a++;
		}
	}

}
