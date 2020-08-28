
public class Synchronized_ {

	public static void main(String[] args) {
		// Synchronized ���� != ����(==�񵿱�)
		Account iu=new Account();//���� ��ü ����
		//iu���¿� 100�� �Ա��ϰ� ���� ��1
		TestThread t1=new TestThread(iu);
		//iu���¿� 100�� �Ա��ϰ� ���� ��2
		TestThread t2=new TestThread(iu);		
		//����� ������ �Ѵ� 100�� �Աݵ��� �����ϸ� ��Ȯ�� �����X
		t1.start(); 	t2.start();		
	}
}
//�������
class Account{
	int money=0;
	//*����ȭó���� ���������� ���� �����尡 �� �޼ҵ带 ���ÿ� �������
	//*�߸��� ����� ���� ���� �߻�
	//*****���1->�� �޼ҵ忡 ����ȭ ó�� [synchronized]
	//�ϳ��� �����尡 �� �޼ҵ带 �������̸� �ٸ� ������� ��� ���
	synchronized void add1(int n) {//�Աݱ�� method
		String name=Thread.currentThread().getName();
		//������ �� �޼ҵ带 �����ϴ� thread�̸��� ����
		System.out.println("\t"+name+" : �Ա��۾� ����");
		System.out.println("\t"+name+" : ���� �ܾ� : "+money);
		money += n;
		for(long i=0; i<2000000000L; i++) {}//ó���ð�+
		System.out.println("\t"+name+" : �Ա� �� �ܾ� : "+money);
		System.out.println();
	}//BUT! ���� ����ڰ� �����Ҷ����� �ƹ���ȣ���� ��ٷ�����
	//*****���2->Ư������{����ȭ ��}�� ����ȭ ó�� 
	void add2(int n) {//�Աݱ�� method
		String name=Thread.currentThread().getName();
		//������ �� �޼ҵ带 �����ϴ� thread�̸��� ����
		System.out.println("\t"+name+" : �Ա��۾� ����");
		
		//�� ������ ����ȭ ó�� : [parameter:����ȭ �� ��ü ����]
		synchronized(this) {//(this)==(Account�� ��ȣ)
			System.out.println("\t"+name+" : ���� �ܾ� : "+money);
			money += n;
			for(long i=0; i<2000000000L; i++) {}//ó���ð�+
			System.out.println("\t"+name+" : �Ա� �� �ܾ� : "+money);
		}//synchronized block		
	}
}//Account

//�Ա��� �ϴ� Thread class
class TestThread extends Thread{
	Account iu;//������ ���� ���°�ü ����
	public TestThread(Account iu) {
		this.iu=iu;	
	}
	@Override
	public void run() {		
		iu.add2(100);//100�� �Ա��ϴ� �۾� ����
	}
}