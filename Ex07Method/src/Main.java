import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//�������� ���α׷�		
		//class ���� �濬���ִ� �������� ����(�̸�,����,����,���)
		//���ο� class���ǽ� ������ .java������ ����� ���� ����
		
		//���� ����� Student class�� ��ü ����
		Student stu=new Student();
		stu.name="SUGAR";
		stu.kor=100;
		stu.eng=80;
		stu.aver=(double)(stu.kor+stu.eng)/2;		
		//ȭ�� ���
		System.out.println(stu);//��ü�� ���� ����
		System.out.println("�̸� : "+stu.name);
		System.out.println("���� : "+stu.kor);
		System.out.println("���� : "+stu.eng);
		System.out.println("��� : "+stu.aver);
		
		//����� ����
		int k=10;
		stu.kor=k;//�Ϲݺ����� ��������� ����
		System.out.println("����� ����: "+stu.kor);
		
		//����� Ű����� �Է� �ޱ�
		Scanner scan=new Scanner(System.in);
		Student stu3=new Student();
		stu3.name=scan.next();
		stu3.kor=scan.nextInt();
		stu3.eng=scan.nextInt();
		stu3.calAverage();
		//ȭ�� ���
		//��ü���� Ư�������� �����ϴ� ���(Function==Method)�ο�
		//Java-Class�� Ư������� �����ϴ� �ڵ� �ۼ�==��Method�ۼ�
		stu3.output();//Methodȣ��
	
		//�Ķ���� : Ư������� �����ϸ鼭 �����͸� ����--������
		//stu5.�Է���("������",30,50,40.0);
		//TODO : class�� �Է±�� ����� 
		
		
	
	}

}
