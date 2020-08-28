package Inheritance4;

public class FlyRobot extends Robot{
	//Robot의 move와 attack method 보유
	void fly() {
		System.out.println("와~난다~~\n");
	}
	
	//Override : 상속받은 메소드 리모델링/기능 바꿔치기
	/*가려진다*---바뀐기능에 적합한 것으로만 사용
	 * class에 어울리지않는 method가 노출되지 않게 가릴 수 있다*/
	public void move() {//same method name with super's method 
		                //only allow in Inheritance
		System.out.println("슝~~~~~~~");
	}
	public void attack() {
		System.out.println("피~~요오오오오옹");
	}
}

class SwimRobot extends Robot{
	void swim() {
		System.out.println("음~파! 음~파!\n");
	}	
	@Override
	//└annotation : 강제 주석  @XXX-문법에 맞아도 주석과 어울리지 않는 코드는 ERROR
	public void move() {
		System.out.println("첨벙첨벙");
	}
	@Override
	public void attack() {
		System.out.println("찌릿찌릿!");
	}
}
