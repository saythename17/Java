package Polymorphysm2;

import java.util.Random;

public class Main3 {

	public static void main(String[] args) {
		//Pet(Dog,Cat,Pig)class 생성하는 공장객체 생성
		PetFactory pf=new PetFactory();
		
		/*DOWN casting*/
//		Dog d=(Dog)pf.makePet(1);//explicit 명시적 형변환
//		//이 메소드의 리턴자료형이 Pet으로 보여지기에 Dog로 형변환 요함 
//		d.sound();d.guardHouse();
//		Cat c=(Cat)pf.makePet(2); c.sound();c.handleDeacon();
//		Pig p=(Pig)pf.makePet(3); p.sound();p.eatAndEat();
//		System.out.println();
//		//only one-Pet(parent) reference variable
//		//control another classes
//		Pet pet=new Pet();
//		pet=pf.makePet(1);//Dog return
//		pet.sound();//Dog 고유기능 사용불가->Dog 참조변수 생성
//		Dog dog=(Dog)pet; dog.guardHouse();
//		pet=pf.makePet(2);//Cat return
//		pet.sound();
//		((Cat)pet).handleDeacon();//고유 참조변수 없이 사용 -형변환 우선순위 주의
//		pet=pf.makePet(3);//Pig return
//		pet.sound();
//		((Pig)pet).eatAndEat();
//		System.out.println("==============");
		
		
		
		
		//응용예제
		//랜덤하게 5개의  동물 class생성&제어
		Random rnd=new Random();
		Pet[] pets=new Pet[5];//pets참조변수 5개 not 배열 5개
		for(int i=0;i<pets.length;i++) {
			int n=rnd.nextInt(3)+1;
			pets[i]=pf.makePet(n);
		}
		//실행
		for(int i=0;i<pets.length;i++) {
			pets[i].sound();
			pets[i].sleep();
		//만들어진 class들의 고유기능 사용(예측불가능한 calss일때)
		//[instanceof] 연산자 사용 : 어떤 객체의 자료형(class)가 맞는지 알려주는 연산자
		//  └이항 연산자| A(참조변수명) instanceof B(class명)==[true] or [false]
		if (pets[i] instanceof Dog ) {
			Dog k=(Dog)pets[i];
			k.guardHouse();
		}else if (pets[i] instanceof Cat) {
			Cat g=(Cat)pets[i];
			g.handleDeacon();
		}else if(pets[i] instanceof Pig) {
			((Pig)pets[i]).eatAndEat();
		}
		}
		
		//Pet class는 객체를 반들기위해 정의한 클래스가 아니라
		//but 실수로 Pet class를 만든다면?
		//Pet a=new Pet();
		//a.sound();//동작하지 않는 메소드-불필요
		//****Pet이 실수로라도 생성(new)되지 않도록 문법적으로 막기
		//추상(abstract)class로 만들면 new로 객체 생성불가
	}

}
