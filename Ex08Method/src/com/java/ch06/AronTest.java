package com.java.ch06;

public class AronTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aron suit =new Aron();
		Aron suit2= new Aron();
		Aron suit3=new Aron();
		
		suit.setName("silver");
		suit.setHight(180);
		System.out.println(suit.getName()+suit.getHeight());
		suit2.setName("black");
		suit2.setHight(220);
		System.out.println(suit2.getName()+suit2.getHeight());
		suit3.setName("red");
		suit3.setHight(200);
		System.out.println(suit3.getName()+suit3.getHeight());

	}

}
