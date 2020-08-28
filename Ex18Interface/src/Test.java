//interface정의 ≒class정의
//interface ≒ abstract class :추상메소드를 멤버로 가진 클래스
//서로 다른 클래스가 같은 이름을 가진 메소드를 사용하도록 만든 것
//new로 객체 생성불가
public interface Test {
/*interface의 특징
 * 1.변수 : 인스턴스변수, static변수, 인스턴스method를 가질 수 없음
 * (field: static final 상수만 사용 가능)*/
	final int a=10;//final field : 선언과 동시에 명시적 초기화해야함
	               //static생략가능
	int b=20; //명시적 초기화시, 자동으로static final로 변경
/*2.메소드 : 인터페이스 안에서는 추상메소드, static method만 사용 가능 */
	abstract void aaa();
	void bbb();//자동 abstract화 
	static void ccc() {	}//JDK 1.8ver~가능
/*3.인터페이스 멤버의 접근제한자 : public*/
	//private static final int c=1;//ERROR
	//protected static final int d=2;//ERROR
	public static final int e=3;//public만 가능
	int e2=4;//public 생략 가능
	//method도 public만 가능
/*4.인터페이스: 메소드구현이 완성되지않은(추상클래스)설계도
 * ∴ 반드시 메소드구현후 사용가능 */
	//이름만있고 메소드 구현(implement)X이 없는 클래스로 생각
/*5.인터페이스를 사용하려면 새로운 클래스를 정의하여 기능을 구현후 사용 */
/*6.인터페이스의 구현:일종의 상속->UP casting 사용가능*/	
	
	
	
	
	
	
	
/*7.인터페이스도 이너클래스를 가질 수 있음*/
	//inner class : General <public static>
	class Hello{
		void show() {
			System.out.println("HEllo");
		}
	}
	//이너클래스는 외부에서 인식 불가.->outer명쓰고 사용
	//이너클래스는 객체생성 불가
	//BUT! static inner class: 객체 생성 가능
	Test.Hello h=new Hello();
	
/*8.인터 페이스는 다중구현 가능*/
	//public class CCC implements AAA, BBB {}
	//같은 이름의 abstract method가 있으면 하나만 override하면됨
	
/*9.인터페이스도 다른 인터페이스 상속(extends)가능*/
	//인터페이스 끼리는 상속
	//interface A extends B{}
	//A는 B의 abstract method를 보유한 상태
	//p.s인터페이스는 클래스를 상속할 수 없음
	
	
}//Test interface

