
public class Join_ {

	public static void main(String[] args) {
		JThread j=new JThread();
		j.start();
		
		//JTread�� �۾�(run method)�� ����ɶ�����
		//�ٸ� thread�� �۾��� block�ɱ�
		//join() : Thread�� �����۾����.����ȭ����� ���ִ� ���
		try {
			j.join();
		} catch (InterruptedException e1) {}
		
		//MainThread���� �ٸ� �۾� ����
		for(int i=0;i<3;i++) {
			System.out.println("\t Main");
			try {
				Thread.sleep(500);//0.5��
			}catch(Exception e){}
		}
	}
}
class JThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("\t jjj");
			try {
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}