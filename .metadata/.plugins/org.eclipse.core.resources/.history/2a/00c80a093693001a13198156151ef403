//하나의 문서안에 여러개의 클래스 존재 가능
//※단, 하나의 문서안 public class는 단 1개만 허용
/*1)*/
public class Third {
	// └클래스명==문서명과 같아야함
	//클래스는 일반적으로 필드와 메소드를 가지고 있도록 설계

	//1.멤버변수(Field:필드) : 데이터 저장
	int a;//class의 멤버변수는 0으로 초기화
	//2.멤버함수(Method:메소드) : 기능,동작
	void show() {
		System.out.println("Thrid show!");
	
		//메소드 안에 class 정의
		//내장 class(local class)---Third$Nice.class
		//show안에서만 인식가능
		class Nice{int n; void aa() {}}
		Nice n=new Nice();//local class객체 생성
		
		
		Test t=new Test();
		t.show();
		
		//객체를 생성할때 설계도면을 임시적으로 변경--기능 바꿔치기
		Test t2=new Test(){
			void show() {System.out.println("Change!");}};
			//익명 클래스
		t2.show();
	
	}//show method
	
	/*3)클래스안 또 다른 클래스 선언*/
	//inner class--Third$inner.class
	//제약사항 - inner클래스는 inner클래스를 감싸는 outer클래스만 사용가능!
	class Inner{
		void show() {System.out.println("inner show");}
	}
	Inner inner=new Inner();//Third안에서는 객체생성 가능	
}//Third class

/*2)*/
//하나의 .Java문서안에 여러개에 class가 있는 경우
class Test{
	void show() {
		System.out.println("Test show");
	}
}