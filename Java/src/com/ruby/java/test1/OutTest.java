package com.ruby.java.test1;

public class OutTest {
	public static void main(String[] args) {
		OuterClass outer=new OuterClass();
		OuterClass.InstanceClass inner=outer.new InstanceClass();
		inner.a=123;
		inner.method();
		
	}

}
