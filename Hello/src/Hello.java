import java.util.Random;
public class Hello {
	
	public static void main(String[] args) {
		//���� �� ���Խ� ���ǻ���
		//�ظ޸𸮰� ���� �ڷ��� ������ �޸𸮰� ū ��� ���� �Ұ���
		//ex) int a(4byte)= 3.14(8byte); �� ERROR
		int a = (int)3.14;
		float b;//b=3.14; �Ǽ��� ���ͷ� ����� �޸� ũ�� : double 8byte
		b = 3.14f;//��float������ ��������ȯ
		b = 10;//10.0���� �ڵ�����ȯ
		byte d;
		d = 127;//byte=8bit=256���� ���� ����(+127,-127)
		short e;
		e = 32500;
		long m;
		m = 2500000000L;//L : long����ȯ - ������ int(������)�� �޸�ũ�⸦ �Ѵ� ���� �����ϱ�����
		
		char k = 65;//�����ڵ�(�����蹮�ڸ� �� ������ ����) : �ƽ�Ű �ڵ� + ��
		System.out.println(k);
		
		boolean x,y;
		x = true; y = 5>3;
		System.out.println(x);//boolean�� ��
		System.out.println(true);//true����
		System.out.println(y);
	
		//Java�� ���ڿ������͸� ������ ��ü�� ����
		//"Hello";//literal String ��ü
		String s = new String("Hello");//String ��ü (���θ���)
		String ss = new String("Hello");
		System.out.println(s.length());//length() : ���ڼ� 
		// �������� : ������  / ��ü : ������
		String s1 = "Yolo";//�ڵ� newó��
		String ss1 = "Yolo";
		System.out.println(s1);
		String s2 = s;//�ּ� ����
		System.out.println(s2);
		System.out.println(s==s2);//�ּҰ� ������ ���� ��
		System.out.println(s==ss);
		System.out.println(s1==ss1);
		
	}
}
/*�ڷ���*/
/*�ܱ⺻�� : Primitive ---�Ϲݺ���,���� ����
   ��boolean : �� -true,false(1bit�� ��� �� 1byte�Ҵ�)
   ��byte ����(1bte) : �̹��� ���� ,������ ����/char(2byte)/short(4byte)/int(2byte)
   ��long(8byte)/float(4byte)/double(8byte)

 *�������� : Reference ---������ ����,ù���ڰ� �빮��
   ��String,Random,Scanner�� �� 4000��*/