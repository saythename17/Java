package Inheritance5;

public class Person {
	private String name;
	private int age;
	//Constructor :객체생성(new)될때 자동으로 실행되는 메소드
	public Person() {
		name="no name";		
		age= 0;
	}
	//constructor overloading
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void show() {
		System.out.println("name : "+ name);
		System.out.println("age : "+ age);
	}

}

class Student extends Person{
	private String major;
	
	Student() {
		super();//Explicit call
		major="";		
	}
	Student(String name, int age, String major) {
		super(name, age);
		this.major=major;
	}
	@Override
	public void show() {
		super.show();
		System.out.println("major : "+major);
	}
}

class Professor extends Person{
	private String subject="";
	public Professor() {
	
	}
	//constructor overloading
	public Professor(String name,int age, String subject) {
		super(name,age);
		this.subject=subject;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("subject : "+subject);
		System.out.println();
	}
}