

public class Main {

	public static void main(String[] args) {
		// Thread(��) : ���÷� �����۾��� ó��(����)
		//��Process-���� �������� (�޸𸮿� �ε��) �ϳ��� ���α׷� ex1)�ڹ�,ũ��.. 
		//		  -[���θ��� �޸� ������ ����] ���μ����� �ڿ����� �Ұ�
		//��Thread-�ϳ��� ���μ��� �ȿ��� �����ϴ� �ϲ�(����),�ۼ��Ǿ��ִ� �ڵ带 �о ����
		//		  -Thread�� data��������
		//�ϳ���Process�ȿ����� ��������Thread�� �۵�
		//�ϳ��� ���μ�����) ��Ƽ �½�ŷ == ��Ƽ ������, !=��Ƽ ���μ���
		//���ÿ� �����ϰ����ϴ� �۾� ����
		//ex1)���� �ٿ�ε� & ������� & ä��...
		//1)20�����ϴٿ�ε�
		
//		for(int i=0;i<20;i++) {
//			System.out.println(i+"��° ���� �ٿ�ε� ��");
//			
//			for(int k=0;k<2000000000L;k++) {}	
//			//�������� �����ɸ����� ������ȿ�� �ִ� �ǹ�X�ڵ���		
//		}
		//2)�������
//		for(int i=0;i<20;i++) {
//			System.out.println(i+"��° ���� ���~~~");
//			
//			for(int k=0;k<2000000000L;k++) {}
//		}
		//�� �ΰ��� �۾��� ���ÿ� �����Ű�� �� ���� ��
		//�⺻���� ��������ִ� Main Thread(����)���� Ư�� �۾� ���� Thread(����)����
		//->���ÿ� �������� �۾����� ����
		//�̶� ����ϴ� ���: Thread	
		
		
		
		
		
		//��! �Ϲݰ�ü�� Thread��ü�� �ٸ�!!!
		//��, �׳� ��ü�� ���� ������ٰ� Thread�� ����� �� ���� �ƴ�
		//�Ϲ� ��ü�� �����Ͽ� �޼ҵ带 �����Ű�� Main Thread�� ȥ�� ����
		//���ÿ� �۾��� �̷������X
		
		//��Main Thread(����)���� Thread(����)��ü ����
		//->Thread Class�� ����ϴ� Ŭ������ ���� ���� �Ͽ� ��ü�� ���
		AThread a=new AThread();//������ü ����(ä��)
		//Thread�������� �۾��� �����ϵ��� ��� - ��������!
		a.start();//Thread ���� ���
		//start() : �̸޼ҵ带 ȣ���ϸ� �ڵ� run()�� �ִ� �ڵ� 
		BThread b=new BThread();
		b.start();
		
		//����Thread�� ���� �켱������ �ְ�ʹٸ�..(CPU�����ð� �Ҵ�)
		//Priority(�켱����) : [1~10] 
		//�뷫 �⺻������ �켱����(Main):5,�ٸ� Thread :3,4
		a.setPriority(1);//���� ���� �켱����
		b.setPriority(10);//���� ���� �켱����
		//������ �켱������ �ο��� ���̳� �׻� Ȯ���� ������ �����Ҽ��� X
		
		//Main Thread�� Thread�̹Ƿ� A,B�� Ư���۾��� �����ϴ� ����
		//�ٸ� �۾� ���� ����
		for(int i=100;i<120;i++) {
			System.out.println("main : "+i);
			//1�� ���(Thread 1�ʰ� ������)
			try {
				Thread.sleep(1000);
				//.sleep() : checked Exception-�ݵ�� ����ó��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}//Main]

//Thread�� �ɷ��� ���� Ŭ���� ���� : Thread�� ����ϸ� ��.
class AThread extends Thread{
	//�ظ�� Thread class�� �۾��� �ݵ�� �� �޼ҵ� �ȿ��� �ؾ���
	//��ThreadŬ������ run() �޼ҵ带 override�ؼ� ���
	@Override
	public void run() {
		// �� Thread�� ������ �ϴ� �۾� �ڵ�
		//ex1) file download		

		for(int i=0;i<16;i++) {//�����ɸ��� ���� �ٿ�
			System.out.println(i+"�� ���� �ٿ�ε� ��");
			
			//1�� ���(Thread 1�ʰ� ������)
			try {
				Thread.sleep(1000);
				//checked Exception-�ݵ�� ����ó��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}//run	
}//AThread

class BThread extends Thread{
	@Override
	public void run() {//��������۾� ���� 
		for(int i=0;i<16;i++) {
			System.out.println(i+"�� ���� ���~~");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}//for		
	}//run
}//BThread





//normal class
class WorkerA{
	void work() {//�����ɸ��� ���� �ٿ�
		for(int i=0;i<10;i++) {
			System.out.println(i+"�� ���� �ٿ�ε� ��");
			for(int j=0;j<2000000000L;j++) {}//������ ���}			
		}
	}
}
class WorkerB{
	void work() {
		for(int i=0;i<10;i++) {
			System.out.println(i+"�� ���� ���~~");
			for(int j=0;j<2000000000L;j++) {}			
		}		
	}
}