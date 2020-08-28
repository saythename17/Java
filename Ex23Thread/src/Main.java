

public class Main {

	public static void main(String[] args) {
		// Thread(실) : 동시레 여러작업을 처리(수행)
		//★Process-현재 실행중인 (메모리에 로드된) 하나의 프로그램 ex1)자바,크롬.. 
		//		  -[본인만의 메모리 영역을 가짐] 프로세스간 자원공유 불가
		//★Thread-하나의 프로세스 안에서 동작하는 일꾼(직원),작성되어있는 코드를 읽어서 실행
		//		  -Thread간 data공유가능
		//하나의Process안에서는 여러개의Thread가 작동
		//하나의 프로세스안) 멀티 태스킹 == 멀티 쓰레드, !=멀티 프로세스
		//동시에 실행하고자하는 작업 구현
		//ex1)파일 다운로드 & 음악재생 & 채팅...
		//1)20개파일다운로드
		
//		for(int i=0;i<20;i++) {
//			System.out.println(i+"번째 파일 다운로드 중");
//			
//			for(int k=0;k<2000000000L;k++) {}	
//			//└억지로 오래걸리도록 가시적효과 주는 의미X코드임		
//		}
		//2)음악재생
//		for(int i=0;i<20;i++) {
//			System.out.println(i+"번째 음악 재생~~~");
//			
//			for(int k=0;k<2000000000L;k++) {}
//		}
		//위 두개의 작업을 동시에 실행시키면 더 빠를 것
		//기본으로 만들어져있는 Main Thread(사장)외의 특정 작업 수행 Thread(직원)생성
		//->동시에 여러개의 작업수행 가능
		//이때 사용하는 기술: Thread	
		
		
		
		
		
		//단! 일반객체와 Thread객체는 다름!!!
		//즉, 그냥 객체를 따로 만들었다고 Thread가 만들어 진 것이 아님
		//일반 객체를 생성하여 메소드를 실행시키면 Main Thread가 혼자 수행
		//동시에 작업이 이루어지지X
		
		//★Main Thread(사장)말고 Thread(직원)객체 생성
		//->Thread Class를 상속하는 클래스를 새로 정의 하여 객체로 사용
		AThread a=new AThread();//직원객체 생성(채용)
		//Thread직원에게 작업을 실행하도록 명령 - 업무시작!
		a.start();//Thread 실행 명령
		//start() : 이메소드를 호출하면 자동 run()에 있는 코드 
		BThread b=new BThread();
		b.start();
		
		//만약Thread의 동작 우선순위를 주고싶다면..(CPU점유시간 할당)
		//Priority(우선순위) : [1~10] 
		//대략 기본적으로 우선순위(Main):5,다른 Thread :3,4
		a.setPriority(1);//가장 낮은 우선순위
		b.setPriority(10);//가장 높은 우선순위
		//가급적 우선순위를 부여한 것이나 항상 확실한 순서를 보장할수는 X
		
		//Main Thread도 Thread이므로 A,B가 특정작업을 수행하는 동안
		//다른 작업 수행 가능
		for(int i=100;i<120;i++) {
			System.out.println("main : "+i);
			//1초 대기(Thread 1초간 잠재우기)
			try {
				Thread.sleep(1000);
				//.sleep() : checked Exception-반드시 예외처리
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}//Main]

//Thread의 능력을 가진 클래스 정의 : Thread를 상속하면 됨.
class AThread extends Thread{
	//※모든 Thread class의 작업은 반드시 이 메소드 안에서 해야함
	//※Thread클래스의 run() 메소드를 override해서 사용
	@Override
	public void run() {
		// 이 Thread가 했으면 하는 작업 코딩
		//ex1) file download		

		for(int i=0;i<16;i++) {//오래걸리는 파일 다운
			System.out.println(i+"번 파일 다운로드 중");
			
			//1초 대기(Thread 1초간 잠재우기)
			try {
				Thread.sleep(1000);
				//checked Exception-반드시 예외처리
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}//run	
}//AThread

class BThread extends Thread{
	@Override
	public void run() {//음악재생작업 수행 
		for(int i=0;i<16;i++) {
			System.out.println(i+"번 음악 재생~~");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}//for		
	}//run
}//BThread





//normal class
class WorkerA{
	void work() {//오래걸리는 파일 다운
		for(int i=0;i<10;i++) {
			System.out.println(i+"번 파일 다운로드 중");
			for(int j=0;j<2000000000L;j++) {}//강제로 대기}			
		}
	}
}
class WorkerB{
	void work() {
		for(int i=0;i<10;i++) {
			System.out.println(i+"번 음악 재생~~");
			for(int j=0;j<2000000000L;j++) {}			
		}		
	}
}