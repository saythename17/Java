package com.ruby.java.test1;

public class Professor extends Person {
	private String subject;
	
	public Professor() {
		// TODO Auto-generated constructor stub
		System.out.println("Professor");	
	}
	public Professor(String name,int age, String subject) {
		// TODO Auto-generated constructor stub
		super(name,age);
		this.subject=subject;
	}
	public String getSubject() {
		return subject;		
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public String toString() {
		return super.toString()+" : "+subject;
		
	}

}
