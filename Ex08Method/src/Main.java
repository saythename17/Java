
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.name="THE8";
		stu.kor=80;
		stu.eng=70;
		stu.show();
	
		Student stu2=new Student();
		//���� ������ ���������ʾƵ� �Է°����� �ڵ�
		stu2.setMembers("Dino",40,60);
		//�Է¸޼ҵ� ȣ��&�Է��� ���� �޼ҵ忡 �Ķ���ͷ� ����
		stu2.show();//��¸޼ҵ� ȣ��
		Student stu3=new Student();
		stu3.setMembers("Jisu", 90, 85);
		stu3. show();
		
		//����������� ���� �����ϱ�
		stu3.setEng(756);
		stu3.show();
		stu3.setEng(75);
		stu3.show();
		
		//�������� : �������� ������ ������ ����ϵ��� ����
		int total=stu3.calTotal();//�޼ҵ��� ���ϰ��� �����
		System.out.println("���� : "+total);
		
		
		
		//������
		System.out.println("���:"+stu3.culAverage());
		//System.out.println("��� : "+aver+"\n");
		
		//����
		//class(��ü) : �ʵ� + �޼ҵ� (����+�Լ�-���)
		//p.s �ʵ���� �޼ҵ常 �����ϴ� ��ü�� ����
		
		int a =10;
		int b=4;		
		//��Ģ������ ���� ���� ��ü ����(��ɸ� �����ϴ� class)	
		Calculator cal= new Calculator();
		int sum=cal.add(a, b);
		System.out.println(sum);
		int sub=cal.subtract(a, b);
		System.out.println(sub);
		System.out.println(cal.multiply(a, b));
		System.out.println(cal.divide(a, b));
		//�޼ҵ� �����ε�
		double c=3.5;
		double d=4.6;
		System.out.println(cal.add(c, d));
		System.out.println(cal.subtract(c, d));
		System.out.println(cal.multiply(c, d));
		System.out.println(cal.divide(c, d)+"\n");
		
		//���� ���ڿ��� ��������
		System.out.println(  "123" + "456" );
		int n= Integer.parseInt("123");
		int n2= Integer.parseInt("456");
		System.out.println( n+n2 );
		//���ڿ��� ���ڷ� ��ȯ�Ͽ� ��������� ���ִ� ����� ��ü ����
		System.out.println("��ȯ : "+cal.add("123", "456"));
		
		
		
		
		
		
		
		
		
		
		
		
		//call by value
		int x=10;
		Cal ca=new Cal();//��ü ����
		ca.increase(x);//���� ���� �� 1������Ű�� �޼ҵ�
		System.out.println(x);//������ ������ ����
		//�Ķ���Ϳ� ������ �μ�(argument)�� ���� ����
		
		//call by Reference(������-�ּ� ����)
		int[] arr=new int[] {10,20,30};
		//����������  arr�ǰ�: �ּҰ� ���޵� 
		ca.increase(arr);
		System.out.println();
		for(int t:arr) {//arr[]�� ���� �����
			System.out.print(t+"\t");
		}System.out.println();
		
		//�������� ����(�Ķ����)
		ca.aaa();//length=0�� �迭
		ca.aaa(10);System.out.println();		
		ca.aaa(10,20);System.out.println();
		ca.aaa(10,20,30,40,50);			
	}//main Method
}//Main class

class Cal{//Method�� ������ Class �ȿ� ����
	//���޹��� �� 1����!-call by Value
	void increase(int x) {
		x++;
		System.out.println("x: "+x);}
	//�迭�� �Ķ���ͷ� �޾� �װ����� 1�� ������Ű�� �޼ҵ�
	void increase(int[] a) {
//		            ���迭X,arr�� ���� ���� ����Ű�� ��������(4byte)
		for (int i=0;i<a.length;i++) {
			a[i]++;
			System.out.print(a[i]+"\t");}}
	//�������� ����
	void aaa(int... a) {//...(spread ������)
		for (int t:a)//a�� �迭(��������)��
		System.out.print(t+"\t");
	}
}