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
		//★1)제일 먼저 최상위 프레임부터 만들기
		JFrame frame=new JFrame("Who is your husband?");
		frame.setSize(600, 500);//기본 가로 500,세로400의 창 설정
		
		//*컴포넌트 추가전 배치관리자(LayoutManager)를 지정
		//->원하는 포지션에 컴포넌트 배치
		//LayoutManager: BorderLayout(화면 5분할NEWS,센터),
		// 				FlowLAyout(놓여진 대로),BoxLAyout,Absolute(null)...
		LayoutManager manager=new FlowLayout();//모든컴포넌트 차례로 옆으로 배치
		frame.setLayout(manager);
		
		//★2)컴포넌트(Component:구성요소) 추가
		JButton botton=new JButton();
		JButton botton2=new JButton("서강준");
		botton.setText("정해인");
		
		//JFrame에 버튼 추가하기
		frame.add(botton);
		frame.add(botton2);
		
		//JLable - 글씨/아이콘을 보여주는 컴포넌트 
		JLabel lable=new JLabel("♥?");
		frame.add(lable);
		
		//Image 삽입 - Java:이미지용 컴포넌트가 없음
		//JLabel에 Icon(image)기능 활용
		//JLabel에 설정할 아이콘(이미지 객체) 생성
		ImageIcon icon=new ImageIcon("images/JHI.jpg");//원본사이즈너무큼
		//Image Resizing이미지 리사이징!
		//ImageIcon객체(참조변수)안 진짜 이미지를 가지고 있는 Image 빼오기
		Image img= icon.getImage();
		//뽑아온 이미지객체를 이용하여 설정하고 싶은 사이즈의 이미지 새로 만들기
		Image img2=img.getScaledInstance(325, 350, Image.SCALE_SMOOTH);	
		//새로만들어진 img2를JLabel에 설정하기 위해 새로운 ImageIcon 객체를 다시 생성
		ImageIcon icon2=new ImageIcon(img2);
		JLabel imgLabel=new JLabel();
		imgLabel.setIcon(icon2);
		frame.add(imgLabel);	
		
		//JTextField - 사용자로부터 글씨를 입력받는 컴포넌트
		//※GUI의 모든 입력은 문자열
		JTextField text= new JTextField(20);//최소size20
		frame.add(text);		
		
		//★3)JFrame화면에 보이기
		//JFrame의 특칭 X(창닫기)버튼을 누르면 창은 없어지지만 
		//프로그램의 main Thread는 멈추지 않음
		//∴ java program콘솔창&GUI창 함께 종료시키기┐
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(700, 300);//프레임위치 설정[좌표x,y]
		frame.setVisible(true);//화면에 보이게해줘?(응)

	}

}
