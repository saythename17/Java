package exercise;

public class This {
	//General variable -this : The address of instance--now playing Method
	int i=1;
	public void first() {
		int i=10;
		int j=7;
		this.i=i+j;
		second(7);
		System.out.println(this.i);
	}
	public void second(int i) {
		int j=100;
		this.i=i+j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This test= new This();
		test.first();
	}

}
