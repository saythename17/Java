package Inheritance5;

public class Alba extends Student {
	private String task="";//==new String("");

	public Alba() {
		// TODO Auto-generated constructor stub
	}

	public Alba(String name, int age, String major,String task) {
		super(name, age, major);
		// TODO Auto-generated constructor stub
		this.task=task;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("task : "+task);
	}

}
