
public class ThreadControl {

	public static void main(String[] args) {
		//타이어조립작업객체(직원) 생성
		CThread c=new CThread();//직원 뽑음
		c.start();//일해라!절해라!		
		
		//3초후 휴식..(Thread 일시정지) 
		//wait() ↔ notify()//※synchronized해야함
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		//c.wait();권장X
		//일시정지 여부를 가진 isWait변수를 true로 변경
		c.isWait=true;
		
		//3초후 이어하기..(Resume)
		//c.notify();---X 이렇게 쓰면 mainThread가 실행하는것
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		c.resumeThread();//c-Thread에서notify()method 사용
		
		//3초후 퇴근(Thread종료==run method종료)
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		//타이어 조립직원에게 작업을 멈추라고 명령
		//while문이 멈추면 run()method의 작업이 끝나므로 
		//while문을 멈추는 방법사용				
		//while문의 반복조건문의 isRun변수값을 false로 변경
		c.isRun=false;
		System.out.println("CThread 퇴근");
		c.stop();//deprecate method : 사용을 권장하지 않는 메소드
		//작업을 완료하지않고 데이터가 열려있는상태에서 강제 종료
		//Thread의 반복작업을 (작업중간에도)강제로 멈추기 때문에 data관리에 누수발생위험
		//※Thread는 run() method가 종료되면 퇴근- 다시 start()해도 작업하지 않음
		//즉, Thread의 작업실행은 1회용
	}
}
//타이어 조립작업수행 스레드클래스 정의
class CThread extends Thread{
	boolean isRun=true;
	boolean isWait=false;
	@Override
	public void run() {
		//타이어 4개 조립작업- 반복수행
		while(isRun) {
			System.out.println("1번타이어조립");
			System.out.println("2번타이어조립");
			System.out.println("3번타이어조립");
			System.out.println("4번타이어조립");
			
			//혹시 휴식시간이냐-(일시정지할까?)
			if(isWait) {
				try {
					synchronized (this) {
						wait();//this-Thread일시정지
					}
				} catch (InterruptedException e) {}
			}						
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	
			System.out.println();
		}//while		
	}//run
	
	//이어하기 기능 method
	void resumeThread() {
		isWait=false;//휴식 기능종료
		synchronized(this) {
			this.notify();
		}
	}
}//CThread