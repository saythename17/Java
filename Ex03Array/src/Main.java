import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// ���ڹٿ��� �迭�� ��ü!!!
		//int arr[3];=int�� 3ĭ¥�� �迭��ü ����
		//��ü�� �ݵ�� heap�޸� ������ ������ �� newŰ���� ���
		//new int[3];//��������� int�� 3���� �����Ͱ� �ɷη� �پ��ִ� ��ü
		//�ڵ����� 0���� �ʱ�ȭ--�����Ⱚ�� ������� ���� 
		//double : 0.0 boolean : false
		//index:�迭�� ���(element)�� �����ϱ� ���� ���ȣ
//		int[] arr=new int[3];
//		//�����ϴ� ������ �ڷ��� [] ���������� = new �ڷ���[];
//		//�������� : �迭�� ���� �ּҸ� ������ ���� (4byte)
//		//��heap�޸𸮿� ������ �����͸� �ٷ�� ���ؼ��� 
//		//�ٹݵ�� ���������� �־����
//		
//		int[] arr2;//���������� ����
//		arr2=arr;//���������� ���԰���.�κ����� �ּҸ� ����
//		System.out.println(arr);
//		//�ؽ��ڵ�  : [I@�迭�� �����ּ�
//		//�迭�� �������� ��� : ���������� ����Ű�� ��ü�� �������
//		//������ ���� ������ ����    --- �迭�� ��Һ��� �ٷ����
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		//��Ұ� ����
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		//�迭��ü�� ������ ������ �迭���̰��� ������ �ִ� ��������� ����
//		// ��length : 
//			for(int i=0;i<arr.length;i++){System.out.println(arr[i]);}			
//		//�迭������ ���ÿ� �ʱ�ȭ
//		int[] arr3= new int[] {10,20,30};
//		// ���ʱ�ȭ�� �迭�ε��� ��ȣ�� ������ �� ����
//		
//		//�ʱ�ȭ ����(���)
//		int[] arr4= {10,20,30}; //new int[]�������� -�ڵ�
//		
//		//�迭�� ���̰��� ������ �����ϴ� ���� ����(��ĳ�� Ȱ���)
//		int n=3;
//		int[] arr5=new int[n];//�������� �Է°���
//		Scanner scan=new Scanner(System.in);
//		n=scan.nextInt();
//		arr5=new int[n];
//		
//		for (int t=0; t<arr5.length;t++) {
//			System.out.println(arr5[t]);
//		}
		
		
		
		
		//�ʱ�ȭ�Ҷ� ���������԰���
//		int k=6;
//		int[] arr6= new int[] {k,k+1,k+2};
//		for(int j=0;j<arr6.length;j++) {
//			System.out.println(arr6[j]);
//		}System.out.println();
//		
//		//���̰� 0�� �迭�� ��������
//		int[] arr7=new int[0];
//		System.out.println(arr7.length);
//		int[] arr8=new int[] {};
//		System.out.println(arr8.length);
//		System.out.println();
//		
//		//�迭 ������������ ���԰���-�迭 ����(�迭 �ּ� ����)
//		double[] arr9=new double[] {1.1,2.2,3.3};
//		double[] arr10;//�����Ⱚ�� ������ �ִ� ������������
//		arr10= arr9;//�迭�� �ּ� ����(�迭(��)�� ����� �� X)
//		for (int i=0;i<arr10.length;i++) {System.out.print(arr10[i]+", ");}
//		System.out.println();
//		for (int i=0;i<arr9.length;i++) {System.out.print(arr9[i]+", ");}
//		System.out.println("\n");
//		//�ٸ� �������������� ������ ���� �� ����
//		
//		//�迭�� ����
//		int[] arr11=new int[] {10,20,30};
//		int[] arr12=new int[arr11.length];//arr11�� ���� ������ �ٸ� ��ü ����
//		for(int l=0; l<arr11.length;l++) {	arr12[l]= arr11[l];	}
//		
//		//�⺻���� �ƴ� �������ڷ����� �迭
//		//���������� ����Ű�� �迭��ü�� ������������� �ְ� ������ֺ����� ������ ����� ��ü�� �����Ѵ�
//		//������ �迭�� �ʱ�ȭ
//		String[] arr=new String[] {new String("����"),"NICE"};
//		String[] arr17= {"S","V","T"};//new String[] ��������
//		//String ������
//		String[] arr13=new String[3];;//string ��������(4byte)�� 3�� ���� : 12byte
//									  //���������� �ʱ갪 : null��(0)
//		System.out.println(arr13[0]);//null���
//		arr13[1]=new String("Hello");
//		arr13[2]="^-^!!";//new String��������
//		System.out.println(arr13[1]);
//		System.out.println(arr13[2]);
//		System.out.println(arr13);//�����ϴ� String�迭 ��ü�� ����
//		System.out.println(arr13.length);//�迭�� �����ִ� ������� length-�޸𸮿� �迭�� �����ɶ����� �ڵ����� �����
//		System.out.println(arr13[1].length());//���ڿ���ü�� ����Լ� length
//		System.out.println(arr13[1].toUpperCase());
//		//
//		System.out.println(arr13[1].charAt(1));
		
		
		
		
		
		
		
		
			
		//�ٸ� ������(Class : ��ü�� �ڷ���) �迭
		//�ءءع迭�� ��ü�� ������ �������� ���������� ������ ����
		Random[] arr19= new Random[3];
		//Random �������� 3���� �迭 : �� 12byte---null������ �ʱ�ȭ�Ǿ�����
		//Random �������� : ������
		arr19[0]=new Random();
		int m=arr19[0].nextInt();
		System.out.println(m+"\n");
		
		Scanner[] arr20=new Scanner[3];
		//Scanner��ü�� 3�� ���� ���� �ƴ϶� �迭��ü 1���� ������ ��
		arr20[0]= new Scanner(System.in);
		int h=arr20[0].nextInt();
		System.out.println(h+"\n");
		
		//p.s�����α׷��� ���� �ڷ���
//		Student[] stus = new Student[3];
//		stus[0]=new Student();
//		stus[0].name="Change up";		
//		//������ �迭��ü�� ���������� ������ �ִ� ��ü
//		
//		//�迭���� <Ȯ��� for��> ����...for each��
//		int[] nums=new int[3];
//		nums[0]=10;
//		nums[1]=20;
//		nums[2]=30;
//		for (int i:nums) {System.out.println(i);}		
//		String[] bbb=new String[] {"aaa","bbb","ccc"};
//		for (String str : bbb) {System.out.println(str);};
		//str�� ��ü�� �ƴ� ��������
	}
}
//���α׷��� ���� �ڷ���
//class Student{
//	String name;
//	int kor;
//	int eng;
//	double ever;
//	void stus(){System.out.printf("������");}
//	
//
//}
