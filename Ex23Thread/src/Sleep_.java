
public class Sleep_ {

	public static void main(String[] args) {
		SThread t=new SThread();
		t.start();//run method����
		//������ �ڰ� �ִ� Thread�����
		try {t.sleep(5000);} catch (InterruptedException e) {}
		t.interrupt();//sleep method��  exception�߻�
		try {t.sleep(1);} catch (InterruptedException e) {}
		t.interrupt();
	}
}
class SThread extends Thread{
	@Override
	public void run() {
		//10���Ŀ� "HELLO"���-10�� ��� (�� ����)
//		try {Thread.sleep(1000);} catch (InterruptedException e) {
//			System.out.println("\t�ڴµ� �� ���� �Ѥ�!!!!  ");
//		}
//		System.out.println("\t�� �Ͼ");		
		//***���� �ݺ��� �����Ű�� �������� sleep-interrupt�� ����ϴ� ��쵵 ����
		while(true) {
			System.out.println("\t ������");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("\t Interrupt �߻�"); 
				break;//while�� ����
			}
		}//while
		//***���ѹݺ� ���� 2��° ���
		while(true) {
			System.out.println("\t ������");
			//��interrupt methodȣ��� ���ѷ����� ��������
			if(this.isInterrupted()) {break;}
		}
	}//run
}