package com.ruby.java.test1;

public class Static {
	static class SC{
		int a;
		static int s;
		void method() {
			System.out.println("SC's method : "+a);
		}
		static void smethod() {
			System.out.println("Static method : "+s);
		}
	}

}
