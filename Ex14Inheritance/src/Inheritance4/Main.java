package Inheritance4;

public class Main {
	public static void main(String[] args) {			
		// TODO ※상속받은 method리모델링(개선)가능 TODO
		Robot r=new Robot();
		r.move();
		r.attack();
		
		//method내용을 완전히 바꿈
		FlyRobot fr=new FlyRobot();
		fr.move(); //using override--기존(super) 메소드 가려짐
		fr.attack();
		fr.fly();
		
		SwimRobot sr=new SwimRobot();
		sr.move();//call override method
		sr.attack();
		sr.swim();
		
		//method의 일부 내용만 바꿈
		Second s=new Second();
		s.show();
	}

}
