
import java.util.Scanner;
import java.util.Random;
public class Main {
	
	public static void main(String[] args) {      
		//키보드 입력을 자료형에 맞게 받을 수 있는 녀석
		//            ┌객체(에어컨) 
		Scanner scan=new Scanner(System.in);
		//       └참조변수(byte), 리모콘 /
		int num=scan.nextInt();
		System.out.println(num);
		
		//랜덤값을 만들어주는 능력을 가진  Random객체
		Random rnd=new Random();
		int n=rnd.nextInt();
		System.out.println(n);//int안(-21억~21억까지)의 랜덤값
		int n2=rnd.nextInt(10);//0~9까지의 범위안 10개숫자중 하나의 랜덤값
		System.out.println(n2);//지정한 범위내 무조건 양수값 출력
		int n3=rnd.nextInt(6)+5;//5~10까지의 특정한 범위의 랜덤값
		System.out.println(n3);
		double n4=rnd.nextInt();// 0.0~0.999999…까지
		System.out.println(n4);
		double n5=rnd.nextInt() * 100;//10.0~99.999…
		System.out.printf("%.2f",n5);
		
		
		
		
		
		
		
		//키보드입력을 자료형에 맞게 변황해주는 기능을 가진 Scanner객체
		//new로 객체를 생성 후 사용
		/*
		 * Scanner scan = new Scanner(System.in);//참조변수(4byte)로제어 //한문자입력은 없으나 문자열 입력은
		 * 가능 //String scan1=scan.next(); //char ch=scan1.charAt(0);//0번째 숫자 출력
		 * //System.out.println(ch); String blank=scan.nextLine();//엔터를 입력할때까지 입력 (띄어쓰기
		 * 가능) System.out.println(blank);
		 */
	}

}
