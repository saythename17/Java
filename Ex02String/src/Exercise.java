import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		System.out.print("���ܾ� �Է� : ");
		Scanner scan=new Scanner(System.in);
		String word=scan.next();
		for (int i=0;i<word.length();i++) {
			char a=word.charAt(i);
			int b=a+1;
			System.out.println((char)b);
			}
		}
}