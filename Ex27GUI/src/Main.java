import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// TODO GUI-Swing Programming
		//Event control,handling
		//��1)���� ���� �ֻ��� �����Ӻ��� �����
		JFrame frame=new JFrame("Who is your husband?");
		frame.setSize(600, 500);//�⺻ ���� 500,����400�� â ����
		
		//*������Ʈ �߰��� ��ġ������(LayoutManager)�� ����
		//->���ϴ� �����ǿ� ������Ʈ ��ġ
		//LayoutManager: BorderLayout(ȭ�� 5����NEWS,����),
		// 				FlowLAyout(������ ���),BoxLAyout,Absolute(null)...
		LayoutManager manager=new FlowLayout();//���������Ʈ ���ʷ� ������ ��ġ
		frame.setLayout(manager);
		
		//��2)������Ʈ(Component:�������) �߰�
		JButton botton=new JButton();
		JButton botton2=new JButton("������");
		botton.setText("������");
		
		//JFrame�� ��ư �߰��ϱ�
		frame.add(botton);
		frame.add(botton2);
		
		//JLable - �۾�/�������� �����ִ� ������Ʈ 
		JLabel lable=new JLabel("��?");
		frame.add(lable);
		
		//Image ���� - Java:�̹����� ������Ʈ�� ����
		//JLabel�� Icon(image)��� Ȱ��
		//JLabel�� ������ ������(�̹��� ��ü) ����
		ImageIcon icon=new ImageIcon("images/JHI.jpg");//����������ʹ�ŭ
		//Image Resizing�̹��� ������¡!
		//ImageIcon��ü(��������)�� ��¥ �̹����� ������ �ִ� Image ������
		Image img= icon.getImage();
		//�̾ƿ� �̹�����ü�� �̿��Ͽ� �����ϰ� ���� �������� �̹��� ���� �����
		Image img2=img.getScaledInstance(325, 350, Image.SCALE_SMOOTH);	
		//���θ������ img2��JLabel�� �����ϱ� ���� ���ο� ImageIcon ��ü�� �ٽ� ����
		ImageIcon icon2=new ImageIcon(img2);
		JLabel imgLabel=new JLabel();
		imgLabel.setIcon(icon2);
		frame.add(imgLabel);	
		
		//JTextField - ����ڷκ��� �۾��� �Է¹޴� ������Ʈ
		//��GUI�� ��� �Է��� ���ڿ�
		JTextField text= new JTextField(20);//�ּ�size20
		frame.add(text);		
		
		//��3)JFrameȭ�鿡 ���̱�
		//JFrame�� ƯĪ X(â�ݱ�)��ư�� ������ â�� ���������� 
		//���α׷��� main Thread�� ������ ����
		//�� java program�ܼ�â&GUIâ �Բ� �����Ű�⦤
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(700, 300);//��������ġ ����[��ǥx,y]
		frame.setVisible(true);//ȭ�鿡 ���̰�����?(��)

	}

}
