package Polymorphysm2;

import java.util.Random;

public class Main3 {

	public static void main(String[] args) {
		//Pet(Dog,Cat,Pig)class �����ϴ� ���尴ü ����
		PetFactory pf=new PetFactory();
		
		/*DOWN casting*/
//		Dog d=(Dog)pf.makePet(1);//explicit ����� ����ȯ
//		//�� �޼ҵ��� �����ڷ����� Pet���� �������⿡ Dog�� ����ȯ ���� 
//		d.sound();d.guardHouse();
//		Cat c=(Cat)pf.makePet(2); c.sound();c.handleDeacon();
//		Pig p=(Pig)pf.makePet(3); p.sound();p.eatAndEat();
//		System.out.println();
//		//only one-Pet(parent) reference variable
//		//control another classes
//		Pet pet=new Pet();
//		pet=pf.makePet(1);//Dog return
//		pet.sound();//Dog ������� ���Ұ�->Dog �������� ����
//		Dog dog=(Dog)pet; dog.guardHouse();
//		pet=pf.makePet(2);//Cat return
//		pet.sound();
//		((Cat)pet).handleDeacon();//���� �������� ���� ��� -����ȯ �켱���� ����
//		pet=pf.makePet(3);//Pig return
//		pet.sound();
//		((Pig)pet).eatAndEat();
//		System.out.println("==============");
		
		
		
		
		//���뿹��
		//�����ϰ� 5����  ���� class����&����
		Random rnd=new Random();
		Pet[] pets=new Pet[5];//pets�������� 5�� not �迭 5��
		for(int i=0;i<pets.length;i++) {
			int n=rnd.nextInt(3)+1;
			pets[i]=pf.makePet(n);
		}
		//����
		for(int i=0;i<pets.length;i++) {
			pets[i].sound();
			pets[i].sleep();
		//������� class���� ������� ���(�����Ұ����� calss�϶�)
		//[instanceof] ������ ��� : � ��ü�� �ڷ���(class)�� �´��� �˷��ִ� ������
		//  ������ ������| A(����������) instanceof B(class��)==[true] or [false]
		if (pets[i] instanceof Dog ) {
			Dog k=(Dog)pets[i];
			k.guardHouse();
		}else if (pets[i] instanceof Cat) {
			Cat g=(Cat)pets[i];
			g.handleDeacon();
		}else if(pets[i] instanceof Pig) {
			((Pig)pets[i]).eatAndEat();
		}
		}
		
		//Pet class�� ��ü�� �ݵ������ ������ Ŭ������ �ƴ϶�
		//but �Ǽ��� Pet class�� ����ٸ�?
		//Pet a=new Pet();
		//a.sound();//�������� �ʴ� �޼ҵ�-���ʿ�
		//****Pet�� �Ǽ��ζ� ����(new)���� �ʵ��� ���������� ����
		//�߻�(abstract)class�� ����� new�� ��ü �����Ұ�
	}

}
