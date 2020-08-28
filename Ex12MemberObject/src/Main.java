
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//클래스안에 다른 클래스의 참조변수가 멤버변수로 있을 경우에 대한 고려사항 학습!!!
		Car car= new Car();
		//멤버변수 출력!!		
		System.out.println( car.model );
		System.out.println("^^"+ car.p );
		System.out.println();
		
		//멤버변수에 값 대입
		car.model= 10;
		car.p= new Person(); //객체를 생성하여 참조변수에 대입
		
		//멤버변수 출력!!		
		System.out.println( car.model );
		//System.out.println( car.p );
		//멤버변수로 존재하는 객체의 멤버변수를 출력해야 올바른 출력
		System.out.println( car.p.name  );
		System.out.println( car.p.age );
		System.out.println();
		
		//결국 멤버로 존재하는 객체의 멤버변수까지 값을 대입해줘야만 했었음.
		car.p.name= "sam";
		car.p.age= 20;
		
		System.out.println( car.model );
		System.out.println( car.p.name );
		System.out.println( car.p.age );
		System.out.println();
		
		//위 출력코드가 좀 짜증!!!
		//Person의 멤버까지 여기서 하니까 짜증!!
		//객체의 값 출력은 객체 스스로... [ 니껀 니가!!!! ]
		System.out.println( car.model );
		car.p.show();
		System.out.println();
		
		//어!! 그러고 보니 Car도 객체!!
		//Car도 본인의 값은 본인이 출력할 수 있겠죠!!
		car.show();
		System.out.println();
		
		//이런식이면 객체의 멤버값을 넣는 것도..짜증!!
		//이것도 메소드로.....처리
		
		//새로운 객체를 만들어도 어렵지 않게 출력할 수 있음.
		Car car2= new Car();
		car2.model= 100;
		car2.p= new Person();
//		car2.p.name= "robin";
//		car2.p.age= 25;
		//Person의 멤버값 대입을 직접하기 보다는 입력기능이 있다면
		//더 간결히 코드가 가능
		car2.p.setMembers("robin", 25);	
		car2.show();
		
		//이런식이면 Car의 멤버값 대입도 메소드를 이용
		Car car3= new Car();
		Person p= new Person();
		p.setMembers("kim", 30);
		car3.setMembers(300, p);
		car3.show();
		
		//위 코드가 편하지 않음.
		Car car4= new Car();
		car4.setMembers(400, "hong", 35);
		car4.show();
		
		//위 코드도 짜증.
		//새로운 객체 생성할 때마다 다음줄에 꼭 setMembers()메소드를
		//호출하는 코드가 추가됨..
		//객체가 생성될 때 멤버값들 미리 초기화 하면 더 편하겠죠???
		Car car5= new Car(500, "lee", 40);
		car5.show();
		
		Car car6= new Car();
		car6.show();
		
		
		
		
	}

}
