
public class Main3 {

	public static void main(String[] args) {
		// TODO throw : �ڵ带 ���� ���ܸ� ������ �ߵ���Ŵ
		try {
			System.out.println("������");
			//������ ���ܹ߻���Ŵ
			throw new Exception();//���� ��ü ����� ���� throw
			//�迹�ܸ� ���� �� �ڷδ� �ڵ� ���� �ȵ�
			//System.out.println(); - ERROR
		}catch(Exception e) {
			System.out.println("���ܹ߻�");			
		}System.out.println();
		//[Ȱ�� ��]
		//�޼ҵ忡 ���� ���-> ���ϵ� ����� ������ ���ð�� 
		//���α׷����� ������ ���´ٰ��ؼ� ���ܴ� �ƴ�����
		//�����ڰ�  ������ ���� �������ʵ��� �ϰ�ʹٸ�
		//(�����϶� ����ó��) �����϶� ���ܸ� throw

		try{
			int n=aaa(10,13);
			System.out.println("n : "+n);
		}catch(Exception e) {
			System.out.println("������� ���� X");
			System.out.println(e.getMessage());
		}		
	}
	static int aaa(int a, int b) throws Exception{
		if(a<b) {//�����϶�
			//throw new Exception();
			throw new MyException("Hi~~~~");
		}
		return a-b;
	}
}//main

//������ Exception class
class MyException extends Exception{
	//Constructor
	public MyException(String msg) {
		super(msg);
	}
}
