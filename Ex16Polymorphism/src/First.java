
public class First {
	int a; 
	void showFirst() {
		System.out.println("show 1");
	}
	
	void show() {
		System.out.println("First show");
	}

}

class Second extends First{
	int b;
	void showSecond() {
		System.out.println("show 2");
	}
	//show method override
	void show() {
		System.out.println("Second show");
	}
}

class Third extends First{
	//override
	void show() {
		System.out.println("Third show");
	}
}

class Fourd extends Second{
	void show() {
		System.out.println("Four show");
	}
}
