
public class Main {

	public static void main(String[] args) {
		// TODO INTERFACE TODO :�߻�޼ҵ带 ����� ���� Ŭ����
		Test t;
		//Test t=new Test();---ERROR: can't create instance
		//Test interface�� ����Ϸ��� interface�� ������ ���ο� Ŭ������ ����� ���
		
		First f=new First();
		f.aaa();
		f.bbb();
				
		//Second�� Test�������̽��� �����ߴٸ� 
		//�� Ŭ������ �ݵ�� aaa(),bbb()�� ����
		Second s= new Second();
		s.aaa();
		s.bbb();
				
		//Test���������� �ڽİ�ü���� First�� Second�� ��������
		Test t1= null;
		t1= new First(); //��ĳ���� [�θ�-�ڽ�]
		t1.aaa(); //���������� ���� �����ϴ� ��ü�� �������̵�޼ҵ尡 �ߵ�
		t1.bbb();
		t1= new Second(); //��ĳ����
		t1.aaa();
		t1.bbb();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//�̳�Ŭ������ �ܺο��� �ν� �Ұ�.->outer���� ���
		//�̳�Ŭ������ ��ü���� �Ұ�
		//BUT! static inner class: ��ü ���� ����
		Test.Hello h=new Test.Hello();
		h.show();//call instance method 
		
		
		//���߱��� ���� : AAA,BBB�� ������ Sample class
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