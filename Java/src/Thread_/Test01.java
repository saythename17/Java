package Thread_;

public class Test01 {
	public static void main(String[] args) {
		Food f=new Food();
		Phone p=new Phone();
		p.setPriority(Thread.MAX_PRIORITY);
		f.setPriority(Thread.MIN_PRIORITY);
		
		f.start();
		p.start();
	}
}

class Food extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("���� �Ա� : "+i);
		}
	}
}

class Phone extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("��ȭ �ޱ� : "+i);
		}
	}
}