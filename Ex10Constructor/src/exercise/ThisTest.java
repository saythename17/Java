package exercise;

public class ThisTest {
	private String name;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		ThisTest is=new ThisTest();
		is.setName("Say The Name");
		System.out.println(is.getName());
	}

}
