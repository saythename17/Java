//�ٸ� ��Ű���� Ŭ������ ���ϰ� ���
//import aaa.Student;
//import aaa.Person;
//aaa��Ű�� ���� ��� Ŭ���� �ѹ��� import
import aaa.*;// [*] : ALL

public class Main {

	public static void main(String[] args) {
		//class������ ��ü���� �� ���
		Test test=new Test();
		test.a=10;//field���
		test.show();//method���
		
		//���� �̸��� ���� class������ �����߻�
		// �� package ���(��C's namespace)
		//���� ��Ű�������� ���� (�̹� �����ϴ� )���� �̸���  class�� ����
		
		//�ٸ� ��Ű���� Ŭ������ [��Ű����.Ŭ������]���� ȣ���ؾ� �νĵ�
		aaa.Student stu =new aaa.Student();//aaa��Ű�� ������  class ��ü ����
		stu.eng=80;
		stu.kor=100;
		stu.name="DAHOON";
		
		//��Ű����(.aaa)������ : import
		Student stu2=new Student();
		//Java system API����(�� 4000��) import �ʿ�
		// �� ��� ��Ű�� ����
		// [ . ]: ���� ������
		bbb.Student stu3= new bbb.Student();
		stu3.name="robin";
		
		aaa.Person p=new aaa.Person();
		Person p1=new Person();
		
		mehi.dev.World w=new mehi.dev.World();
		
		//����Ʈ ��Ű���� �ٸ� ��Ű������ ��� �Ұ� �� �ǹ����� ������ ����
		//�ڵ����� Ŭ������ ����鼭 ��Ű�� ����
		
		
			
		
	}

}
