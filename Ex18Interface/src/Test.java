//interface���� ��class����
//interface �� abstract class :�߻�޼ҵ带 ����� ���� Ŭ����
//���� �ٸ� Ŭ������ ���� �̸��� ���� �޼ҵ带 ����ϵ��� ���� ��
//new�� ��ü �����Ұ�
public interface Test {
/*interface�� Ư¡
 * 1.���� : �ν��Ͻ�����, static����, �ν��Ͻ�method�� ���� �� ����
 * (field: static final ����� ��� ����)*/
	final int a=10;//final field : ����� ���ÿ� ����� �ʱ�ȭ�ؾ���
	               //static��������
	int b=20; //����� �ʱ�ȭ��, �ڵ�����static final�� ����
/*2.�޼ҵ� : �������̽� �ȿ����� �߻�޼ҵ�, static method�� ��� ���� */
	abstract void aaa();
	void bbb();//�ڵ� abstractȭ 
	static void ccc() {	}//JDK 1.8ver~����
/*3.�������̽� ����� ���������� : public*/
	//private static final int c=1;//ERROR
	//protected static final int d=2;//ERROR
	public static final int e=3;//public�� ����
	int e2=4;//public ���� ����
	//method�� public�� ����
/*4.�������̽�: �޼ҵ屸���� �ϼ���������(�߻�Ŭ����)���赵
 * �� �ݵ�� �޼ҵ屸���� ��밡�� */
	//�̸����ְ� �޼ҵ� ����(implement)X�� ���� Ŭ������ ����
/*5.�������̽��� ����Ϸ��� ���ο� Ŭ������ �����Ͽ� ����� ������ ��� */
/*6.�������̽��� ����:������ ���->UP casting ��밡��*/	
	
	
	
	
	
	
	
/*7.�������̽��� �̳�Ŭ������ ���� �� ����*/
	//inner class : General <public static>
	class Hello{
		void show() {
			System.out.println("HEllo");
		}
	}
	//�̳�Ŭ������ �ܺο��� �ν� �Ұ�.->outer���� ���
	//�̳�Ŭ������ ��ü���� �Ұ�
	//BUT! static inner class: ��ü ���� ����
	Test.Hello h=new Hello();
	
/*8.���� ���̽��� ���߱��� ����*/
	//public class CCC implements AAA, BBB {}
	//���� �̸��� abstract method�� ������ �ϳ��� override�ϸ��
	
/*9.�������̽��� �ٸ� �������̽� ���(extends)����*/
	//�������̽� ������ ���
	//interface A extends B{}
	//A�� B�� abstract method�� ������ ����
	//p.s�������̽��� Ŭ������ ����� �� ����
	
	
}//Test interface

