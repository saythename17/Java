package com.ruby.java.test1;

import java.util.EmptyStackException;

public class Test01 {
	public static void main(String[] args) {
		
	}
	int b=0;
	public void charge(int n) {
		if (n<0) {
			try{
				throw new Exception();
			}catch(Exception  e){
				System.out.println("");
			}
		}
		
}
}