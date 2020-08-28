import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 객체지향 Programming (OOP: Object Oriented Programming)
		// 객체: 고유한 기능(동작:함수)과 값(데이터)를 함께 가진 녀석
		//	  : ([Field]변수+[Method]함수)
		//bit-byte-word- Filed:의미 있는 데이터의 묶음
		//ex1) Random : 임의의 값을 만들어내는 능력을 가진 녀석
		//ex2) Scanner : 키보드의 입력을 자료에 맞게 받아주는 능력을 가진 녀석
		//ex3) String : 문자열을 관리하는 능력을 가진 녀석
		// Class : 각 객체의 능력을 구분하는 명칭,즉 객체의 종류
		//(변수의 종류-자료형)---(객체의 종류-class)
		//in Java- 클래스가 기능별로 약 4000개 라이브러리에 저장되어 있음
		//클래스를 사용하려면? 객체를 만들어서 사용해야함
		// ex1) Random 객체 생성
		Random rnd=new Random();
		int n=rnd.nextInt();//Method 호출 (객체의 기능 사용)
		//자바는 이러한 객체들을 필요할때 불러 사용하는 방식으로 프로그래밍
		//★4000여개의 클래스를 얼마나 적재적소에 사용하느냐가 관건
		//Java System API(Application Interface) : 
		//     └ ==(Java System Library) : 자바의 약 4000여개의 class
		//but 개발자가 원하는 모든 기능을 가지고 있을 수 없음
		// ∴ 프로그래머가 고유한 기능을 가진 클래스를 새로 만들어야함
		//사용자 정의 자료형 : 프로그래머가 만든 class(4001번째 class)
		class Robot{
			void move() {}
			void arrack() {}
		}//클래스 생성
		Robot r=new Robot();//객체 생성후 사용
		r.arrack();
		r.move();
		
		//사용자 정의 클래스를 만드는 방법
		//클래스를 만드는 것 : 설계도면을 짠 것
		//만든 클래스로 객체를 생성해서 사용 → 객체지향
		
		//클래스를 만드는 위치
		//★★★1)별도의 .Java문서에 class를 정의
		//2)같은 .Java문서에 여러개의 class 정의
		//3)다른 class안에 class 설계(작성)
		//4)Method(함수)안에서 class설계
		//**클래스이름은 문서이름과 같아야함
		//bin:binary 2진수
		
		/*1)*/
		Second s=new Second();
		s.a=10;
		s.show();
		Third t=new Third();
		t.show();
		System.out.println();
		
		/*2)*/
		Test test=new Test();
		test.show();
		
		/*3)*/
		//Third.Inner in =new Third.Inner();//ERROR 
		//outer class가 아닌 곳에서 객체 생성 불가

		
	}

}
