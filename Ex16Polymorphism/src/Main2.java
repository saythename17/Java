
public class Main2 {

	public static void main(String[] args) {
		// TODO �������� �� �ʿ��Ѱ�
		//��) �ۿ� ����ĳ���� class ����(Dog, Cat, Pig)
		
		//���� ���� class�� ������ �����ؾ� �Ѵٸ�?
		//��)Dog=5����,Cat=10����,Pig=3����
		//�迭�� ����� ������ü�� �ϳ��� �����ϰ� �����ұ�?Animal[] dogs=new Animal[5];
		//�迭�� ������ ������ ��ü�� �ϳ��� �����ϴ� ���� �Ұ���
//���������� ���� �迭�������ϳ��� �迭�� ��� class���� ��� �� �����ϰ� control
		//But! ���� class(�ڷ���)�� �޶� �ϳ��� �迭�� ó�� �Ұ� 
//�� Dog, Cat,Pig ��� ������ �� �ִ� (super class)�ڷ����� ������ �ϳ��� �迭�� ����
		//Animal ���������� Dog,Cat,Pig class���� ����
		Animal ani=new Dog();//UP casting :������ ����ȯ/DOWN :�����
		Animal ani2=new Cat();//[parent-child]
		Animal ani3=new Pig();
		//[=������]: �¿� �ڷ����� ���ƾ��� -> ������ ū �ſ� ���� ���� �ڵ����� ����ȯ
		//����ȯ�� ���� �ڷ����� �°� ���ο� �ּҿ� �����ϴ� ��
		double a=10;//(double)10;-������ ����ȯImplicit
		int b=(int)3.14;//����� ����ȯExplicit
		ani.sound();//���������� �����ϴ� �ν��Ͻ��� say(override)ON!
		ani2.sound(); ani3.sound();System.out.println();
		
		//Animal ���������� �迭�� ������ class�������� �� �����ϰ� ����,����
		Animal[] anis=new Animal[5];//Animal class�� 5��X ���������� 5��
		anis[0]=new Dog();
		anis[1]=new Cat();
		anis[2]=new Pig();
		anis[3]=new Dog();
		anis[4]=new Cat();		
		for(Animal t: anis) {
			t.sound();
		}
		System.out.println();
		//�������� �迭�θ� ������� �ʰ�
		//�޼ҵ��� �Ķ���ͳ� ����Ÿ������ �����ϰ� ���

	}

}
