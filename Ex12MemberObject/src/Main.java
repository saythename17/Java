
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ŭ�����ȿ� �ٸ� Ŭ������ ���������� ��������� ���� ��쿡 ���� ������� �н�!!!
		Car car= new Car();
		//������� ���!!		
		System.out.println( car.model );
		System.out.println("^^"+ car.p );
		System.out.println();
		
		//��������� �� ����
		car.model= 10;
		car.p= new Person(); //��ü�� �����Ͽ� ���������� ����
		
		//������� ���!!		
		System.out.println( car.model );
		//System.out.println( car.p );
		//��������� �����ϴ� ��ü�� ��������� ����ؾ� �ùٸ� ���
		System.out.println( car.p.name  );
		System.out.println( car.p.age );
		System.out.println();
		
		//�ᱹ ����� �����ϴ� ��ü�� ����������� ���� ��������߸� �߾���.
		car.p.name= "sam";
		car.p.age= 20;
		
		System.out.println( car.model );
		System.out.println( car.p.name );
		System.out.println( car.p.age );
		System.out.println();
		
		//�� ����ڵ尡 �� ¥��!!!
		//Person�� ������� ���⼭ �ϴϱ� ¥��!!
		//��ü�� �� ����� ��ü ������... [ �ϲ� �ϰ�!!!! ]
		System.out.println( car.model );
		car.p.show();
		System.out.println();
		
		//��!! �׷��� ���� Car�� ��ü!!
		//Car�� ������ ���� ������ ����� �� �ְ���!!
		car.show();
		System.out.println();
		
		//�̷����̸� ��ü�� ������� �ִ� �͵�..¥��!!
		//�̰͵� �޼ҵ��.....ó��
		
		//���ο� ��ü�� ���� ����� �ʰ� ����� �� ����.
		Car car2= new Car();
		car2.model= 100;
		car2.p= new Person();
//		car2.p.name= "robin";
//		car2.p.age= 25;
		//Person�� ����� ������ �����ϱ� ���ٴ� �Է±���� �ִٸ�
		//�� ������ �ڵ尡 ����
		car2.p.setMembers("robin", 25);	
		car2.show();
		
		//�̷����̸� Car�� ����� ���Ե� �޼ҵ带 �̿�
		Car car3= new Car();
		Person p= new Person();
		p.setMembers("kim", 30);
		car3.setMembers(300, p);
		car3.show();
		
		//�� �ڵ尡 ������ ����.
		Car car4= new Car();
		car4.setMembers(400, "hong", 35);
		car4.show();
		
		//�� �ڵ嵵 ¥��.
		//���ο� ��ü ������ ������ �����ٿ� �� setMembers()�޼ҵ带
		//ȣ���ϴ� �ڵ尡 �߰���..
		//��ü�� ������ �� ������� �̸� �ʱ�ȭ �ϸ� �� ���ϰ���???
		Car car5= new Car(500, "lee", 40);
		car5.show();
		
		Car car6= new Car();
		car6.show();
		
		
		
		
	}

}
