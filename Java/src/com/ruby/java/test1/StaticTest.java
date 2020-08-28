package com.ruby.java.test1;

public class StaticTest {
	public static void main(String[] args) {
		Static.SC sc=new Static.SC();
		sc.a=123;
		sc.method();
		
		Static.SC.s=789;
		Static.SC.smethod();
	}

}
