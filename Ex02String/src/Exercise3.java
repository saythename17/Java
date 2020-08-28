import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String love=scan.next();
		char ch=love.charAt(0);
		for(int i=0;i<love.length();i++) {			
			if(love.charAt(i)>ch)ch=(love.charAt(i));
		}
		System.out.println(ch);
	}

}
