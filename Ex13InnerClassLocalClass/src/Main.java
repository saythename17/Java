
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		//Nice n; �νĺҰ�
		Test.Nice n;//outer class�� �Բ� ȣ��
		//outer class�� ����� �νĵǴ��� ��ü ������ �Ұ�!
		//Test.Nice n2=new Test.Nice();----ERROR		
		//�ܺο��� inner class�� ����Ϸ���
		//outer class���� ����޾ƾ���
		Test.Nice n2=t.makeInnerClassObject();
		n2.k=50;
		n2.aaa();		
		
		Test.Nice n3=t.new Nice();//�������ϳ� �������� �ʴ� �ڵ�
		n3.aaa();
		Test t2=new Test();//Nice��ü �ڵ� ���� X
//outer object create != inner object create
		
		//static inner class�� outer���� ���� ����
		Test2.Hello h=new Test2.Hello();
		

	}

}
