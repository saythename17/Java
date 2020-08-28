package Inheritance2;

public class Main {

	public static void main(String[] args) {
		// 상속받은 클래스들의 관계 용어 (이론적으로는 상위 클래스 - 하위클래스)
		//[C++ : Base - Derived]
		//[Java : Super - Sub]
		//[C# : Parent - Child]
		
		Second s=new Second();
		s.a=10;//상속받은 클래스 객체의 멤버를 내것인양 사용
		//상속받은 클래스의 객체를 (메모리적으로)가지고 있음
		s.b=20;

		//객체지향의 모티브 : 멤버제어 기능을 스스로 하도록
		s.show();
		System.out.println();
		
		//멤버변수 입력 메소드
		s.setMember(100, 200);
		s.show();
		System.out.println();
		
	}

}
