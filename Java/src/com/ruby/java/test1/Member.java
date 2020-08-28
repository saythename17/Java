package com.ruby.java.test1;

public class Member {
	
	private String name;
	private int age;
	public Member() {
		this("guest");
	}
	public Member(String name) {
		this(name,0);
	}
	public Member(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return name+" : "+age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mem1=new Member();
		Member mem2=new Member("Carot");
		Member mem3=new Member("Carot",17);
		
		System.out.println(mem1.toString());
		System.out.println(mem2.toString());
		System.out.println(mem3.toString());

	}
}


