
public class First {
	//접근제한자가 부여된 멤버변수
	private int a;
	int b; //접근제한자가 없으면  default
	protected int c; 
	public int d;
	
	//멤버 메소드
	void aaa() {
	//같은 class내에서는 접근제한자가 의미 없음
		a=10;
		b=10;
		c=10;
		d=10;
	}

}
