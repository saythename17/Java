import java.util.Scanner;
public class main2 {

	public static void main(String[] args) {
		String s=new String("Hello");
		
		//<indexOf>
//		// 4.���ڿ� �ȿ� Ư�����ڰ� �ִ� �ε�����ȣ(���°�濡 �ִ���)
		int index=s.indexOf('l');
		System.out.println(index);//�չ��ں��� ��
		System.out.println(s.lastIndexOf('l'));//�ڿ������� ��
		System.out.println(s.indexOf("el"));//Ư�����ڿ�����(�����ε��� ��ȣ)
		System.out.println(s.indexOf("eo"));//�������� �ʴ� ���ڿ��� �ε��� ��ȣ : ����
		//Ư����ġ���� �˻� ����
		System.out.println(s.indexOf('o',2));//2�� �ε������� �˻����
		System.out.println();
		
		//<contains>
		// 5.���ڿ��ȿ� Ư�����ڿ��� ���ԵǾ��°�(��Ӿ� ���͸��� �̿�)
		String s2="Hello world! Hello android! Nice world!!";
		boolean b=s2.contains("world");
		System.out.println(b);
		System.out.println();
		
		//<concat>
//		// 6.���ڿ��� ����
		//��(immutable)�Һ��� ��Ģ : Java�� ��ü���� ������ ����� �ٲ� �� ����
		//�� �� �ڹ��� ���ڿ� ��ü���� ���ڿ����� �����ϴ� ���� �Ұ���
		String s3=s2.concat("Nice android!");
		//concat: ������ ���ڿ��� ���� ���� ���ο���� �ٽ����� 
		//���� ���ڿ��ڿ� ���̴� ���� �ƴ�
		System.out.println(s3);
		System.out.println(s2);//������ �״��. �ٲ��� ����
		//concat�� ���󵵰� ���� --���ڿ� ���տ�����(+)���
		System.out.println();
		
		//<startsWith> <endsWith>
//		//7.Ư�����ڿ��� �����ϴ°�(Ư���̸��� ����)
		System.out.println(s2.startsWith("Hello"));
		System.out.println(s2.startsWith("world"));
		//Ư�����ڿ��� �����°�?
		System.out.println(s2.endsWith("world"));
		System.out.println(s2.endsWith("!!"));
		System.out.println();
		
		//<toUpperCase>
//		//8.��ҹ��� �ڵ���ȯ----���� �빮�ڳ� �ҹ��ڸ� �ش�
		 String s4=s2.toUpperCase();
		 System.out.println(s4);//�ٴ빮�ڷ� ��ȯ
		 System.out.println(s);//�ڿ������Һ�
		 System.out.println(s2.toLowerCase());//�ټҹ��ڷ� ��ȯ
		 System.out.println();
		 
		 //<trim>
//		 //9.���ڿ� �糡�� ���鹮�� ����
		 s="Hello world                  ";
		 System.out.println("["+s+"]");
		 System.out.println("["+s.trim()+"]");
		 System.out.println();
		 
		
		
		
		 //<replace>
		 //��10.Ư�� ���� �����ϱ�
		s="Hello world! Hello android! Nice android!!";
		String s6=s.replace('H', 'K');//s�� (����)�� �ٲ�� ���� �ƴ�
		System.out.println(s);
		System.out.println(s6);
		String s7=s.replace("android", "ios");//���ڿ� ���浵 ����
		System.out.println(s7);
		System.out.println(s);//������ �״��
		//�߰� ���� ����
		String s8=s.replace(" ", "");
		System.out.println(s8);
		//��Ӿ� �Ÿ���
		//s=scan.next();
		//s=s.replace("fuck", "XXXX");
		System.out.println();
		
		//<substring>
		//��11.���ڿ� �߶󳻱�
		String s9=s.substring(6,12);//(���� �ε���,������ �ε��� ������)
		System.out.println(s9);
		s9=s.substring(6);//(���� �ε���,������ �ε��� ������)
		System.out.println(s9);
		System.out.println();
		
		//<compareTo>
		//��12.���ڿ� ��Һ�(�����Ҷ� ���)
		char ch1='a';
		char ch2='b';
		System.out.println(ch1>ch2);
		
		String s10="ddd";
		String s11="bbb";
		//System.out.println(s10>s11);--ERROR�ּ� �񱳴� �Ұ�
		System.out.println(s10.compareTo(s11));//���ĺ� ������γ���
		
		//<split>
		//13.���ڿ� �и�-���ڿ� �ȿ� Ư�� ���ڸ� �������� ���ڿ��� �и��Ͽ� �迭�� ����
		s="android:ios:windows:hello";
		String[] arr=s.split(":");
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		//System.out.println(arr[4]);--ERROR
		
		
		
		
		
		
		
		
		
		
		
		//String class static Method
		//static method : ��ü�������� �ٷ� ����Ҽ� �ִ� �޼ҵ� [Ŭ������ . �޼ҵ��()]
		//�ð�� �����
		//1. format()�޼ҵ� - printf()�� ���
		int h=10, m=5, sec=12;//��,��,�� ���� ����
		System.out.println(h+":"+m+":"+sec);
		m=15;
		System.out.println(h+":"+m+":"+sec);	
		//����� Ư�� ����������� �ϴ� �Լ� : printf--but consolâ������ ��� ����
		System.out.printf("%02d:%02d:%02d\n",h,m,sec);
		m=5; sec=2;
		System.out.printf("%02d:%02d:%02d\n",h,m,sec);
		//GUI(�۰��� ȯ��)������ �ݵ�� ��µ���ó�� String�̾�� ��
		String sss=h+":"+m+":"+sec;//sss���ڿ��� ����
		//format()�޼ҵ�� �ܼ�â�� �ƴϾ ���ڿ��� ����� �۾��� ����
		sss=String.format("%02d:%02d:%02d", h,m,sec);
		System.out.println(sss);
		System.out.println();
		
		//2. valueOf() : �⺻���ڷ����湮�ڿ�
		int n=100;
		String munja=String.valueOf(n);
		System.out.println(munja.length());//���ڿ� 100�� �ڸ����� �˷���
		double l=3.14;
		munja=String.valueOf(l);
		System.out.println(munja.length());
		//���� valueOf�� ���� ����
		munja=n+"";//���տ����ڿ� ���� ���ڿ��� ��ȯ
		
		//3. ¥����.parse¥���� : ���ڿ���⺻���ڷ���
		// Wrapper class(Integer,Double,FLoat,Long)
		String s12="5";//���ڰ� �ƴ� ���ڿ� 100
		System.out.println(s12+3);
		//int g=s12;---ERROR
		int g=Integer.parseInt(s12);//s12�� Int�� parse�м��ض�. Integer class�� ����
		System.out.println(g+3);
		
		s12= "3.14";
		double w= Double.parseDouble(s12);
		System.out.println( w+1.2  );
		


}

}
