//package, import외에 class밖에 그 어떤 것도 쓸 수 X
public class Variable {
	/*자바에서 변수의 종류(구분) 
	[멤버변수, 지역변수, 매개변수, static정적변수]*/
	int a;/*멤버변수 : class {}영역 안에 선언된 변수
					선언된 클래스 {}안에서 인식
					멤버변수는 0으로 초기화
					멤버 변수와 멤버메소드는 호출순서 상관X*/
	void aaa() {
		member=10;//멤버변수 인식
		int local;/*지역변수 : method{}	안에 생성, 인식
							자동초기화 X → garbage value
					      지역변수는 반드시 변수 선언부 다음에 사용가능*/
	}
	void vvv(int x) {//매개변수 
		//int x;//ERROR 매개변수와 같은 이름의 지역변수 선언은 불가
		int a;//멤버변수와 같은 이름을 가진 지역변수 선언은 가능
		member=20;//멤버변수 인식
	}
	int member;//-선언위치에 상관X--method보다 먼저 생성됨

}
class Nice{
	//ERROR)member=10;//지역변수는 다른 클래스에서 인식 불가
}
