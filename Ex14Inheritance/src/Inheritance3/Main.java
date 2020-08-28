package Inheritance3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second s=new Second();
		s.show();
		
		//Create class through Constructor Method(parameter)
		//파라미터에 값을 전달하며 객체 생성--생성자를 이용해 값을 초기화
		Second s2=new Second(1,2);
		s2.show();
		
		//Inheritance's inheritance
		//(Grandparent-parent-child)
		Third t=new Third();
		
		//또다른 클래스가 반복해서 상속가능
		Second2 ss=new Second2();
		
		//다중상속(한꺼번에 여러개의 클래스를 상속받는 것) : Java에서는 사용불가
		//class child extends Parent1,Parent2{	}---ERROR
	}

}
