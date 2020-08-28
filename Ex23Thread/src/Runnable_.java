
public class Runnable_ {

	public static void main(String[] args) {
		// Thread�� ����� 2���� ���
		//1. Thread class�� ���(extends)�� class�����Ͽ� ���
		//2. Runnable interface�� ����(implements)�� class�� �����Ͽ� ���
		
		//Person�� ����ϸ鼭 Thread�� ��ü ����
		PersonThread pt=new PersonThread();
		pt.name="DAHOON";
		pt.age=29;
		
		//������ �̸�, ���̸� 1�ʸ��� ������ִ� ��� ����
		//Thread�� ���� ��Ű�� ���
		//.start()->Runnable������ Method
		//pt.run();//run() method�� ����ȣ�� ->main�� thread���� ó��
		//Runnable�� ������ �����ϴ� ����� ����
		//Thread class�� �����Ͽ� ����
		Thread t=new Thread(pt);
		//�������� �Ķ���Ϳ� Runnable����->Thread�� ��� start()�۾�
		t.start();//�����ڷ� ���� Runnable��ü�� run()�޼ҵ带 ��� ����
		System.out.println("Main : DDOL9");
		
		//Runnable�� ����ϴ� ���
		Person r=new PersonThread();// UP casting
		Runnable r2=new PersonThread();// UP casting
		Thread t2=new Thread(r2);
		t2.start();
		//Runnable�� ��ӹ޴� Ŭ������ �����ϸ鼭 ��ü ����
		//�͸� Ŭ���� 
		Runnable r3=new Runnable() {
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("�ȳ�");
					try { Thread.sleep(1000) ;} catch (InterruptedException e) {}
				}				
			}
		};
		Thread t3=new Thread(r3);
		t3.start();//�� �͸�Ŭ�������� ����run()��� ����
		//�͸�Ŭ���� �� �����ϰ� ���
		Thread t4= new Thread( new Runnable() {
			public void run() {	System.out.println("�͸�Ŭ���� ���");	}} );
		t4.start();
	}
}


//Person�� member�ɷ�+Thread�ɷ� ��� ���� <���߻��> Ŭ����
class PersonThread extends Person implements Runnable{
	//�عݵ�� Runnable�� abstract method�� run()�� override
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(name+", "+age);
			try { Thread.sleep(1000) ;} catch (InterruptedException e) {}
		}		
	}
}

	
class Person{
	String name;
	int age;
}