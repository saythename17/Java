package Thread_;

import java.util.ArrayList;
import java.util.List;

public class Test06 {
	public static void main(String[] args) {
		Pool pool=new Pool();
		Thread get=new Thread(new PGet(pool));
		Thread add = new Thread(new PAdd(pool));
		
		get.start();
		add.start();
	}

}
class Pool{
	List<String> products= new ArrayList<>();
	
	public synchronized void get() throws InterruptedException{
		if(products.size()==0)		wait();
		products.remove(0);
		System.out.println("소비재고= "+products.size());
	}
	public synchronized void add(String value) {
		products.add(value);
		System.out.println("생산재고= "+products.size());
		notifyAll();
	}	
}

class PGet implements Runnable {
	Pool pool;
	public PGet(Pool pool) {this.pool=pool;	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=1;i<100;i++)	pool.get();
		} catch (InterruptedException e) {}
	}
}

class PAdd implements Runnable{
	Pool pool;
	public PAdd(Pool pool) {this.pool=pool;}
	@Override
	public void run() {
		for(int i=1;i<100;i++)	pool.add("상품"+i);
		}
}
