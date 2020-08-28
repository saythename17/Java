package exercise;

public class Member {
	private String name;
	private int age;
	public Member() {//parameter X : default Constructor
		System.out.println("Member2() Constructor"+name+age);
	}
	public Member(String name) {
		System.out.println("Member2() Constructor&"+name+age);
	}
	public Member(String name,int age) {
		System.out.println("Member2() Constructor&"+name+age);
	}

	public static void main(String[] args) {
		System.out.println("main Method");
		new Member();
		new Member("SVT");
		new Member("SVT",17);
	}
}
