
public class DeamonThread_ {
	//Demon==����ȭ Virtual
	public static void main(String[] args) {
		DThread d=new DThread();
		d.setDaemon(true);//���󽺷���� ����!- Main Thread�� ����Ǹ� ���� �ڵ� ����
		d.start();		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		System.out.println("\t Main����~^^���� ���");
	}//main
}//
class DThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("\t D-working;;;");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}		
	}
}