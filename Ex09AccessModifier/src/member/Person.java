package member;

public class Person {
	//��������
	private String name;
	private int age;
	private String nation;
	//��������� �� �����ϴ� �޼ҵ�
	public void setMembers(String name,int age, String nation) {
		this.name=name;
		this.age=age;
		this.nation=nation;
	}
	//������� �� ��� �޼ҵ�
	public void show() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("nation : "+nation);
		System.out.println();
	}

	
	//��������� ���� ����  :: setter Method :: 
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setNation(String nation) {
		this.nation=nation;
	}
	
	//��������� ���� return :: getter Method ::
	public String getName() {
		return name;//or this.name;
	}
	public int getAge() {
		return age;
	}
	public String getNation() {
		return nation;
	}
	
	
	//getter,setter�ڵ� �ϼ� ���
	/*���콺 ������ ��ư source
	 *(�ڵ�)Generate getters and Setters
	 *check
	 *��ġ ���� -After �޼ҵ�()
	 *
	 *
	 *
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}*/
}
