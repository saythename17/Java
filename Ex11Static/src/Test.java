
public class Test {
	public int a;/*member variable/field
	     == instance variable*/
	public static int b;/*static member variable
	     == class variable - (only one in class)*/
	
	public Test(int a, int b) {//constructor method
		this.a=a;
		this.b=b;
		//Test class������ ��밡�� but Test ��ü �޸𸮾ȿ� ��������
	}
	void shew() {
		System.out.println("show ");
		System.out.println(a);//instance variable ���
		System.out.println(b);//class variable ���
	}
	
	static void show() {//static method
		System.out.println("show static method");
		//System.out.println(a);--ERROR
		//static method������ instance variable ��� �Ұ�
		//��ü ���� ���� ȣ��-instance���� a:����X
		System.out.println(b);//class variable ���
	}
	

}
