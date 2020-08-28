
public class Main {

	public static void main(String[] args) {
		// TODO abstract TODO -> method, class 
		//Animal�� ����ϴ� Dog Cat Pig class ����
		Animal[] anis=new Animal[5];
		anis[0]=new Dog();
		anis[1]=new Cat();
		anis[2]=new Dog();
		anis[3]=new Pig();
		
		anis[0].say();//�����ϴ� class Dog�� say�ߵ�
		anis[1].say();
		anis[2].say();
		anis[3].say();
		//abstract class�� ��ü���� �Ұ�
		//Animal animal=new Animal();---ERROR
		
	
		//---------------------------------
		//abstract class: new�� �̿��� ��ü���� �Ұ�
		//�߻� Ŭ����(:���� �Ұ�) �� ���ο� Ŭ���� ������ extends�� ��ӹ޾� ���
		//Cannot instantiate : abstract or interface
		System.out.println();
		//�߻� Ŭ���� ��� : �߻�Ŭ������ ����� subŬ������ ��ü�� �����Ͽ� ���
		AAA obj=new AAA();//reference variable obj
		          		  //call constructor
		obj.aaa();//instance method-��������
		obj.a=100;//instance variable-��������
		Test.ccc();//static method-������ class
		Test.b=60;//static method-������ class
		//abstract's Polymorphism
		Test t=new AAA();//UP casting(parent->child)
		t.aaa();//AAA's aaa()
		t=new BBB();//�θ��������� ��ĳ����
		t.aaa();//BBB's bbb()
				
		//Anonymous class(�͸� Ŭ����) : Ŭ�����̸����� ���ο� Ŭ������ ����
		Test t2=new Test() {//new(��ü����)�� �� Ŭ���� ����(�ٲ�ġ��)
			//Test ��ü�� �ƴ�!!!! Test�� ��ӹ��� �͸� ��ü---UP casting
			//anonymous '�͸�'Ŭ������ �̸��� ���⿡ new�Ҷ� 1���� ��������
			@Override
			void aaa() {
				System.out.println("Annoymous's aaa()");				
			}
			//anonymous �� ���� method---���������� ���� �� ���� ������ ��� �Ұ�
			//����Ϸ��� new Test() {void method(){}}.method;
			int s= new String("aaa").length();//�� ���� ���
			void special() {
				System.out.println("anonymous's special()");
			}
		};
		t2.aaa();
		//Anonymous Ȱ��
		anis[4]=new Animal() {
			@Override
			void say() {
				System.out.println("�в�!!!!!!!!!!");				
			}//�ѹ��� ��밡��
		};
		anis[4].say();
		
		
		
	}
}



















abstract class Animal{//for Inheritance
	//����� ���� �̸��� �����ϴ� �޼ҵ� (override��)
	abstract void say();/*�߻� �޼ҵ� : abstract
			�١��߻� �޼ҵ带 ������ Ŭ������ �ݵ�� �߻�Ŭ����
			  p.s �߻� Ŭ�������� �߻� �޼ҵ常 ���� �ʾƵ� ��*/	
}
class Dog extends Animal{
//The sub class must implement the inherited abstract method super class 
//abstract class's sub class must have super class's abstract method override 
//�߻� method�� ������ �߻� class�� ��ӹ����� �ݵ�� abstract method�� override�� �ǹ��� ���� 
	@Override //annotation �����ּ�
	void say() {
		System.out.println("�۸�!!");		
	}	
}
class Cat extends Animal{	
	void say() {
		System.out.println("�߿�~~");
	}
	//implement :����, ��üȭ
}
class Pig extends Animal{
	@Override
	void say() {
		System.out.println("�ܲ�");		
	}	
}