
public class Person {
	// Field : private
//	private String name;//null
//	private int age;//0
//	// Method : Public
//	//When-create Constructor, Access Modifier : (usually)public
//	public Person(String name, int age) {
//		this.name=name;
//		this.age=age;
//		System.out.println("Create Person class Constructor");
//	}
//	//Constructor Overloading
//	Person(){
//		System.out.println("Create Person");
//		this.name="no named";
//		this.age=1717;
//	}
//	public void show() {
//		System.out.println("name : "+name);
//		System.out.println("age : "+age);
//		System.out.println();
//	}
	
	
	
	
	
	
	
	
	
	
	//field-information modifier정보은닉
	private String name;//필드 기본값 null
	private int age;//필드 기본값0
	
	//Constructor : 객체가 생성(new)될때 자동으로 호출되는 메소드
	//Constructor Overloading
	//parameter를 전달받아 field에 넣기
	public Person(String name, int age){//메소드중 유일하게 리턴 타입 명시X
		System.out.println("name age");
		//필드값 초기화
		this.name=name;
		this.age=age;
	}
	public Person() {
		this("익명",0);//제약조건 : 반드시 첫번째 문장으로 작성
		System.out.println(":::");		
	}
	
	
	
	
	

}
