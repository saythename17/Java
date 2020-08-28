package Interface;

public interface Messenger {
	public static final int MIN=1;//interface's field
	int MAX=100;//public static final생략 가능
	public abstract String getMessage();//본문 X추상 method:상속 클래스들의 다형성에 사용(up casting, down casting)
	public abstract void setMessage(String msg);//set return type or parameter & 본문 구현X 
	public default void Login(boolean l) {//default method-본문을 갖는 인터페이스 내 메소드:인터페이스를 사용하는 클래스에 공통으로갖는 기능 구현 
		log();//default method에서만 사용
		if (l)System.out.println("Login");
		else System.out.println("Logout");
	}
	public static void Connect() {//해당인터페이스 구현 객체에 기능 제공
		System.out.println("connecting network");
	}
	static void log() {
		System.out.println("start!");
	}

}
interface WorkFile{
	public void fileUpload();
	void fileDownload();
}