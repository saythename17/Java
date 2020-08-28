import member.Person;

public class Main {

	public static void main(String[] args) {
		// TODO ���� ������ Access Modifier
		/*1. private : ����� class���ο����� ����� ���� ����
		  2. (default,package) : ���� package�ȿ��� .�����ڷ� ���� ����
		  3. protected : ���� package�ȿ��� .�����ڷ� ���� ����
		  				  �ٸ� package���� ��Ӱ���� ���� ����
		  4. public : ��� �������� .�����ڸ� ���� ����� ���� ����*/
		//���������� ���� �ʵ�,�޼ҵ�,Ŭ����
		
		//���� package�� ��ü ����
		First f=new First();
//f.a=10; �� ERROR : private�� �ܺ�(��üclass��)���� ��� �Ұ�
		f.b=10; //default
		f.c=10; //protected
		f.d=10; //public
		//���� package���� ����� private���� ��밡��
		
		f.aaa(); //default
		aaa.Second s = new aaa.Second();//�ٸ� ��Ű�� ����� �����ϱ� ���� [��Ű����.]�ʿ�
		//s.a=10; ERROR : private�� �ܺο��� ���� �Ұ�
		//s.b=10; ERROR : (default) �ٸ� ��Ű������ ���� �Ұ�
		//s.c=10; ERROR : protected �ٸ� ��Ű�� ���� ���� �Ұ�
		s.d=10;//public
		//s.aaa(); ERROR : (default)���� ���� �޼ҵ� 
		s.bbb();//public method�� ��𿡼��� ���� ����
		//�ٸ� package�� (default) class�� ��ü ���� �Ұ�
		//ERROR)aaa.Test t;--- information hiding: ��������
		//�ϳ��� �ڹٹ����ȿ� Ŭ���� �������� ������  �� Ŭ�������� ���������� ���� ���� �Ұ�
		
		//���������� ���� ��Ģ
		//��ü�� �ʵ�(�������)�� private, �޼ҵ�� public
		
		
		
		
		
		
		
		
		
		
		
		
		Person p=new Person();
		//p.name="Sam";ERROR : private ��������
		//���е� ��������� �� �����ϴ� �޼ҵ� ȣ��
		p.setMembers("Sam", 25, "Korea");
		//����Լ��� ���� ȣ��
		p.show();
		
		//������� ���� �����ϴ�  �޼ҵ� ȣ��
		p.setName("Rose");
		p.setAge(16);
		p.setNation("America");
		p.show();
		
		//�ʵ� ����---��������� �������ִ� �޼ҵ� ȣ��
		if (p.getAge()<20) {
			System.out.println(p.getName()+"�� �̼�����");
		}
		

	}

}
