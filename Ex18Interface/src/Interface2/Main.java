package Interface2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//팀장이 인터페이스를 설계하고 추상메소드의 이름을 정하면
		//팀원들이 그이름을 토대로 기능을 구현하여 클래스 설계
		//for 메소드 명칭의 규격화
		//팀장 : Unit 인터페이스 설계 attack(), move()
		//팀원1 : Marine class정의 및 Unit구현
		//팀원2 : Tank class정의 및 Unit구현
		//팀원1 : Race class정의 및 Unit구현
		//모든 클래스에 attack(), move() 기능이 있음
		
		//팀장은 만들어진 class들을 이용해 게임 프로그래밍 작성
		//각 클래스의 참조변수를 사용하지않고
		//parent class역할인 Unit interface 참조변수 이용
		//모든 유닛 제어가능
		//Unit[] units=new Unit[200];
		//실제 게임 개발 : 배열은 개수가 고정되어있어서 잘 안씀
		//생성과 소멸이 반복되는 게임 프로그램에 적합하지 않음
		//실제 앱을 만들때는 ArrayList(유동적 배열, 기차선연결)을 더 많이 사용
		ArrayList<Unit> units=new ArrayList<Unit>();
		//개수가 0인 유동적배열로 생성됨
		//요소개수 리턴하는 method 호출
		int num=units.size();//size() : 배열의 length()
		System.out.println(num);
		
		//배열에 Unit객체 생성하여 추가
		units.add(new Marine());
		units.add(new Tank());
		units.add(new Marine());
		units.add(new Race());		
		System.out.println("유닛개수 : "+units.size());
		System.out.println("==========");
		
		//Unit기능 사용
		Unit u=units.get(0);//요소하나 가져오기
		u.attack();
		u.move();
		for(Unit t:units) {//확장 for문
			t.attack();
			t.move();
			//Marine, Tank만 levelUp기능 추가 
			//인터페이스명-able을 선호
			//현재 요소(index-units)가 Marine객체면?
		
			if(t instanceof Marine) {
				Marine m=(Marine)t;
				m.levelup();
				}else if(t instanceof Tank) ((Tank)t).levelup();
				//위 if -else if문을 더 간결하게 나타내기
//Marine과 Tank가 모두 Levelupable의 자식이므로↓
				if(t instanceof Levelupable) {
					Levelupable a=(Levelupable)t;
					a.levelup();
					}			
				}
		u=units.get(1);
		u.attack();
		u.move();		
	}

}
