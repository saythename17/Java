public class Car {
	
	Person p;  //다른클래스를 멤버변수로..
	int model; //모델번호
	
	//멤버출력
	void show() {
		System.out.println( "model : " + model);
		//System.out.println(" p : "+ p);
		//System.out.println("name : "+ p.name);
		p.show();
	}
	
	//멤버입력
	void setMembers(int model, Person p) {
		this.model= model;
		this.p= p;
	}
	
	//멤버입력 오버로딩
	void setMembers(int model, String name, int age) {
		this.model= model;
		//this.p.name= name; //error
		//this.p.age= age;   //error
		// Person p참조변수에 객체를 만들어주지 않았기에..
		this.p= new Person();
		this.p.name= name;
		this.p.age= age;		
	}
	
	//생성자 메소드
	public Car(int model, String name, int age) {
		this.model= model;
//		this.p.name= name; //error : Person객체 없어서 에러
		this.p = new Person();
		this.p.setMembers(name, age);		
	}
	
	//생성자 메소드 오버로딩
	public Car() {
		this.model= 0;
		this.p=new Person();
	}

}

