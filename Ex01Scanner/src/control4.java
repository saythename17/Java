import java.util.Scanner;
public class control4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		for(int i=9;i>0;i--)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}

}
