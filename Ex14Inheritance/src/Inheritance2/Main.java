package Inheritance2;

public class Main {

	public static void main(String[] args) {
		// ��ӹ��� Ŭ�������� ���� ��� (�̷������δ� ���� Ŭ���� - ����Ŭ����)
		//[C++ : Base - Derived]
		//[Java : Super - Sub]
		//[C# : Parent - Child]
		
		Second s=new Second();
		s.a=10;//��ӹ��� Ŭ���� ��ü�� ����� �����ξ� ���
		//��ӹ��� Ŭ������ ��ü�� (�޸�������)������ ����
		s.b=20;

		//��ü������ ��Ƽ�� : ������� ����� ������ �ϵ���
		s.show();
		System.out.println();
		
		//������� �Է� �޼ҵ�
		s.setMember(100, 200);
		s.show();
		System.out.println();
		
	}

}
