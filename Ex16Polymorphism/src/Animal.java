
public class Animal {
	void sound() {
	}
}
class Dog extends Animal{
	void sound() {//Animal sound()'s override
		System.out.println("BOWWOW");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("MYAOOO");
	}
}

class Pig extends Animal{
	void sound() {
		System.out.println("OINKOINK");
	}
}