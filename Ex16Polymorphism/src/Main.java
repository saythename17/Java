
public class Main {

	public static void main(String[] args) {
		// TODO ������ Polymorphism (�����п�)TODO
		First f=new First();//���������� ��ü�� ������� : ��casting��
		Second s=new Second();//�������� �ڷ���==��ü �ڷ��� :casting
		
		//class�� �ڷ��� !=�������� �ڷ����� ������ ��� : ��Ӱ���(�ڽİ�ü����)
		//�θ�� �ڽ� �������� (super can control sub)
		//���ڽİ�ü�� �ݵ�� �θ�ü�� ����� ������ �ֱ� ����
		f= new Second();
		//UP casting --������ ū ��ü�� ����(super�������� pointing sub)	
		//���θ� �ڽ�����
		
		//s= new First();---ERROR sub�������� can't pointing super
		//��DOWN casting --������ ���� ��ü�� ����, �ڽ��� �θ�����
		//UP casting�ϴ���  �ڽİ�ü�� ���� ��� ���Ұ�
		f.a=100;//����(super) ����� ��밡��
		//f.b=600;---sub class's member b ERROR
		//����������==������
		Second s2;
		s2=(Second)f; //super��sub�� ����� ����ȯ�� DOWN casting ����
		//�������� �ִ� f�ּҿ� s2����
		//---reference variable copy reference
		
		
		
		
		
		
		First f4=new Second();//UP casting
		f4.a=1;
		f4.show();//method override(�θ����������� Second method����)
		//�θ� �������� 1���� �ڽİ�ü ��� �����
		
		//one super's reference variable can control all the sub class 
		First f5= new First();
		f5.show();//*override
		
		f5=new Second();
		f5.show();//*override
		
		//First�� ����� class Third class
		f5=new Third();
		f5.show();//*override
		//*����� ������ ������ �ٸ� : ��������  : ������
		
		//���� ��Ӱ��� (grand->parent->child)
		f5= new Fourd();//UP casting
		f5.show();
	}

}
