package Interface2;

public class Marine implements Unit,Levelupable{

	@Override
	public void attack() {
		System.out.println("�Ѿ� �߻�");		
	}

	@Override
	public void move() {
		System.out.println("�ѹ��ѹ�");		
	}

	@Override
	public void levelup() {
		System.out.println("�Ҳɸ��� ~����~!");
		
	}

}
