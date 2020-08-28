package com.ruby.java.test1;

public class Main {

	public static void main(String[] args) {
		// TODO Generic : Class를 설계할때 자료형을 결정하지 않고 
		//				  new(객체생성)할 때 결정하도록 하는 기법
		Box box=new Box();
		box.setA(10);//자동 new Integer :Wrapper
		System.out.println(box.getA());//10출력
		box.setA(3.14);//자동 new Double : 오토박싱
		System.out.println(box.getA());//3.14출력
		box.setA("Hello");//자동 new String
		System.out.println(box.getA());//Hello 출력
		box.setA(10);
		
		int n=new Integer(50);//자동형변환 기본형↔객체형
		Integer k=50;//Wrapper class : 기본자료형을 감싸는 객체
		//int num=box.getA(); 리턴되는 값이 Object이기 때문에 ERROR
		int num=(int)box.getA();//==(integer)box.getA(); 
		//		 └ Down casting(형변환)
		//Object자료형을 쓰면 값을 쓸때마다 down casting 해야함
		//↓객체생성(new)할때 자료형결정하는 문법 :Generic
		Box2<String> box2=new Box2<String>();//Box2 class안<T>→<String>으로 변경
		box2.setA("SVT");
		System.out.println(box2.getA());//SVT출력
		//단, 기본형 자료형은 <>안에 사용불가
		//Box2<double> box3=new Box2<double>();---ERROR
		//기본옇을 객체(참조)형으로 자동 감싸주는 클래스 : Wrapper class
		// int→Integer, double→Double, boolean→Boolean …
		Box2<Integer> box3=new Box2<Integer>();
		box3.setA(new Integer(10));
		box3.setA(10);//위와같은결과. 자동 new Integer
		Integer i=box3.getA();
		int i2=box3.getA();//위와같은결과. 자동 new Integer
		System.out.println(i2);//10출력
		
		Box3<String, Integer> box4=new Box3<String, Integer>();
		box4.a="aaa";
		box4.b=10;		
	}
}
//
class Box{
	Object a;//4byte 참조변수
	//Object:최상위객체,모든class의 parent/super,root
	void setA(Object a) {
		this.a=a;
	}
	Object getA() {
		return a;
	}
}
//Generic - 클래스를 설계할때 멤버의 자료형을 결정하지 않음
//글자 바꿔치기 : class의 객체가 new(생성)될때 <T>위치에 지정된 자료형으로
//			 class안 T가 글자바꿔치기 됨
class Box2<T>{
	T a;
	void setA(T a) {
		this.a=a;
	}
	T getA() {
		return a;
	}
}
//Generic 다른 자료형 여러개 사용가능
class Box3<T,E>{//Type, Element(요소)
	T a;
	E b;
}
