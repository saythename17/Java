package com.ruby.java.test1;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee("������",28,"Actor");
		Professor p=new Professor("������",30,"game developer");
		Student s=new Student("�����",27,"architect");
		
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());

	}

}
