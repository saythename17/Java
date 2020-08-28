import java.util.Scanner;
public class control6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int total=0;
		for(int i=0;i<5;i++) {
			System.out.print("정수 입력 : ");
			int n=scan.nextInt();
			if(n<=1) {
				i--;
				System.out.println("잘못입력하셨습니다. 다시 입력해 주세요");
				continue;
			}
			total+=n;
		}
		System.out.println("총합 : "+total);
	}
	

}
