package Thread_;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work1 w1=new Work1();
		Work2 w2=new Work2();
		w1.start();
		w2.start();
		

	}

}
class Work1 extends Thread{
	Work1(){
		setName("내이름은 워크원");
	}
	@Override
	public void run() {
		for(int  i=0;i<100;i++) {
			System.out.println(this.getName()+"작업중...");
		}
	}
}
class Work2 extends Thread{
	Work2(){
		setName("서버 연결");
	}
	@Override
	public void run() {
		for(int  i=0;i<100;i++) {
			System.out.println(this.getName()+"작업중...");
		}
	}
}