package Interface2;

public class Tank implements Unit,Levelupable {
	@Override
	public void attack() {
		System.out.println("자주포 발사");
	}

	@Override
	public void move() {
		System.out.println("드르르륵");
	}

	@Override
	public void levelup() {
		System.out.println("cazy tank!!");
		
	}
}
