import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;//import ����Ű:control+shift+o
//https://docs.oracle.com/javase/7/docs/api/
//�ε��� �ڼ��� class��� ������ ��������

//��� Ŭ�������� �⺻���� ��ӹ޴� Ŭ���� : Object
public class Main {

	public static void main(String[] args) {
		// TODO Object class
		Test t=new Test();
		//Test class�� ��������δ� �ƹ��͵� ��ӹ��� �ʾ�����
		//�ڵ����� Object��� class���
		//�� ���� �������ʾƵ� ��ӹ��� �޼ҵ� ���� 
		
		//Object class =Java�� �����ϴ� ��� Ŭ������ root(�ֻ���) class
		//��� class �� super class
		//�� ��� Ŭ���� ��������(Object ��������:���� ��������)
		Object obj=null;
		obj=new Test();//UP casting
		obj=new Random();
		obj=new String();
		obj=new Scanner(System.in);
		obj=new ArrayList();
		//Object parameter���� ��� ��(��� class) ���ް���		
		
//Object class�� �ֿ� method
//�� toString() : ��ü�� �Ұ��ϴ� ���ڿ��� �������ִ� �޼ҵ�
		String s=t.toString();//[default : "Ŭ������@�ؽ��ڵ�"]
		//System.out.println(s);
		Test t2=new Test();//�ٸ���ü
		//System.out.println(t2.toString());
		Random rnd=new Random();
		//System.out.println(rnd.toString());//["��Ű����.Ŭ������@�ؽ��ڵ�"]
		//System.out.println(t);
		//System.out.printle() :�������� ���== �ڵ����� �� ���������� toString()�� ����.
		//��, ���������� ��ü�� �������� ������(null)�̸� �׳� null�� ���
		String s2=new String("HELLO");//Object���� ��ӹ��� toString() override
		//System.out.println(s2.toString());
		//System.out.println(s2);//��°� ����. ���� ����
		//Fist class's toString() override
		First f=new First();
		//System.out.println(f);//==f.toString
		//�ڵ� toString : Object parameter ���ް��� override�� ��
		//System.out.println();System.out.println();
		
		
//�� equals(Object obj) : ���޹���  obj�� ���� ��ü���� ���θ� �Ǵ��� ���� [true or false]
//		Test t3=new Test();//���� �ٸ� ��ü ����
//		Test t4=new Test();
//		System.out.println(t3.equals(t4));
//		Test t5=t3;//���� �ּҸ� ������
//		System.out.println(t3.equals(t5));
//		/*�� equals���� �Ʒ��� ���·� �� ���̾�*/
//		System.out.println(t3 == t5);//�ּҰ����� ��
//		//String class: equals()�� field �� �񱳿� ���
//		String s3=new String("HELLO");
//		String s4=new String("HELLO");
//		System.out.println(s3 == s4);//�ּ� ��
//		System.out.println(s3.equals(s4));//�ʵ尪 ��
//		//��String class�� equals�� �ּҰ� �ƴ� field �� �񱳷� override�� �� 
//		First f2= new First();
//		First f3= new First();		
//		System.out.println( f2.equals(f3) );
//		System.out.println();System.out.println();
		
//�� hashCode() : ��ü�� �ؽ��ڵ�(�����ּ�)�� ��ȯ [return type: int]
		//�ڹٿ����� ��ü�ּ�
		Test t7=new Test();
		System.out.println(t7.hashCode());//10������ �ּ� ����
		System.out.println(t7.toString());//���� ���� ��, 16����
		System.out.println(Integer.toHexString(t7.hashCode()));
		//16������ �ٲٴ� method�� �̿��Ͽ� Ȯ���غ��� ���� ��
		System.out.println();
		
//�� getClass : Ŭ������ ���� ����[return type: class]
		Test t6=new Test();
		Class a=t6.getClass();
		System.out.println(a.getName());//class's name
		System.out.println(a.getSuperclass());//superclass name
		System.out.println(a.getModifiers());
		/*getClass()�� �ٿ��� ��*/
		System.out.println(Test.class.getName());
		//�������� ���� ���-Test class�� ���� ���� ����
		
//�� wait(), notify(), notifyAll() -Tread
		
	}

}
