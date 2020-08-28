package com.ruby.java.test1;

public class Student extends Person {
	private String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("Studetn");
	}
	public Student(String name, int age, String major) {
		// TODO Auto-generated constructor stub
		super(name,age);
		this.major=major;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major=major;
	}
	public String toString() {
		return super.toString()+" : "+major;
		
	}

}
