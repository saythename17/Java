import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex extends JFrame implements ActionListener{
	private JButton button;
	
	public Ex() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("¿Ã∫•∆Æ");
		JPanel panel= new JPanel();
		button=new JButton("Click");
		button.addActionListener(this);
		panel.add(button);
		this.add(panel);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button.setText("BOOOOOM!!!!!!!! ");
	}
	public static void main(String[] args) {
		new Ex();
	}

}
