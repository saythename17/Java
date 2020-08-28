//Test interface를 구현하여 설계
//interface는 extends(확장하다)가 아닌 implements(구현하다)사용
//구현 : 함수안{}에 코드작성
public class First implements Test{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("First aaa()");
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("First bbb()");
	}	
}
