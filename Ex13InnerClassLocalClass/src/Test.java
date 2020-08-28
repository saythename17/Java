//inner class : 객체를 안전하게 만들기 위함
//외부에서 마음대로 객체생성&변경을 막기 위해 사용
//outer class만 inner class사용하는 환경
//(class를 한정적으로 사용)-안정성
public class Test {
	int a=10;//멤버변수 (명시적 초기화)
	//멤버 메소드
	void show() {System.out.println("Test");}	
	
	//class 안에 class 선언: inner class
	//inner class를 감싸는 class : outer class
	/*inner class 특징
	 * 1. 이너클래스는 외부(outer class 밖)에서 (outer class명 없이)인식불가
	 * ★★★2. 외부에서 인식되어도 객체 생성은 불가능★
	 * 3. inner class는 outer class만 생성가능
	 * 4. outer class의 멤버 사용가능
	 *  *  <but> outer는 inner멤버 사용불가  
	 */
	class Nice{
		int k=7;//멤버변수
		void aaa() {//멤버 메소드
			a=60;//outer class의 member variable사용가능
		 	System.out.println("Nice... "+ k);//본인멤버변수 출력
		 	System.out.println("Nice... "+ a);//아우터멤버 출력
		 	
		 	//outer class의 method도 사용가능
		 	show();
		}		
	}//Nice
	
	//inner class생성 메소드
		//이너클래스 객체를 만들어 외부로 리턴시켜주는 메소드
		Nice makeInnerClassObject() {
			Nice n=new Nice();//outer는 inner를 객체로 만들 수 있음
			return n;}
}//Test
