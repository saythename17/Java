
public class Initial {
	//자바 객체 초기화 단계 (필드를 메모리에 초기화하는 순서)
	//1.기본값 초기화 - 필드 ←0에 해당하는 값
	//int a; → a=0 
	
	//2. 명시적 초기화(생성자를 안쓰고도(인스턴트 생성 X) 미리 초기값 부여)
	//       └실행문 쓰기 불가,대입만 가능
	int a=10;
	
	//3. 초기화 블럭3-1.┌static 초기화 블럭
	//	        3-2.└instance 초기화 블럭
	//**instance ≒ object 객체
	//메모리에 만들어진 객체(메모리에 로드 된 클래스) = 인스턴스 
	static
	{//3.1
		System.out.println("static초기화 블럭");
	}
	{//3.2
		System.out.println("instance초기화 블럭");
		a=20;
	}
	
	//4. Constructor Method -파라미터를 전달받아 필드를 초기화함
	public Initial(){
		System.out.println("4.constructor");
	}

}
