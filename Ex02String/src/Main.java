import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String s=new String("Hello");		
		//String class�� ������ Method(���)��
		
		//<length>
		//1.���ڿ� �������� ����(���ڼ�)�� �ڸ������ִ� ���		
		int len=s.length();
		System.out.println(len);//println����Ű sysout+ctrl+space		
		
		//<equals>
		//2.���ڿ� ���� ��
		System.out.println(s=="Hello");//���� �ƴ� �ּҸ� ��
		String s2=s;
		System.out.println(s==s2);//�ּҸ� �����ϰ� �ֱ⶧���� ����
		System.out.println(s.equals(new String("Hello")));
		System.out.println(s.equals("Hello"));
		//                    ��equals : ���� ��
		System.out.println(s.contentEquals(s2));
		System.out.println(new String("Nice").equals("Nice"));
		//�������� ���� ��ȸ������ ��
		System.out.println("Nice".equals("Nice"));
		//Java���� ���ڿ� �����ʹ� ��ü�̴�.
		"Seventeen".length();//���ڿ��� ��ü�̱⶧���� �޼ҵ�Ȱ�밡��
		//�빮�ڼҹ��ڱ��о��� �ܾ ��
		System.out.println(s.equals("hello"));
		System.out.println(s.equalsIgnoreCase("hello"));		
		
		
		//charAt
		//3.���ڿ��ȿ��� Ư�� char ��������
		//s.charAt(index);---index : �迭�� ���ȣ
		char ch =s.charAt(0);
		System.out.println(ch);
		System.out.println(s.charAt(0));//charAt ������ ���ϵ� �� ���
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));		
		for (int i=0;i<s.length();i++){//���ڿ��� �ٲ� ���� �ڵ����� ���ڼ��� ����
			System.out.println(s.charAt(i));
		}		
		
		//Scanner class�� char�� �Է�
		Scanner scan=new Scanner(System.in);
		char c=scan.next().charAt(0);//���ڿ��� �Է¹ޱ�
		System.out.println(c);

	}

}
