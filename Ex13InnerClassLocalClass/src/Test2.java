
public class Test2 {
	int a =10;
	static int b;	
	//static inner class:아우터객체 없이도 이너객체 생성 가능
	public static class Hello{
		void show() {
			System.out.println("Hello show");
			//a=100;--static inner class:
			//outer instance변수를 사용할 수 없음
			b=100;//class변수는 사용 가능
		}
	}

}
