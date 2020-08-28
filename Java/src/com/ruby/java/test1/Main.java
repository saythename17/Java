package com.ruby.java.test1;

public class Main {

	public static void main(String[] args) {
		// TODO Generic : Class�� �����Ҷ� �ڷ����� �������� �ʰ� 
		//				  new(��ü����)�� �� �����ϵ��� �ϴ� ���
		Box box=new Box();
		box.setA(10);//�ڵ� new Integer :Wrapper
		System.out.println(box.getA());//10���
		box.setA(3.14);//�ڵ� new Double : ����ڽ�
		System.out.println(box.getA());//3.14���
		box.setA("Hello");//�ڵ� new String
		System.out.println(box.getA());//Hello ���
		box.setA(10);
		
		int n=new Integer(50);//�ڵ�����ȯ �⺻���갴ü��
		Integer k=50;//Wrapper class : �⺻�ڷ����� ���δ� ��ü
		//int num=box.getA(); ���ϵǴ� ���� Object�̱� ������ ERROR
		int num=(int)box.getA();//==(integer)box.getA(); 
		//		 �� Down casting(����ȯ)
		//Object�ڷ����� ���� ���� �������� down casting �ؾ���
		//�鰴ü����(new)�Ҷ� �ڷ��������ϴ� ���� :Generic
		Box2<String> box2=new Box2<String>();//Box2 class��<T>��<String>���� ����
		box2.setA("SVT");
		System.out.println(box2.getA());//SVT���
		//��, �⺻�� �ڷ����� <>�ȿ� ���Ұ�
		//Box2<double> box3=new Box2<double>();---ERROR
		//�⺻���� ��ü(����)������ �ڵ� �����ִ� Ŭ���� : Wrapper class
		// int��Integer, double��Double, boolean��Boolean ��
		Box2<Integer> box3=new Box2<Integer>();
		box3.setA(new Integer(10));
		box3.setA(10);//���Ͱ������. �ڵ� new Integer
		Integer i=box3.getA();
		int i2=box3.getA();//���Ͱ������. �ڵ� new Integer
		System.out.println(i2);//10���
		
		Box3<String, Integer> box4=new Box3<String, Integer>();
		box4.a="aaa";
		box4.b=10;		
	}
}
//
class Box{
	Object a;//4byte ��������
	//Object:�ֻ�����ü,���class�� parent/super,root
	void setA(Object a) {
		this.a=a;
	}
	Object getA() {
		return a;
	}
}
//Generic - Ŭ������ �����Ҷ� ����� �ڷ����� �������� ����
//���� �ٲ�ġ�� : class�� ��ü�� new(����)�ɶ� <T>��ġ�� ������ �ڷ�������
//			 class�� T�� ���ڹٲ�ġ�� ��
class Box2<T>{
	T a;
	void setA(T a) {
		this.a=a;
	}
	T getA() {
		return a;
	}
}
//Generic �ٸ� �ڷ��� ������ ��밡��
class Box3<T,E>{//Type, Element(���)
	T a;
	E b;
}
