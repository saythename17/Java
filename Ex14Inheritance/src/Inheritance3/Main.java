package Inheritance3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second s=new Second();
		s.show();
		
		//Create class through Constructor Method(parameter)
		//�Ķ���Ϳ� ���� �����ϸ� ��ü ����--�����ڸ� �̿��� ���� �ʱ�ȭ
		Second s2=new Second(1,2);
		s2.show();
		
		//Inheritance's inheritance
		//(Grandparent-parent-child)
		Third t=new Third();
		
		//�Ǵٸ� Ŭ������ �ݺ��ؼ� ��Ӱ���
		Second2 ss=new Second2();
		
		//���߻��(�Ѳ����� �������� Ŭ������ ��ӹ޴� ��) : Java������ ���Ұ�
		//class child extends Parent1,Parent2{	}---ERROR
	}

}
