import java.util.Scanner;
public class Exercise2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		String a=scan.next();
		
		String b=""; 
		for (int i=a.length()-1;i>=0;i--) {
			char ch=a.charAt(i); 
			b+=ch+""; 
			}
		 
		System.out.println(a);
		System.out.println(b);
	}

}
