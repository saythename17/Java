
public class ThreadControl {

	public static void main(String[] args) {
		//Ÿ�̾������۾���ü(����) ����
		CThread c=new CThread();//���� ����
		c.start();//���ض�!���ض�!		
		
		//3���� �޽�..(Thread �Ͻ�����) 
		//wait() �� notify()//��synchronized�ؾ���
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		//c.wait();����X
		//�Ͻ����� ���θ� ���� isWait������ true�� ����
		c.isWait=true;
		
		//3���� �̾��ϱ�..(Resume)
		//c.notify();---X �̷��� ���� mainThread�� �����ϴ°�
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		c.resumeThread();//c-Thread����notify()method ���
		
		//3���� ���(Thread����==run method����)
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		//Ÿ�̾� ������������ �۾��� ���߶�� ���
		//while���� ���߸� run()method�� �۾��� �����Ƿ� 
		//while���� ���ߴ� ������				
		//while���� �ݺ����ǹ��� isRun�������� false�� ����
		c.isRun=false;
		System.out.println("CThread ���");
		c.stop();//deprecate method : ����� �������� �ʴ� �޼ҵ�
		//�۾��� �Ϸ������ʰ� �����Ͱ� �����ִ»��¿��� ���� ����
		//Thread�� �ݺ��۾��� (�۾��߰�����)������ ���߱� ������ data������ �����߻�����
		//��Thread�� run() method�� ����Ǹ� ���- �ٽ� start()�ص� �۾����� ����
		//��, Thread�� �۾������� 1ȸ��
	}
}
//Ÿ�̾� �����۾����� ������Ŭ���� ����
class CThread extends Thread{
	boolean isRun=true;
	boolean isWait=false;
	@Override
	public void run() {
		//Ÿ�̾� 4�� �����۾�- �ݺ�����
		while(isRun) {
			System.out.println("1��Ÿ�̾�����");
			System.out.println("2��Ÿ�̾�����");
			System.out.println("3��Ÿ�̾�����");
			System.out.println("4��Ÿ�̾�����");
			
			//Ȥ�� �޽Ľð��̳�-(�Ͻ������ұ�?)
			if(isWait) {
				try {
					synchronized (this) {
						wait();//this-Thread�Ͻ�����
					}
				} catch (InterruptedException e) {}
			}						
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	
			System.out.println();
		}//while		
	}//run
	
	//�̾��ϱ� ��� method
	void resumeThread() {
		isWait=false;//�޽� �������
		synchronized(this) {
			this.notify();
		}
	}
}//CThread