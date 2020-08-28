
public class Runnable_ {

	public static void main(String[] args) {
		// Thread를 만드는 2가지 방법
		//1. Thread class를 상속(extends)한 class정의하여 사용
		//2. Runnable interface를 구현(implements)한 class를 정의하여 사용
		
		//Person을 상속하면서 Thread인 객체 생성
		PersonThread pt=new PersonThread();
		pt.name="DAHOON";
		pt.age=29;
		
		//본인의 이름, 나이를 1초마다 출력해주는 기능 실행
		//Thread를 실행 시키는 명령
		//.start()->Runnable에없는 Method
		//pt.run();//run() method를 직접호출 ->main이 thread에서 처리
		//Runnable은 스스로 실행하는 명령이 없음
		//Thread class로 전달하여 실행
		Thread t=new Thread(pt);
		//└생성자 파라미터에 Runnable전달->Thread가 대신 start()작업
		t.start();//생성자로 받은 Runnable객체의 run()메소드를 대신 실행
		System.out.println("Main : DDOL9");
		
		//Runnable을 사용하는 모습
		Person r=new PersonThread();// UP casting
		Runnable r2=new PersonThread();// UP casting
		Thread t2=new Thread(r2);
		t2.start();
		//Runnable을 상속받는 클래스를 정의하면서 객체 생성
		//익명 클래스 
		Runnable r3=new Runnable() {
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("냠냠");
					try { Thread.sleep(1000) ;} catch (InterruptedException e) {}
				}				
			}
		};
		Thread t3=new Thread(r3);
		t3.start();//위 익명클래스에서 만든run()기능 실행
		//익명클래스 더 간단하게 사용
		Thread t4= new Thread( new Runnable() {
			public void run() {	System.out.println("익명클래스 사용");	}} );
		t4.start();
	}
}


//Person의 member능력+Thread능력 모두 갖춘 <다중상속> 클래스
class PersonThread extends Person implements Runnable{
	//※반드시 Runnable의 abstract method인 run()을 override
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(name+", "+age);
			try { Thread.sleep(1000) ;} catch (InterruptedException e) {}
		}		
	}
}

	
class Person{
	String name;
	int age;
}