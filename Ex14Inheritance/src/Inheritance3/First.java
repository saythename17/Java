package Inheritance3;

public class First {
	//super();---default call parent constructor
	private int a;	
	//Constructor 
	public First() {
		System.out.println("Create First class's Constructor");			
	}
	//Overloading
	public First(int a) {
		this.a=a;
		System.out.println("Super-I have a integer parameter");
	}		
	public void showFirst() {
		System.out.println("a : "+a);
	}
}
class Second extends First{
	//first oder==must Super class's constructor
	private int b;	
	//constructor 
	public Second() {
		//super();Implicit call parent constructor--default call==
		super();//==Explicit call parent constructor
		//always no.1 order : super(); ¡æ no.2 order : this();
		System.out.println("Create Second class's Constructor");
	}	
	//Overloading constructor
	public Second(int a, int b) {	
		super(a);//Explicit call parent constructor
		this.b=b;
		System.out.println("Sub-I have two integer parameter");
	}	
	public void show() {
		showFirst();
		System.out.println("b : "+b);
		System.out.println();
	}
}







class Second2 extends First{
	public Second2() {
		System.out.println("Create S2 class");
	}	
}



class Third extends Second{
	public Third() {
		//super();==Implicit call
		System.out.println("Create Third class");
		System.out.println();
	}
}






