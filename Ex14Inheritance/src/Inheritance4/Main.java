package Inheritance4;

public class Main {
	public static void main(String[] args) {			
		// TODO �ػ�ӹ��� method���𵨸�(����)���� TODO
		Robot r=new Robot();
		r.move();
		r.attack();
		
		//method������ ������ �ٲ�
		FlyRobot fr=new FlyRobot();
		fr.move(); //using override--����(super) �޼ҵ� ������
		fr.attack();
		fr.fly();
		
		SwimRobot sr=new SwimRobot();
		sr.move();//call override method
		sr.attack();
		sr.swim();
		
		//method�� �Ϻ� ���븸 �ٲ�
		Second s=new Second();
		s.show();
	}

}
