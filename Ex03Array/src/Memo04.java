import java.util.Scanner;

public class Memo04 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] array= new int[10];
		while(true) {
			System.out.print("좌석을 예약하시겠습니까( 1(Y) 또는 0(N) )? : ");
			int check =scan.nextInt();
			if (check==0) {System.out.println("예약을 종료합니다. "); break;}
			else {
				System.out.println(" 현재의 예약 상태는 다음과 같습니다.");
				System.out.println(" -----------------------");
				System.out.println(" 좌석 번호 :  1  2  3  4  5  6  7  8  9  10");
				System.out.println(" -----------------------");
				System.out.print(" 예약 상태 :  ");
				for (int i:array)System.out.print(i+"  ");
				System.out.println();
				while(true) {
				System.out.print(" 몇번째 좌석을 예약하시겠습니까? : ");
				int sit=scan.nextInt();
				if(array[sit-1]!=0) System.out.println(" 죄송합니다. 이미 예약된 좌석입니다. 다른 좌석을 선택해 주세요."+"\n");
				else {
					array[sit-1]=1;
					System.out.println("  "+sit+"번 좌석 예약되었습니다."); System.out.println(); break;}
				
				}
				
			}
			
		}
	}

}
