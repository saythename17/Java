
public class LocalClass {
	//멤버변수
	final int m=20;
	//멤버 메소드
	void aaa() {		
		//local class-class in method
		/*local class는 메소드안에서 1회용으로 잠깐 사용하는 객체
		 *'익명클래스'사용시 local class 사용*/
		class AAA{
			int a ;
			void show() {System.out.println("AAAshow"+a+m);}
			//local class에서 본인이 선언된 method를 가지고 있는 class의 멤버 사용가능
			int mm=m+2;//지역 변수 사용불가, final은 사용가능*****
		}//local class는 선언된 method 지역 안에서만 사용
		AAA obj= new AAA();
		obj.show();
	}	
	void bbb() {
		//aaa() method's local class-AAA인식X 
		//:local class는 다른 local class에서 인식 불가
	}

}
