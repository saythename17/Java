package Polymorphysm2;

//Pet�� ��ü�� ���� �ʵ��� ���� ���� �߻�Ŭ������ ��������
abstract public  class Pet {
	void sound() {/*override �� method : ���� X*/}
	
	//��� ������ ������
	void sleep() {
		System.out.println("zzZ");
	}
	

}
class Dog extends Pet{
	@Override
	void sound() {
		System.out.println("�۸�!!");
	}
	//Dog�� �������
	void guardHouse() {
		System.out.println("����Ŵ�漺�漺!!");
	}
	
}
class Cat  extends Pet{
	@Override
	void sound() {
		System.out.println("�ֿ�!��!��!��!");
	}
	//Cat�������
	void handleDeacon() {
		System.out.println("����θ���!!!!");
	}
}
class Pig extends Pet{
	@Override
	void sound() {
		System.out.println("�ܲ�");
	}
	//Pig�������
	void eatAndEat() {
		System.out.println("�԰�԰�!!!!!");
	}
	
}