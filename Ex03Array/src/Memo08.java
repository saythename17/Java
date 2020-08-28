import java.util.Scanner;

public class Memo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String[] st=new String[n];
		for(int i=0;i<st.length;i++) {
			st[i]=scan.next();
		}
		
		for(String each:st) {
			
			System.out.println(each);
			
		}
		
		

	}

}
