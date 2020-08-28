
public class Synchronized_ {

	public static void main(String[] args) {
		// Synchronized 동기 != 동시(==비동기)
		Account iu=new Account();//계좌 객체 생성
		//iu계좌에 100원 입금하고 싶은 고객1
		TestThread t1=new TestThread(iu);
		//iu계좌에 100원 입금하고 싶은 고객2
		TestThread t2=new TestThread(iu);		
		//비슷한 시점에 둘다 100원 입금동작 수행하면 정확한 계산이X
		t1.start(); 	t2.start();		
	}
}
//은행계좌
class Account{
	int money=0;
	//*동기화처리를 하지않으면 여러 스레드가 이 메소드를 동시에 실행시켜
	//*잘못된 결과가 나올 위험 발생
	//*****방법1->이 메소드에 동기화 처리 [synchronized]
	//하나의 스레드가 이 메소드를 실행중이면 다른 스레드는 잠시 대기
	synchronized void add1(int n) {//입금기능 method
		String name=Thread.currentThread().getName();
		//└현재 이 메소드를 실행하는 thread이름을 얻어옴
		System.out.println("\t"+name+" : 입금작업 시작");
		System.out.println("\t"+name+" : 현재 잔액 : "+money);
		money += n;
		for(long i=0; i<2000000000L; i++) {}//처리시간+
		System.out.println("\t"+name+" : 입금 후 잔액 : "+money);
		System.out.println();
	}//BUT! 다음 사용자가 실행할때까지 아무신호없이 기다려야함
	//*****방법2->특정영역{동기화 블럭}만 동기화 처리 
	void add2(int n) {//입금기능 method
		String name=Thread.currentThread().getName();
		//└현재 이 메소드를 실행하는 thread이름을 얻어옴
		System.out.println("\t"+name+" : 입금작업 시작");
		
		//이 영역만 동기화 처리 : [parameter:동기화 할 객체 지정]
		synchronized(this) {//(this)==(Account를 보호)
			System.out.println("\t"+name+" : 현재 잔액 : "+money);
			money += n;
			for(long i=0; i<2000000000L; i++) {}//처리시간+
			System.out.println("\t"+name+" : 입금 후 잔액 : "+money);
		}//synchronized block		
	}
}//Account

//입금을 하는 Thread class
class TestThread extends Thread{
	Account iu;//위에서 만든 계좌객체 참조
	public TestThread(Account iu) {
		this.iu=iu;	
	}
	@Override
	public void run() {		
		iu.add2(100);//100원 입금하는 작업 수행
	}
}