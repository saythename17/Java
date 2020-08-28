import javax.swing.JFrame;

public class MyFrame2 extends JFrame {
	//way3 : GUI programming
	public MyFrame2() {
		setTitle("MyFrame2");
		setSize(300,200);
		setLocation(50,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}	

	public static void main(String[] args) {
		new MyFrame2();
	}

}
