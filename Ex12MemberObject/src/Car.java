public class Car {
	
	Person p;  //�ٸ�Ŭ������ ���������..
	int model; //�𵨹�ȣ
	
	//������
	void show() {
		System.out.println( "model : " + model);
		//System.out.println(" p : "+ p);
		//System.out.println("name : "+ p.name);
		p.show();
	}
	
	//����Է�
	void setMembers(int model, Person p) {
		this.model= model;
		this.p= p;
	}
	
	//����Է� �����ε�
	void setMembers(int model, String name, int age) {
		this.model= model;
		//this.p.name= name; //error
		//this.p.age= age;   //error
		// Person p���������� ��ü�� ��������� �ʾұ⿡..
		this.p= new Person();
		this.p.name= name;
		this.p.age= age;		
	}
	
	//������ �޼ҵ�
	public Car(int model, String name, int age) {
		this.model= model;
//		this.p.name= name; //error : Person��ü ��� ����
		this.p = new Person();
		this.p.setMembers(name, age);		
	}
	
	//������ �޼ҵ� �����ε�
	public Car() {
		this.model= 0;
		this.p=new Person();
	}

}

