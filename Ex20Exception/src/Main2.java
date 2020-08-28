import java.net.MalformedURLException;
import java.net.URL;

public class Main2 {

	public static void main(String[] args) {
		
		//***throws : 예외 떠넘기기
		//메소드 안에서 발생하는 예외상황을 메소드 안에서 해결할 수 없을 때
		//예외가 발생한 메소드 안에서 해결하지 않고 예외를 메서드를 호출한 쪽으로 떠넘기기
		try{
			double x= divide(10,0);
			System.out.println(x);
		}catch(ArithmeticException e) {
			System.out.println("0나눗셈 불가");
		}		
		
		//폭탄 넘기기
		try {
			aaa();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	static double divide(int a, int b) throws ArithmeticException{
		return (double)a%b;
	}
	
	//폭탄 떠넘기기 (예외를 여러번 던지기)
	static void aaa() throws Exception {
		bbb();
	}
	static void bbb() throws MalformedURLException,Exception{
		URL url=new URL("http://www.naver.com");	
		ccc();//Exception 을 던지면 무조건 예외처리
	}
	static void ccc() throws Exception{		
	}
}


