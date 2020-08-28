
public class SwimmingRobot extends Robot {
	String name;
	int HP;
	int duckFoot;
	
	//이동, 공격, 헤엄
	//Robot의 멤버(중복된 코드)를 가져옴 -상속
	//extends Robot 작성 → 아무것도 안써도 이미 
	//Robot의 멤버들을 모두 보유한 상태
	void swimming() {
		System.out.println("음파!! 음파!!");
	}

}
