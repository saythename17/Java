import javax.swing.JButton;
import javax.swing.JFrame;

public class Main2 {//way2 : GUI programming

	public static void main(String[] args) {
		new MyFrame();
	}
}
class MyFrame extends JFrame{
	public MyFrame() {// constructor
		//���� Ŭ������ �ٸ� ����޼ҵ� ȣ�Ⱑ��
		setSize(550, 450);//this��������
		setLocation(700, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JButton btn=new JButton();
		add(btn);
	}	
}