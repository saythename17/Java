
public class Main {

	public static void main(String[] args) {
		// TODO Static keyword -variable, method, class(inner)
		//static local variable,parameter -�������� ����
		//static int a ; �� X ��� �Ұ�
		Test.show();//class method : ��ü�������� �޼ҵ� ��밡��
		
		Test t1=new Test(1,20);
		Test t2=new Test(10,50);//t1���� �־��� b=20 �� 40
		Test t3=new Test(20,70);//t2�� b=40�� 90���� �ٲ�
		
		t1.a=-1;
		System.out.println(t1.a);
		System.out.println(t2.a);
		System.out.println(t3.a);
		System.out.println();
		
		//b static variable�� Test class������ ������� 1�� ����
		//b�� �����ϸ� ��� instance�� ��ο���
		t1.b=-1; t1.b=-2; Test.b=-3;
		System.out.println(t1.b);
		System.out.println(t2.b);
		System.out.println(t3.b);
		System.out.println();
		
		/*static variable�� instance���� �ο��Ǵ� ���� �ƴ϶�
		  class�� 1���� ����
		   �� static variable ǥ��� : ��ü��.������ X
		   		                 �� class��.static ������ */
		Test.b=100;//���� ǥ��
		System.out.println(Test.b+"\n");
		
		//ex1) static variable-Ŭ������ ��ü(�ν��Ͻ�)�� � ���� Ȯ�� ����
		new First();
		new First();
		new First();
		// static��method �� ����
		
		t1.shew();
		//Test.shew();�Ϲ�(instance) �޼ҵ� : Ŭ������.�޼ҵ�� -ERROR
		Test.show();//or t1.show();---class(static) method
		System.out.println();System.out.println();System.out.println();System.out.println("\n\n\n\n\n\n\n\n\n\n");
		
		
		
		
		
		Test.show();//class method : ��ü�������� �޼ҵ� ��밡��
		
		AAA.obj.show();//AAA Ŭ������ obj��� static��ü�� show�޼ҵ�
		System.out.println();//System Ŭ������ out��������� println�޼ҵ� ���
		
		AAA.obj.kkk();//static�� ��ü��.static����X
		//AAA.BBB.kkk(); ERROR --AAAŬ������ BBBŬ������ �������� �����Ƿ�
		BBB.kkk();
		System.out.println(AAA.MAX);
		
		
	}

}