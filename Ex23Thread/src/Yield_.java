
public class Yield_ {

	public static void main(String[] args) {
		// Yield(양보)
		ThreadA t1= new ThreadA();
		ThreadB t2= new ThreadB();
		t1.start();
		t2.start();
		//5초후에 A가 본인 CPU점유시간 양보
		try {Thread.sleep(5000);} catch (InterruptedException e) {}
		t1.isFlag=false;
		//5초후에 B가 본인 CPU점유시간 양보
		try {Thread.sleep(5000);} catch (InterruptedException e) {}
		t1.isFlag=true;
		t2.isFlag=false;
	}
}
class ThreadA extends Thread{
	boolean isFlag= true;
	@Override
	public void run() {
		while(true) {
			if(isFlag) {
				System.out.println("AThread running");
			}else {
				Thread.yield();//나의 CPU점유시간 양보
			}
			 try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

class ThreadB extends Thread{
	boolean isFlag= true;
	@Override
	public void run() {
		while(true) {
			if(isFlag) {
				System.out.println("BThread running");
			}else {
				Thread.yield();//나의 CPU점유시간 양보
			}
			 try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}