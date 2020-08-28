import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;//import 단축키:control+shift+o
//https://docs.oracle.com/javase/7/docs/api/
//로들어가면 자세한 class사용 설명이 나와있음

//모든 클래스들이 기본으로 상속받는 클래스 : Object
public class Main {

	public static void main(String[] args) {
		// TODO Object class
		Test t=new Test();
		//Test class는 명시적으로는 아무것도 상속받지 않았지만
		//자동으로 Object라는 class상속
		//∴ 직접 만들지않아도 상속받은 메소드 보유 
		
		//Object class =Java에 존재하는 모든 클래스의 root(최상위) class
		//모든 class 의 super class
		//∴ 모든 클래스 참조가능(Object 참조변수:만능 참조변수)
		Object obj=null;
		obj=new Test();//UP casting
		obj=new Random();
		obj=new String();
		obj=new Scanner(System.in);
		obj=new ArrayList();
		//Object parameter에는 모든 값(모든 class) 전달가능		
		
//Object class의 주요 method
//● toString() : 객체를 소개하는 문자열을 리턴해주는 메소드
		String s=t.toString();//[default : "클래스명@해쉬코드"]
		//System.out.println(s);
		Test t2=new Test();//다른객체
		//System.out.println(t2.toString());
		Random rnd=new Random();
		//System.out.println(rnd.toString());//["패키지명.클래스명@해쉬코드"]
		//System.out.println(t);
		//System.out.printle() :참조변수 출력== 자동으로 그 참조변수의 toString()을 실행.
		//단, 참조변수가 객체를 참조하지 않으면(null)이면 그냥 null값 출력
		String s2=new String("HELLO");//Object에게 상속받은 toString() override
		//System.out.println(s2.toString());
		//System.out.println(s2);//출력값 같음. 생략 가능
		//Fist class's toString() override
		First f=new First();
		//System.out.println(f);//==f.toString
		//자동 toString : Object parameter 전달값을 override한 것
		//System.out.println();System.out.println();
		
		
//● equals(Object obj) : 전달받은  obj와 같은 객체인지 여부를 판단해 리턴 [true or false]
//		Test t3=new Test();//서로 다른 객체 생성
//		Test t4=new Test();
//		System.out.println(t3.equals(t4));
//		Test t5=t3;//같은 주소를 공유함
//		System.out.println(t3.equals(t5));
//		/*↓ equals보다 아래의 형태로 더 많이씀*/
//		System.out.println(t3 == t5);//주소값끼리 비교
//		//String class: equals()를 field 값 비교에 사용
//		String s3=new String("HELLO");
//		String s4=new String("HELLO");
//		System.out.println(s3 == s4);//주소 비교
//		System.out.println(s3.equals(s4));//필드값 비교
//		//└String class가 equals를 주소가 아닌 field 값 비교로 override한 것 
//		First f2= new First();
//		First f3= new First();		
//		System.out.println( f2.equals(f3) );
//		System.out.println();System.out.println();
		
//● hashCode() : 객체의 해쉬코드(논리적주소)를 반환 [return type: int]
		//자바에서의 객체주소
		Test t7=new Test();
		System.out.println(t7.hashCode());//10진수로 주소 리턴
		System.out.println(t7.toString());//위와 같은 값, 16진수
		System.out.println(Integer.toHexString(t7.hashCode()));
		//16진수로 바꾸는 method를 이용하여 확인해보면 같은 값
		System.out.println();
		
//● getClass : 클래스의 정보 리턴[return type: class]
		Test t6=new Test();
		Class a=t6.getClass();
		System.out.println(a.getName());//class's name
		System.out.println(a.getSuperclass());//superclass name
		System.out.println(a.getModifiers());
		/*getClass()를 줄여서 ↓*/
		System.out.println(Test.class.getName());
		//참조변수 없이 사용-Test class에 대한 정보 리턴
		
//● wait(), notify(), notifyAll() -Tread
		
	}

}
