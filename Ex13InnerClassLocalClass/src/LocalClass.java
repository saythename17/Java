
public class LocalClass {
	//�������
	final int m=20;
	//��� �޼ҵ�
	void aaa() {		
		//local class-class in method
		/*local class�� �޼ҵ�ȿ��� 1ȸ������ ��� ����ϴ� ��ü
		 *'�͸�Ŭ����'���� local class ���*/
		class AAA{
			int a ;
			void show() {System.out.println("AAAshow"+a+m);}
			//local class���� ������ ����� method�� ������ �ִ� class�� ��� ��밡��
			int mm=m+2;//���� ���� ���Ұ�, final�� ��밡��*****
		}//local class�� ����� method ���� �ȿ����� ���
		AAA obj= new AAA();
		obj.show();
	}	
	void bbb() {
		//aaa() method's local class-AAA�ν�X 
		//:local class�� �ٸ� local class���� �ν� �Ұ�
	}

}
