
public class Sleep_ {

	public static void main(String[] args) {
		SThread t=new SThread();
		t.start();//run method실행
		//강제로 자고 있는 Thread깨우기
		try {t.sleep(5000);} catch (InterruptedException e) {}
		t.interrupt();//sleep method에  exception발생
		try {t.sleep(1);} catch (InterruptedException e) {}
		t.interrupt();
	}
}
class SThread extends Thread{
	@Override
	public void run() {
		//10초후에 "HELLO"출력-10초 대기 (잠 재우기)
//		try {Thread.sleep(1000);} catch (InterruptedException e) {
//			System.out.println("\t자는데 왜 깨워 ㅡㅡ!!!!  ");
//		}
//		System.out.println("\t야 일어나");		
		//***무한 반복을 종료시키는 목적으로 sleep-interrupt을 사용하는 경우도 있음
		while(true) {
			System.out.println("\t ㅋㅋㅋ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("\t Interrupt 발생"); 
				break;//while문 정지
			}
		}//while
		//***무한반복 종료 2번째 방법
		while(true) {
			System.out.println("\t ㅎㅎㅎ");
			//↓interrupt method호출시 무한루프를 빠져나옴
			if(this.isInterrupted()) {break;}
		}
	}//run
}