import java.util.Scanner;
public class memo7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("마일을 입력하시오 : ");
		int mile = scan.nextInt();
		System.out.println(mile+"마일은 "+mile*1.609+"킬로미터 입니다.");
	}

}
