
public class Main {

	public static void main(String[] args) {
		// TODO INTERFACE TODO :추상메소드를 멤버로 가진 클래스
		Test t;
		//Test t=new Test();---ERROR: can't create instance
		//Test interface를 사용하려면 interface를 구현한 새로운 클래스를 만들어 사용
		
		First f=new First();
		f.aaa();
		f.bbb();
				
		//Second가 Test인터페이스를 구현했다면 
		//이 클래스에 반드시 aaa(),bbb()가 있음
		Second s= new Second();
		s.aaa();
		s.bbb();
				
		//Test참조변수로 자식객체들인 First와 Second를 참조가능
		Test t1= null;
		t1= new First(); //업캐스팅 [부모-자식]
		t1.aaa(); //참조변수가 실제 참조하는 객체의 오버라이드메소드가 발동
		t1.bbb();
		t1= new Second(); //업캐스팅
		t1.aaa();
		t1.bbb();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//이너클래스는 외부에서 인식 불가.->outer명쓰고 사용
		//이너클래스는 객체생성 불가
		//BUT! static inner class: 객체 생성 가능
		Test.Hello h=new Test.Hello();
		h.show();//call instance method 
		
		
		//다중구현 가능 : AAA,BBB를 구현한 Sample class
	}
}

class Second implements Test{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("Second aaa");
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("Second bbb");
		
	}
	
}