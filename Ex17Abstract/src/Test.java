//abstract class : new로 객체생성 불가->반드시 상속해서 사용
public abstract class Test {
	int a;//instance variable
	static int b=10;//static(class) variable
	
	//Abstract class must have Constructor,too
	public Test() {
		System.out.println("Create Test class");
	}	
	//instance method --객체로 메모리에 올라갈때 존재
	void show() {
		System.out.println("instance method");
	}
	//abstract method
	abstract void aaa();
	//※static & abstract 함께 할 수 없음※
	//static abstract viod bbb();---ERROR
	
	//static method
	static void ccc() {
		System.out.println("static method");
	}	
	}

//create new class inherited abstract class Test
class AAA extends Test{
	void aaa() {};
	
	public AAA() {//constructor
		System.out.println("다형성AAA class's aaa()");
	}
}
class BBB extends Test{

	@Override
	void aaa() {
		System.out.println("다형성BBB class's aaa()");
		
	}
	
}
