package com.ruby.java.test1;

public class SynchronizedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account();
		Draw t1=new Draw(account);
		Draw t2= new Draw(account);
		
		t1.start();
		t2.start();

	}

}
class Account {
	private long balance=1000;
	public void count(long amount) {	balance-=amount;	}
	public long getBalance() {	return balance;		}
}
class Draw extends Thread{
	Account account;
	Draw(Account account){this.account=account;	}
	@Override
	public void run() {
		
		synchronized (account) {
			for(int i=0;i<10;i++) {
			account.count(10);
			System.out.println(this.getName()+"Ãâ±Ý ÈÄ ÀÜ¾× : "+account.getBalance());
			}
		}
		
	}
}