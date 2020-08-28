package Interface2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �������̽��� �����ϰ� �߻�޼ҵ��� �̸��� ���ϸ�
		//�������� ���̸��� ���� ����� �����Ͽ� Ŭ���� ����
		//for �޼ҵ� ��Ī�� �԰�ȭ
		//���� : Unit �������̽� ���� attack(), move()
		//����1 : Marine class���� �� Unit����
		//����2 : Tank class���� �� Unit����
		//����1 : Race class���� �� Unit����
		//��� Ŭ������ attack(), move() ����� ����
		
		//������ ������� class���� �̿��� ���� ���α׷��� �ۼ�
		//�� Ŭ������ ���������� ��������ʰ�
		//parent class������ Unit interface �������� �̿�
		//��� ���� �����
		//Unit[] units=new Unit[200];
		//���� ���� ���� : �迭�� ������ �����Ǿ��־ �� �Ⱦ�
		//������ �Ҹ��� �ݺ��Ǵ� ���� ���α׷��� �������� ����
		//���� ���� ���鶧�� ArrayList(������ �迭, ����������)�� �� ���� ���
		ArrayList<Unit> units=new ArrayList<Unit>();
		//������ 0�� �������迭�� ������
		//��Ұ��� �����ϴ� method ȣ��
		int num=units.size();//size() : �迭�� length()
		System.out.println(num);
		
		//�迭�� Unit��ü �����Ͽ� �߰�
		units.add(new Marine());
		units.add(new Tank());
		units.add(new Marine());
		units.add(new Race());		
		System.out.println("���ְ��� : "+units.size());
		System.out.println("==========");
		
		//Unit��� ���
		Unit u=units.get(0);//����ϳ� ��������
		u.attack();
		u.move();
		for(Unit t:units) {//Ȯ�� for��
			t.attack();
			t.move();
			//Marine, Tank�� levelUp��� �߰� 
			//�������̽���-able�� ��ȣ
			//���� ���(index-units)�� Marine��ü��?
		
			if(t instanceof Marine) {
				Marine m=(Marine)t;
				m.levelup();
				}else if(t instanceof Tank) ((Tank)t).levelup();
				//�� if -else if���� �� �����ϰ� ��Ÿ����
//Marine�� Tank�� ��� Levelupable�� �ڽ��̹ǷΡ�
				if(t instanceof Levelupable) {
					Levelupable a=(Levelupable)t;
					a.levelup();
					}			
				}
		u=units.get(1);
		u.attack();
		u.move();		
	}

}
