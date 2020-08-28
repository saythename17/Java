
public class RaceHorse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse h1=new Horse("천리마");
		Horse h2=new Horse("적토마");
		Horse h3=new Horse("캐논");
		System.out.println("\t경주시작!!");
		h1.start();
		h2.start();
		h3.start();
		

	}

}
class Horse extends Thread{	
	String name;
	
	public Horse(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	//Thread 의 동작 처리 메소드
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("\t"+name+" : 다그닥!! 다그닥!!");
			//0.4초 대기==400millisecond
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {}
		}//for
		System.out.println("\t"+name+"\t도착!!");
	}//run
}//Horse