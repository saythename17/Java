package com.ruby.java.test1;

public class Local {
	public void method() {
		class LocalClass{
			int a;
			void method() {
				System.out.println("LocalClass : "+a);
			}
		}
		LocalClass lo=new LocalClass();
		lo.a=20200423;
		lo.method();
	}

}
