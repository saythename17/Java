
public class DeamonThread_ {
	//Demon==가상화 Virtual
	public static void main(String[] args) {
		DThread d=new DThread();
		d.setDaemon(true);//데몬스레드로 설정!- Main Thread가 종료되면 같이 자동 종료
		d.start();		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		System.out.println("\t Main종료~^^사장 퇴근");
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