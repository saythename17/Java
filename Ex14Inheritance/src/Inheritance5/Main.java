
package Inheritance5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//� ������ �������� �� ����-ȸ������ ����
		//1. �Ϲ�ȸ�� : �̸�, ����
		//2. ��      �� : �̸�, ����, ����
		//3. ��      �� : �̸�, ����, ��������
		//4. �ٷ��л� : �̸�, ����, ����, ����
		
		//�Ϲ�ȸ��
		Person p= new Person("sam", 20);
		p.show();System.out.println();
				
		//�л�
		Student stu=new Student("robin",25,"android");
		stu.show();System.out.println();
		
		//����
		Professor pro=new Professor("maranda",50,"mobile optimization");
		pro.show();
		
		//�ٷ��л�
		Alba alba=new Alba("somi",23,"web","PC management");
		alba.show();
	}
}
