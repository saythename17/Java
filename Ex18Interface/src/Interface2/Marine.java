package Interface2;

public class Marine implements Unit,Levelupable{

	@Override
	public void attack() {
		System.out.println("ÃÑ¾Ë ¹ß»ç");		
	}

	@Override
	public void move() {
		System.out.println("¶Ñ¹÷¶Ñ¹÷");		
	}

	@Override
	public void levelup() {
		System.out.println("ºÒ²É¸¶¸° ~º¯½Å~!");
		
	}

}
