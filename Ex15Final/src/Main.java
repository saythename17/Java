
public class Main {

	public static void main(String[] args) {
		// TODO final TODO
		// - variable(local,member,parameter) , method , class
		//final - Local variable : 상수화된 변수
		final int a=10;
		//a=20;ERROR a는 상수이므로 변경불가!
		final int b;//쓰래기 값으로 초기화되지않고 기다림
		b=10;//값을 처음 넣을떄 상수화 only one initialization
		//b=20; ERROR값을 또 넣을 수 없음
		
		Test t=new Test();
	}
}
class Test{
	final int num=10;//final field
//	final int age;//---ERROR final field must initialize with making.
	void aaa() {
		//num=30;//---ERROR 
		bbb(10);
	}
	void bbb(final int b) {//final parameter
		System.out.println(b);// print 10
	//	b=20;//---ERROR
	}
	
	//final method 
	//override X
	final void show() {
		System.out.println("final method TEST!");
	}
}
class Sample extends Test{
	//try override
	//void show() {
		//ERROR
//	}
}
//fianl class  ---Ex)Java's String 
//Inheritance X class
final class Last{
	
}
//class RealLast extends Last{
	//ERROR
//}
