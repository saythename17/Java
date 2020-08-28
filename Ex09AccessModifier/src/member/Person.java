package member;

public class Person {
	//정보은닉
	private String name;
	private int age;
	private String nation;
	//멤버변수에 값 대입하는 메소드
	public void setMembers(String name,int age, String nation) {
		this.name=name;
		this.age=age;
		this.nation=nation;
	}
	//멤버변수 값 출력 메소드
	public void show() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("nation : "+nation);
		System.out.println();
	}

	
	//멤버변수의 값을 대입  :: setter Method :: 
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setNation(String nation) {
		this.nation=nation;
	}
	
	//멤버변수의 값을 return :: getter Method ::
	public String getName() {
		return name;//or this.name;
	}
	public int getAge() {
		return age;
	}
	public String getNation() {
		return nation;
	}
	
	
	//getter,setter자동 완성 기능
	/*마우스 오른쪽 버튼 source
	 *(자동)Generate getters and Setters
	 *check
	 *위치 선택 -After 메소드()
	 *
	 *
	 *
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}*/
}
