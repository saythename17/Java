import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO ��ü���� Programming (OOP: Object Oriented Programming)
		// ��ü: ������ ���(����:�Լ�)�� ��(������)�� �Բ� ���� �༮
		//	  : ([Field]����+[Method]�Լ�)
		//bit-byte-word- Filed:�ǹ� �ִ� �������� ����
		//ex1) Random : ������ ���� ������ �ɷ��� ���� �༮
		//ex2) Scanner : Ű������ �Է��� �ڷῡ �°� �޾��ִ� �ɷ��� ���� �༮
		//ex3) String : ���ڿ��� �����ϴ� �ɷ��� ���� �༮
		// Class : �� ��ü�� �ɷ��� �����ϴ� ��Ī,�� ��ü�� ����
		//(������ ����-�ڷ���)---(��ü�� ����-class)
		//in Java- Ŭ������ ��ɺ��� �� 4000�� ���̺귯���� ����Ǿ� ����
		//Ŭ������ ����Ϸ���? ��ü�� ���� ����ؾ���
		// ex1) Random ��ü ����
		Random rnd=new Random();
		int n=rnd.nextInt();//Method ȣ�� (��ü�� ��� ���)
		//�ڹٴ� �̷��� ��ü���� �ʿ��Ҷ� �ҷ� ����ϴ� ������� ���α׷���
		//��4000������ Ŭ������ �󸶳� �������ҿ� ����ϴ��İ� ����
		//Java System API(Application Interface) : 
		//     �� ==(Java System Library) : �ڹ��� �� 4000������ class
		//but �����ڰ� ���ϴ� ��� ����� ������ ���� �� ����
		// �� ���α׷��Ӱ� ������ ����� ���� Ŭ������ ���� ��������
		//����� ���� �ڷ��� : ���α׷��Ӱ� ���� class(4001��° class)
		class Robot{
			void move() {}
			void arrack() {}
		}//Ŭ���� ����
		Robot r=new Robot();//��ü ������ ���
		r.arrack();
		r.move();
		
		//����� ���� Ŭ������ ����� ���
		//Ŭ������ ����� �� : ���赵���� § ��
		//���� Ŭ������ ��ü�� �����ؼ� ��� �� ��ü����
		
		//Ŭ������ ����� ��ġ
		//�ڡڡ�1)������ .Java������ class�� ����
		//2)���� .Java������ �������� class ����
		//3)�ٸ� class�ȿ� class ����(�ۼ�)
		//4)Method(�Լ�)�ȿ��� class����
		//**Ŭ�����̸��� �����̸��� ���ƾ���
		//bin:binary 2����
		
		/*1)*/
		Second s=new Second();
		s.a=10;
		s.show();
		Third t=new Third();
		t.show();
		System.out.println();
		
		/*2)*/
		Test test=new Test();
		test.show();
		
		/*3)*/
		//Third.Inner in =new Third.Inner();//ERROR 
		//outer class�� �ƴ� ������ ��ü ���� �Ұ�

		
	}

}
