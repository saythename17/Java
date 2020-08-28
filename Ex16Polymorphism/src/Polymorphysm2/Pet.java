package Polymorphysm2;

//Pet이 객체가 되지 않도록 막기 위해 추상클래스로 만들어야함
abstract public  class Pet {
	void sound() {/*override 용 method : 내용 X*/}
	
	//모든 동물의 공통기능
	void sleep() {
		System.out.println("zzZ");
	}
	

}
class Dog extends Pet{
	@Override
	void sound() {
		System.out.println("멍멍!!");
	}
	//Dog의 고유기능
	void guardHouse() {
		System.out.println("집지킴충성충성!!");
	}
	
}
class Cat  extends Pet{
	@Override
	void sound() {
		System.out.println("애용!김!애!용!");
	}
	//Cat고유기능
	void handleDeacon() {
		System.out.println("집사부리기!!!!");
	}
}
class Pig extends Pet{
	@Override
	void sound() {
		System.out.println("꿀꿀");
	}
	//Pig고유기능
	void eatAndEat() {
		System.out.println("먹고먹고!!!!!");
	}
	
}