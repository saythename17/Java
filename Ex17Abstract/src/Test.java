//abstract class : new�� ��ü���� �Ұ�->�ݵ�� ����ؼ� ���
public abstract class Test {
	int a;//instance variable
	static int b=10;//static(class) variable
	
	//Abstract class must have Constructor,too
	public Test() {
		System.out.println("Create Test class");
	}	
	//instance method --��ü�� �޸𸮿� �ö󰥶� ����
	void show() {
		System.out.println("instance method");
	}
	//abstract method
	abstract void aaa();
	//��static & abstract �Բ� �� �� ������
	//static abstract viod bbb();---ERROR
	
	//static method
	static void ccc() {
		System.out.println("static method");
	}	
	}

//create new class inherited abstract class Test
class AAA extends Test{
	void aaa() {};
	
	public AAA() {//constructor
		System.out.println("������AAA class's aaa()");
	}
}
class BBB extends Test{

	@Override
	void aaa() {
		System.out.println("������BBB class's aaa()");
		
	}
	
}
