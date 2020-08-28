
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		//Nice n; 인식불가
		Test.Nice n;//outer class와 함께 호출
		//outer class를 사용해 인식되더라도 객체 생성은 불가!
		//Test.Nice n2=new Test.Nice();----ERROR		
		//외부에서 inner class를 사용하려면
		//outer class에게 허락받아야함
		Test.Nice n2=t.makeInnerClassObject();
		n2.k=50;
		n2.aaa();		
		
		Test.Nice n3=t.new Nice();//가능은하나 권장하지 않는 코드
		n3.aaa();
		Test t2=new Test();//Nice객체 자동 생성 X
//outer object create != inner object create
		
		//static inner class는 outer없이 생성 가능
		Test2.Hello h=new Test2.Hello();
		

	}

}
