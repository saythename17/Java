
public class Person {
	// Field : private
//	private String name;//null
//	private int age;//0
//	// Method : Public
//	//When-create Constructor, Access Modifier : (usually)public
//	public Person(String name, int age) {
//		this.name=name;
//		this.age=age;
//		System.out.println("Create Person class Constructor");
//	}
//	//Constructor Overloading
//	Person(){
//		System.out.println("Create Person");
//		this.name="no named";
//		this.age=1717;
//	}
//	public void show() {
//		System.out.println("name : "+name);
//		System.out.println("age : "+age);
//		System.out.println();
//	}
	
	
	
	
	
	
	
	
	
	
	//field-information modifier��������
	private String name;//�ʵ� �⺻�� null
	private int age;//�ʵ� �⺻��0
	
	//Constructor : ��ü�� ����(new)�ɶ� �ڵ����� ȣ��Ǵ� �޼ҵ�
	//Constructor Overloading
	//parameter�� ���޹޾� field�� �ֱ�
	public Person(String name, int age){//�޼ҵ��� �����ϰ� ���� Ÿ�� ���X
		System.out.println("name age");
		//�ʵ尪 �ʱ�ȭ
		this.name=name;
		this.age=age;
	}
	public Person() {
		this("�͸�",0);//�������� : �ݵ�� ù��° �������� �ۼ�
		System.out.println(":::");		
	}
	
	
	
	
	

}
