
public class Main {

	public static void main(String[] args) {
		// TODO final TODO
		// - variable(local,member,parameter) , method , class
		//final - Local variable : ���ȭ�� ����
		final int a=10;
		//a=20;ERROR a�� ����̹Ƿ� ����Ұ�!
		final int b;//������ ������ �ʱ�ȭ�����ʰ� ��ٸ�
		b=10;//���� ó�� ������ ���ȭ only one initialization
		//b=20; ERROR���� �� ���� �� ����
		
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
