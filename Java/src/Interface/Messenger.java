package Interface;

public interface Messenger {
	public static final int MIN=1;//interface's field
	int MAX=100;//public static final���� ����
	public abstract String getMessage();//���� X�߻� method:��� Ŭ�������� �������� ���(up casting, down casting)
	public abstract void setMessage(String msg);//set return type or parameter & ���� ����X 
	public default void Login(boolean l) {//default method-������ ���� �������̽� �� �޼ҵ�:�������̽��� ����ϴ� Ŭ������ �������ΰ��� ��� ���� 
		log();//default method������ ���
		if (l)System.out.println("Login");
		else System.out.println("Logout");
	}
	public static void Connect() {//�ش��������̽� ���� ��ü�� ��� ����
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