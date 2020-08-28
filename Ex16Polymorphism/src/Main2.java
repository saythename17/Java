
public class Main2 {

	public static void main(String[] args) {
		// TODO 다형성이 왜 필요한가
		//예) 앱에 동물캐릭터 class 생성(Dog, Cat, Pig)
		
		//만약 동물 class를 여러개 생성해야 한다면?
		//예)Dog=5마리,Cat=10마리,Pig=3마리
		//배열을 사용해 여러객체를 하나로 용이하게 관리할까?Animal[] dogs=new Animal[5];
		//배열로 묶었기 때문에 전체를 하나로 제어하는 것이 불가능
//동물종류로 묶어 배열생성→하나의 배열에 모든 class들을 묶어서 더 수월하게 control
		//But! 서로 class(자료형)이 달라 하나의 배열로 처리 불가 
//∴ Dog, Cat,Pig 모두 참조할 수 있는 (super class)자료형을 생성해 하나의 배열로 묶기
		//Animal 참조변수로 Dog,Cat,Pig class참조 가능
		Animal ani=new Dog();//UP casting :묵시적 형변환/DOWN :명시적
		Animal ani2=new Cat();//[parent-child]
		Animal ani3=new Pig();
		//[=연산자]: 좌우 자료형이 같아야함 -> 작은걸 큰 거에 넣을 때는 자동으로 형변환
		//형변환한 값을 자료형에 맞게 새로운 주소에 저장하는 것
		double a=10;//(double)10;-묵시적 형변환Implicit
		int b=(int)3.14;//명시적 형변환Explicit
		ani.sound();//참조변수가 참조하는 인스턴스의 say(override)ON!
		ani2.sound(); ani3.sound();System.out.println();
		
		//Animal 참조변수를 배열로 생성해 class여러개를 더 수월하게 관리,제어
		Animal[] anis=new Animal[5];//Animal class가 5개X 참조변수가 5개
		anis[0]=new Dog();
		anis[1]=new Cat();
		anis[2]=new Pig();
		anis[3]=new Dog();
		anis[4]=new Cat();		
		for(Animal t: anis) {
			t.sound();
		}
		System.out.println();
		//다형성은 배열로만 사용하지 않고
		//메소드의 파라미터나 리턴타입으로 유용하게 사용

	}

}
