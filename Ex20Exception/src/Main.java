import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Exception ���� ó��
		// Error : ���� -����Ұ�
		// Exception : ����-���� ��(Run Time) ���� �߻�
		
		//Exception 
		//ex1)����ڰ� �߸��� �����͸� �Է��ϴ� ���
		//ex2)������� �����̳� ����� �߸��� ��� 
		//��(�迭�� �ε����� �߸����� ���)(0���� �������)
		//ex3)��Ʈ��ũ or �ϵ���� ����
		//ex4)������ ������ ����(�𵵽� ����,ũ��Ŀ) : �ذ��� �����
		//System.out.println("����ó���� ���� �˾ƺ��ô�.");
		
		//����ó�� : ���α׷� ��� �� ���ܻ�Ȳ�� �߻��ϸ� ���� �ٿ�����ʰ� 
		// 	  	   ���ܰ� �߻��� �۾��� ������ ������ �۾��� �״�� �����ϵ���
		//�����Ұ����� ��ҷ� ���ܰ� �߻��ϴ� ��� �����õ�(try)�غ��� 
		//���ܰ� �߻��ص� ���α׷��� �ٿ���� �ʵ��� �����ϴ� ���
		//try-catch ����   //if-else�� ����
		
		//�ڿ��� ��Ȳ1 0���� ������---�ʵ�⺻������ ������ ���� �Ǽ�
		//���ܰ� �߻��ϴ� ����, ���α׷��� �� ��ġ���� ���� ����
		int a=0;
//		try {//���ܹ߻��� ����Ǵ� �ڵ带 �ۼ�
//			System.out.println(10/a);//---���ܰ� �߻��ϸ� ����X
//		}catch(ArithmeticException e) {//�Ű����� �ڷ���A~n
//			System.out.println("���� �߻�");//���ܰ� �߻��ϸ� ����
//			System.out.println(e.getMessage());//���� ����
//			System.out.println(e.toString());
//			//override�� method:�ڼ��� ���� ���� - �����ڵ��� �� ���� ��
//		}	//���ܻ�Ȳ�߻��ڿ��� ���α׷��� ���� ���� ����
//		System.out.println("���ܻ�Ȳ ��");
//		System.out.println();
		//���޹��� �Ķ���� e�� ���������� ���� ��ü
		
		
		//�ڿ��ܻ�Ȳ2 �迭�� �ε�����ȣ ��� ����
		int[] arr=new int[5];
//		try {
//			for(int i=0;i<=5;i++) System.out.println(arr[i]);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("����!");
//			//�� �ε����� ��� arr[5]�� ������ �Ѿ��
//		}
//		System.out.println();		
//		
//		//�ڿ��ܻ�Ȳ3 null ���������� ��ü�� method��� 
//		String s=null;
//		try {
//			System.out.println(s.length());
//		}catch(NullPointerException e) {
//			System.out.println("null error ��ü����");
//		}
//		System.out.println();
		
		//�ڿ��ܻ�Ȳ 4 �߸��� ������ �Է�
		Scanner scan=new Scanner(System.in);
//		int n;
//		try {
//			n=scan.nextInt();
//			System.out.println("�Է� �� : "+n);
//			//���ܻ�Ȳ�̹߻����� �������� ���
//		}catch(InputMismatchException e) {
//			System.out.println("������ �Է�");
//		}
//		System.out.println();
		
		//�ڿ��ܻ�Ȳ5 ���ڰ� �ƴѰ� ���ڷ� ����
		//String str=scan.next();
//		try {
//			int num=Integer.parseInt(str);
//			System.out.println(num);
//		}catch(NumberFormatException e) {
//			System.out.println("�����ƴѰ���ȯ�Ұ�");
//		}
		
		//###����
		//����ó�� : ���� �߻��� ���α׷��� �ٿ���� �ʵ��� �ϴ� ����###
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//����ó�� ��ø : ���ܰ� �ѹ��� ������ �߻��ϴ� ���
		//��) �� ���� �Է¹޾� �������ϴ� ���
//		int c,d;
//		try {
//			c=scan.nextInt();
//			d=scan.nextInt();
//			
//			System.out.println("��������� : "+c/d);
//		}catch(InputMismatchException e) {
//			System.out.println("������ �Է°���");
//		}catch(ArithmeticException e) {
//			System.out.println("0���� ������ ��� �Ұ�");
//		}//��Ƽ catch: ������ ��,��������X,��� �ѹ��� ó������]
//		//* ��� ���ܻ�Ȳ���� ó���� ������ �ٸ��� �ʴٸ�?
//		//��Ƽ ĳġ ��� ��� Exception class���� super class
//		//==Exception�� �������� �̿�
//		try {
//			c=scan.nextInt();
//			d=scan.nextInt();
//			
//			System.out.println("��������� : "+c/d);
//		}catch(Exception e) {//��� ������ Exception ó��
//			System.out.println("ERROR");
//		}
//		
//		
//		//finally ���� : ���ܰ� �߻��ϵ� ���ϵ� ������ ����Ǵ� ����
		int x=0;
		try {
			System.out.println(10/x);
			System.out.println("��� ����");
		}catch(Exception e) {
			System.out.println("��� ����");
		}finally {//������ ������� ����
			System.out.println("������ ����-end fo network");
		}	
		//finally �� ���� ��������ʾƵ� try...catch {}�ۿ� �ۼ��ϸ�
		//������ ����
		//BUT! ��Ʈ��ũ �۾�,��Ʈ���ֽ� finally�� ����������
		//���������� :  �޸� ����
		//�������ִ� �ڵ带 ���� ������ ��
		//finally :catch�� ���� ����
		try {			
		}finally{}//���ܰ� �߻������� �׳� �Ѿ
		
		//Exception
		//1.Checked Exception : ����ó���� ���ҽ� ������ �ȵ�
		//2.UnChecked Exception :  ����ó�� ����-�������� ����
		
		//��ǥ�� Checked Exception-�ݵ�� ����ó�� �ؾ��ϴ� ��
		//Net work �۾�
		try {
			URL url=new URL("http://www.naver.com");
			System.out.println("���Ἲ��");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�����ּҿ� �̻��� ����");
		}
		
		
		//���� �����
		File file=new File("D://aaa.txt");
		try {
			FileInputStream fis= new FileInputStream(file);
			System.out.println("���� ���� ����");
		}catch(FileNotFoundException e) {
			System.out.println("���� ���� ����- ���� ����");
		}

	}

}
