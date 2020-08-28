
public class Join_ {

	public static void main(String[] args) {
		JThread j=new JThread();
		j.start();
		
		//JTread의 작업(run method)가 종료될때까지
		//다른 thread의 작업에 block걸기
		//join() : Thread의 동시작업기능.동기화기능을 없애는 명령
		try {
			j.join();
		} catch (InterruptedException e1) {}
		
		//MainThread에서 다른 작업 수행
		for(int i=0;i<3;i++) {
			System.out.println("\t Main");
			try {
				Thread.sleep(500);//0.5초
			}catch(Exception e){}
		}
	}
}
class JThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("\t jjj");
			try {
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}