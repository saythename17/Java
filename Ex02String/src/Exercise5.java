import java.util.Scanner;
public class Exercise5 {
	public static void  main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 자리 입력(3자리) : ");
		String first;
		do {
			first = scan.next();
			if (first.length()!=3) System.out.println("[잘못 입력하셨습니다. 3자리의 숫자만 입력가능합니다.]");
		}while(first.length()!=3);
		System.out.print("두번째 자리 입력(3~4자리) : ");
		String second;
		do {
			second = scan.next();
			if (second.length()<3 || second.length()>4) System.out.println("[잘못 입력하셨습니다. 3~4자리의 숫자만 입력가능합니다.]");
		}while(second.length()<3 || second.length()>4);
		System.out.print("세번째 자리 입력(4자리) : ");
		String third;
		do {
			third = scan.next();
			if (third.length()!=4) System.out.println("[잘못 입력하셨습니다. 4자리의 숫자만 입력가능합니다.]");
		}while(third.length()!=4);
		System.out.println();
		System.out.println("입력된 전화번호는  ["+first+"-"+second+"-"+third+"] 입니다.");
	}

}
