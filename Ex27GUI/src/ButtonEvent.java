import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonEvent extends JFrame {
	JButton btn;//���������� ����� ������Ʈ ��� ��������⶧����	
	JLabel label;//������ ������Ʈ���� ���������� ��������� ������� ����
	JLabel label2;	JButton btn2;	JLabel imgLabel1;
	JLabel imgLabel;//��������-�⺻��null
	
	public ButtonEvent() {//Event:Action�� �������� ��Ȳ
		setTitle("�߱��� �ɸ��׽�Ʈ");
		setSize(400,450);
		setLocation(700,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//������Ʈ �߰�(�����ѹ��� �ٸ� ���̱�)
		JPanel panel=new JPanel();//�ǳڰ� ���� �гΰ�ü
		//��JPAnel�� �⺻ FlowLayout���� �����Ǿ� ����
		//�гο� ������Ʈ �߰�	
	
		//�̹��� ����
		imgLabel= new JLabel();		
		ImageIcon icon=new ImageIcon("images/test.png");
		//�̹��� ������ ����
		Image img=icon.getImage();//����
		img=img.getScaledInstance(250, 333, Image.SCALE_SMOOTH);
		icon=new ImageIcon(img);//���ο� �������� �̹��� ������ ��ü ����
		imgLabel.setIcon(icon);		
		panel.add(imgLabel);		
		
		btn=new JButton("¥���");
		label=new JLabel("Type A");
		panel.add(btn);		panel.add(label);
		//�����ӿ� �г� ���̱�
		add(panel);
		//��ư�� click�ϸ� JLabel�� �۾��� ����
		//��ư�� Ŭ���Ǵ� Action�� ��� Listener(����Ŀ)����&��ư�ޱ�
		//ActionListener: interface: ����new ��ü���� �Ұ�
		//�������̽��� ����(implements)�� ���ο� class����&��ü�� ����
		
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon=new ImageIcon("Images/zza.png");
	Image img=icon.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
				imgLabel.setIcon(new ImageIcon(img));		
				label.setText("¥����� �԰����� �ɸ�");
				label.setVisible(true);
				label2.setVisible(false);				
			}
		});		
		btn2=new JButton("«��");
		label2=new JLabel("Type B");
		panel.add(btn2);		panel.add(label2);
		//��ư Ŭ���� �̹��� ����
		btn2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon=new ImageIcon("Images/zzam.jpg");
		Image img=icon.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
				imgLabel.setIcon(new ImageIcon(img));						
				label2.setText("«���� �԰����� �ɸ�");
				label2.setVisible(true);
				label.setVisible(false);
			}
		});		
		
		setVisible(true);//�̹����� visible���� ���� ��������
			//�ؽ�Ʈ�� visible �Ŀ� �ᵵ ����
			//*1*ClickListener listener=new ClickListener();
			
			//*2*�����δ� �͸�Ŭ������ ������ ���
			ActionListener listener=new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					label.setText("¥����� �԰����� �ɸ�");
				}				
			};
			//������ ���� �����ʰ�ü�� Button��ü�� �߰�
			btn.addActionListener(listener);
		}//constructor
		/////////////////////////////////////////////////
		//Define**Inner class implements ActionListener 
		class ClickListener implements ActionListener{
		//�����ʰ�ü�� �ٶ󺸴� ��ư�� click�Ǹ� �ڵ����� �ߵ�:call back method
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked!");
				//JLabel��ü(label)�� �۾� ����
				//constructor�� local variable�� �ٸ� �޼ҵ忡�� �νĺҰ�
				//��������� ������ class�� ��𼭵� �νİ���
				label.setText("¥����� �����ϴ� Ÿ��");
			}			
		}////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEvent();
	}
}//class...