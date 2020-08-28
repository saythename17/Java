
public class Yield_ {

	public static void main(String[] args) {
		// Yield(�纸)
		ThreadA t1= new ThreadA();
		ThreadB t2= new ThreadB();
		t1.start();
		t2.start();
		//5���Ŀ� A�� ���� CPU�����ð� �纸
		try {Thread.sleep(5000);} catch (InterruptedException e) {}
		t1.isFlag=false;
		//5���Ŀ� B�� ���� CPU�����ð� �纸
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
				Thread.yield();//���� CPU�����ð� �纸
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
				Thread.yield();//���� CPU�����ð� �纸
			}
			 try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}