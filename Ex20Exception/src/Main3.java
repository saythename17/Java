
public class Main3 {

	public static void main(String[] args) {
		// TODO throw : 코드를 통해 예외를 강제로 발동시킴
		try {
			System.out.println("억지로");
			//억지로 예외발생시킴
			throw new Exception();//예외 객체 만들어 강제 throw
			//↑예외를 만든 이 뒤로는 코드 실행 안됨
			//System.out.println(); - ERROR
		}catch(Exception e) {
			System.out.println("예외발생");			
		}System.out.println();
		//[활용 예]
		//메소드에 뺄셈 계산-> 리턴된 결과에 음수가 나올경우 
		//프로그램에서 음수가 나온다고해서 예외는 아니지만
		//개발자가  음수가 절대 나오지않도록 하고싶다면
		//(음수일때 예외처리) 음수일때 예외를 throw

		try{
			int n=aaa(10,13);
			System.out.println("n : "+n);
		}catch(Exception e) {
			System.out.println("계산결과에 음수 X");
			System.out.println(e.getMessage());
		}		
	}
	static int aaa(int a, int b) throws Exception{
		if(a<b) {//음수일때
			//throw new Exception();
			throw new MyException("Hi~~~~");
		}
		return a-b;
	}
}//main

//나만의 Exception class
class MyException extends Exception{
	//Constructor
	public MyException(String msg) {
		super(msg);
	}
}
