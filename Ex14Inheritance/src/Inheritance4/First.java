package Inheritance4;

public class First {
	private int a;
	public void show() {
		System.out.println("a : "+a);
	}

}
class Second extends First{
	//already has super(First) class's member
	private int b;
	
	//method override : correct super's method
	public void show() {
		//show();��Ŀ�ú� ȣ�� call
		super.show();
		System.out.println("b : "+b);
	}
}
