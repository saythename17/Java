
public class Test2 {
	int a =10;
	static int b;	
	//static inner class:�ƿ��Ͱ�ü ���̵� �̳ʰ�ü ���� ����
	public static class Hello{
		void show() {
			System.out.println("Hello show");
			//a=100;--static inner class:
			//outer instance������ ����� �� ����
			b=100;//class������ ��� ����
		}
	}

}
