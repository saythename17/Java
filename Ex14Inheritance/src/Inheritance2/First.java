package Inheritance2;

public class First {
	int a;//First�� �������
	//���� ������� ���� ����ϴ� ��� �޼ҵ�
	void showFirst() { System.out.println("a : "+a); }
	
	//���� �ʵ带 �Է����ִ� �޼ҵ�
	void setA(int a) { this.a=a; }
}


class Second extends First{
	//��ӹ��� First�� ����� ������ ���� 
	int b;//Second�� �������

	//��ӹ��� ��������� ���� ���θ������ �� ��� �޼ҵ�		
	void show() {
		showFirst();//super ����޼ҵ� ����ó�� ��밡��
		System.out.println("b : "+b);//���� ����� �������
	}

	//��������� ���� �������ִ� �޼ҵ�
	void setMember(int a, int b) {
//		this.a=a;//��������� ���޹��� �Ű����� ����
		//this�������� : ���� ��ü ��Ī
		//but a�� ������ First�� ���-�����ʿ�
		//��������� parent��ü�� field���� ��������
//		super.a=a;//��ӹ��� parent ��ü ��Ī
		//�������� this�� super�� �������� �ʾƵ� �ڵ����� �����Ǿ�����
		//but super�� ���� sub�� �������ִ� �͵� ��ü���������� ����
		setA(a);//== super.setA(a);
		this.b=b;
	}
}
