
public class Main {

	public static void main(String[] args) {
		// TODO abstract TODO -> method, class 
		//Animal을 상속하는 Dog Cat Pig class 선언
		Animal[] anis=new Animal[5];
		anis[0]=new Dog();
		anis[1]=new Cat();
		anis[2]=new Dog();
		anis[3]=new Pig();
		
		anis[0].say();//참조하는 class Dog의 say발동
		anis[1].say();
		anis[2].say();
		anis[3].say();
		//abstract class는 객체생성 불가
		//Animal animal=new Animal();---ERROR
		
	
		//---------------------------------
		//abstract class: new를 이용해 객체생성 불가
		//추상 클래스(:생성 불가) ∴ 새로운 클래스 생성→ extends로 상속받아 사용
		//Cannot instantiate : abstract or interface
		System.out.println();
		//추상 클래스 사용 : 추상클래스를 상속한 sub클래스를 객체로 생성하여 사용
		AAA obj=new AAA();//reference variable obj
		          		  //call constructor
		obj.aaa();//instance method-참조변수
		obj.a=100;//instance variable-참조변수
		Test.ccc();//static method-생성된 class
		Test.b=60;//static method-생성된 class
		//abstract's Polymorphism
		Test t=new AAA();//UP casting(parent->child)
		t.aaa();//AAA's aaa()
		t=new BBB();//부모참조변수 업캐스팅
		t.aaa();//BBB's bbb()
				
		//Anonymous class(익명 클래스) : 클래스이름없이 새로운 클래스를 정의
		Test t2=new Test() {//new(객체생성)할 때 클래스 정의(바꿔치기)
			//Test 객체가 아님!!!! Test를 상속받은 익명 객체---UP casting
			//anonymous '익명'클래스는 이름이 없기에 new할때 1개만 생성가능
			@Override
			void aaa() {
				System.out.println("Annoymous's aaa()");				
			}
			//anonymous 의 고유 method---참조변수를 만들 수 없기 때문에 사용 불가
			//사용하려면 new Test() {void method(){}}.method;
			int s= new String("aaa").length();//와 같이 사용
			void special() {
				System.out.println("anonymous's special()");
			}
		};
		t2.aaa();
		//Anonymous 활용
		anis[4]=new Animal() {
			@Override
			void say() {
				System.out.println("꽥꽥!!!!!!!!!!");				
			}//한번만 사용가능
		};
		anis[4].say();
		
		
		
	}
}



















abstract class Animal{//for Inheritance
	//기능은 없고 이름만 존재하는 메소드 (override용)
	abstract void say();/*추상 메소드 : abstract
			☆★추상 메소드를 보유한 클래스는 반드시 추상클래스
			  p.s 추상 클래스에는 추상 메소드만 있지 않아도 됨*/	
}
class Dog extends Animal{
//The sub class must implement the inherited abstract method super class 
//abstract class's sub class must have super class's abstract method override 
//추상 method를 보유한 추상 class를 상속받으면 반드시 abstract method를 override할 의무가 있음 
	@Override //annotation 강제주석
	void say() {
		System.out.println("멍멍!!");		
	}	
}
class Cat extends Animal{	
	void say() {
		System.out.println("야옹~~");
	}
	//implement :구현, 실체화
}
class Pig extends Animal{
	@Override
	void say() {
		System.out.println("꿀꿀");		
	}	
}