package Thread_;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new Movie());
		Thread t2=new Thread(()->{
			for(int i=1;i<100;i++) {System.out.println("전화 받기 : "+i);}
		});
		t1.start();
		t2.start();
		for(int i=1;i<100;i++) {System.out.println("TV 보기 :"+i);}
		

	}

}


class Movie implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {System.out.println("음식 먹기 : "+i);}
		
	}
}
