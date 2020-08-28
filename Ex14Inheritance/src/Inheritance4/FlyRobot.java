package Inheritance4;

public class FlyRobot extends Robot{
	//Robot�� move�� attack method ����
	void fly() {
		System.out.println("��~����~~\n");
	}
	
	//Override : ��ӹ��� �޼ҵ� ���𵨸�/��� �ٲ�ġ��
	/*��������*---�ٲ��ɿ� ������ �����θ� ���
	 * class�� ��︮���ʴ� method�� ������� �ʰ� ���� �� �ִ�*/
	public void move() {//same method name with super's method 
		                //only allow in Inheritance
		System.out.println("��~~~~~~~");
	}
	public void attack() {
		System.out.println("��~~�����������");
	}
}

class SwimRobot extends Robot{
	void swim() {
		System.out.println("��~��! ��~��!\n");
	}	
	@Override
	//��annotation : ���� �ּ�  @XXX-������ �¾Ƶ� �ּ��� ��︮�� �ʴ� �ڵ�� ERROR
	public void move() {
		System.out.println("÷��÷��");
	}
	@Override
	public void attack() {
		System.out.println("��!");
	}
}
