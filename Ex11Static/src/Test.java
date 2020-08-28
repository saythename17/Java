
public class Test {
	public int a;/*member variable/field
	     == instance variable*/
	public static int b;/*static member variable
	     == class variable - (only one in class)*/
	
	public Test(int a, int b) {//constructor method
		this.a=a;
		this.b=b;
		//Test class에서만 사용가능 but Test 객체 메모리안에 있지않음
	}
	void shew() {
		System.out.println("show ");
		System.out.println(a);//instance variable 출력
		System.out.println(b);//class variable 출력
	}
	
	static void show() {//static method
		System.out.println("show static method");
		//System.out.println(a);--ERROR
		//static method에서는 instance variable 출력 불가
		//객체 생성 없이 호출-instance변수 a:존재X
		System.out.println(b);//class variable 출력
	}
	

}
