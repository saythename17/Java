import java.net.MalformedURLException;
import java.net.URL;

public class Main2 {

	public static void main(String[] args) {
		
		//***throws : ���� ���ѱ��
		//�޼ҵ� �ȿ��� �߻��ϴ� ���ܻ�Ȳ�� �޼ҵ� �ȿ��� �ذ��� �� ���� ��
		//���ܰ� �߻��� �޼ҵ� �ȿ��� �ذ����� �ʰ� ���ܸ� �޼��带 ȣ���� ������ ���ѱ��
		try{
			double x= divide(10,0);
			System.out.println(x);
		}catch(ArithmeticException e) {
			System.out.println("0������ �Ұ�");
		}		
		
		//��ź �ѱ��
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
	
	//��ź ���ѱ�� (���ܸ� ������ ������)
	static void aaa() throws Exception {
		bbb();
	}
	static void bbb() throws MalformedURLException,Exception{
		URL url=new URL("http://www.naver.com");	
		ccc();//Exception �� ������ ������ ����ó��
	}
	static void ccc() throws Exception{		
	}
}


