package Interface2;

public class Tank implements Unit,Levelupable {
	@Override
	public void attack() {
		System.out.println("������ �߻�");
	}

	@Override
	public void move() {
		System.out.println("�帣����");
	}

	@Override
	public void levelup() {
		System.out.println("cazy tank!!");
		
	}
}
