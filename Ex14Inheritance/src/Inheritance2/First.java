package Inheritance2;

public class First {
	int a;//First의 멤버변수
	//본인 멤버변수 값을 출력하는 기능 메소드
	void showFirst() { System.out.println("a : "+a); }
	
	//본인 필드를 입력해주는 메소드
	void setA(int a) { this.a=a; }
}


class Second extends First{
	//상속받은 First의 멤버를 보유한 상태 
	int b;//Second의 멤버변수

	//상속받은 멤버변수를 포함 본인멤버변수 값 출력 메소드		
	void show() {
		showFirst();//super 멤버메소드 내것처럼 사용가능
		System.out.println("b : "+b);//본인 멤버만 직접출력
	}

	//멤버변수에 값을 대입해주는 메소드
	void setMember(int a, int b) {
//		this.a=a;//멤버변수에 전달받은 매개변수 대입
		//this참조변수 : 본인 객체 지칭
		//but a는 엄연히 First의 멤버-구분필요
		//명시적으로 parent객체의 field임을 밝히도록
//		super.a=a;//상속받은 parent 객체 지칭
		//참조변수 this와 super는 선언하지 않아도 자동으로 생성되어있음
		//but super의 값을 sub가 지정해주는 것도 객체지향적이지 않음
		setA(a);//== super.setA(a);
		this.b=b;
	}
}
