
public class Person {
	String name;
	int age;
	//��� ��� �޼ҵ�
	void show() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
	}
	//�Է� ��� �޼ҵ�
	void setMembers(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//������ �޼ҵ�
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	//������ �޼ҵ� �����ε�
	public Person() {
//		this.name="�͸�";
//		this.age=0;
		this("�͸�",0);
	}

}
