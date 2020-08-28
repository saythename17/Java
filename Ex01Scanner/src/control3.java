import java.util.Scanner;
public class control3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int total=0;
		while(true) {
			int n=scan.nextInt();	
			if(n==0)break;
			total+=n;
		}
			System.out.println(total);
	}

}
