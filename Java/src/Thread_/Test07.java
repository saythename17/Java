package Thread_;

public class Test07 {
	public static void main(String[] args) {
		Phone2 call=new Phone2();
		call.start();	
		call.interrupt();
		try {
			call.join();
		} catch (InterruptedException e) {
			System.out.println("?");}
		for(int i=1;i<10;i++) System.out.println("���ĸԱ� : "+i);
	}
}
class Phone2 extends Thread{
	@Override
	public void run() {
		
		
		for(int i=10;i>0;i--)  {
			System.out.println("ī�� �ϱ�: "+i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("���???");}		
		}
	}
}
