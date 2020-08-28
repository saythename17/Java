import java.util.Random;
import java.util.Scanner;
public class Main1 {
	//컴퓨터가 만든 랜덤한 숫자를 사용자가 키보드로 값을 입력하여 정답을 맞추는 게임
	//숫자 스무고개(0~9)
	public static void main(String[] args) {
		//정답 만들기
		Random rnd=new Random();
		int com=rnd.nextInt(10);
				
		Scanner scan=new Scanner(System.in);
		while(true) {
		System.out.print("Input : ");
		int user=scan.nextInt();
		
		//정답값과 비교
		if (user > com)	System.out.println(user + "보다 작음");
		else if(user < com)	System.out.println("보다 큼");
		else {System.out.println("ㅊㅋ 정답");break;}

		}//while문 끝
	}
}
