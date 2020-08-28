package com.ruby.java.test1;

public class Employee extends Person{
	private String work;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee");
	}
	public Employee(String name, int age, String work) {
		// TODO Auto-generated constructor stub
		super(name,age);
		this.work=work;
	}
	
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work=work;
	}
	public String toString() {
		return super.toString()+" : "+work;
	}

}
