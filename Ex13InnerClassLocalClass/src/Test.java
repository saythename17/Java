//inner class : ��ü�� �����ϰ� ����� ����
//�ܺο��� ������� ��ü����&������ ���� ���� ���
//outer class�� inner class����ϴ� ȯ��
//(class�� ���������� ���)-������
public class Test {
	int a=10;//������� (����� �ʱ�ȭ)
	//��� �޼ҵ�
	void show() {System.out.println("Test");}	
	
	//class �ȿ� class ����: inner class
	//inner class�� ���δ� class : outer class
	/*inner class Ư¡
	 * 1. �̳�Ŭ������ �ܺ�(outer class ��)���� (outer class�� ����)�νĺҰ�
	 * �ڡڡ�2. �ܺο��� �νĵǾ ��ü ������ �Ұ��ɡ�
	 * 3. inner class�� outer class�� ��������
	 * 4. outer class�� ��� ��밡��
	 *  *  <but> outer�� inner��� ���Ұ�  
	 */
	class Nice{
		int k=7;//�������
		void aaa() {//��� �޼ҵ�
			a=60;//outer class�� member variable��밡��
		 	System.out.println("Nice... "+ k);//���θ������ ���
		 	System.out.println("Nice... "+ a);//�ƿ��͸�� ���
		 	
		 	//outer class�� method�� ��밡��
		 	show();
		}		
	}//Nice
	
	//inner class���� �޼ҵ�
		//�̳�Ŭ���� ��ü�� ����� �ܺη� ���Ͻ����ִ� �޼ҵ�
		Nice makeInnerClassObject() {
			Nice n=new Nice();//outer�� inner�� ��ü�� ���� �� ����
			return n;}
}//Test
