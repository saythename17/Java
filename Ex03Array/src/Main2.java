import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO ������ �迭
		int[][] aaa= new int[2][3];//2�� 3ĭ
		aaa[0][0]=10;
		aaa[0][1]=20;
		aaa[0][2]=30;
		aaa[1][0]=100;
		aaa[1][1]=200;
		aaa[1][2]=300;
		
		System.out.println(aaa);
		System.out.println(aaa[0]+"\n");
		
		for (int i=0;i<aaa.length;i++) {
			for (int j=0;j<aaa[i].length;j++) {
				System.out.println(aaa[i][j]);
			}
		}
		
		//�� ������ ĭ�̴ٸ� �迭 ���� ����
		int[][] bbb=new int[3][];//3���� �迭 ����
		//�迭 ���� ������ ���� 12byte�� int�� �迭 ��ü
		System.out.println("\n"+bbb);
		System.out.println(bbb[0]);
		
		bbb[0]=new int[2];
		bbb[1]=new int[5];
		bbb[2]=new int[4];
		
		bbb[1][2]=40;
		bbb[2][0]=30;
		for (int i=0;i<bbb.length;i++) {
			for (int k=0;k<bbb[i].length;k++) {
				System.out.print(bbb[i][k]+", ");
			}System.out.println();
		}
		
		//2���� �迭 �ʱ�ȭ
		int[][] ccc=new int[][] {
					new int[] {10,20},
					{100,200,300}};//new int[]����
		//�ʱ�ȭ��, []���� ���� �������� ����
					
		//Ȯ��� for��
		for (int[] t : ccc) {
			for (int e : t) {
				System.out.println(e+", ");
				}System.out.println();
			}
		
		//Ű�����Է����� 2���� �迭����
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int n=scan.nextInt();	
		int[][] ddd= new int[n][]; //n��¥�� �迭		
		for(int i=0; i<ddd.length; i++) {
			System.out.print("ȣ�� �� �Է� : ");
			int m= scan.nextInt();
			ddd[i]= new int[m]; //m��¥�� 1�����迭
		}
		for (int[] i:ddd) {
			for (int j : i) {
				System.out.print(j+", ");
			}System.out.println();
			
		}
		
		
		
		//3���� �迭
		int[][][] abc=new int[2][][];//int�� 2���� �迭 �������� 2��
		abc[0]=new int[3][];
		abc[1]=new int[4][];
		
		abc[0][0]=new int [5];
		abc[0][1]=new int [3];
		abc[0][2]=new int [2];
		
		abc[1][0]=new int [7];
		abc[1][1]=new int [4];
		abc[1][2]=new int [8];
		abc[1][3]=new int [2];
		
		abc[1][3][1]=50;
//		
//		for (int[][] m:abc) {
//			for(int[] i:m) {
//				for(int j:i) {
//					System.out.print(abc[m.length][i.length][j]+", ");
//				}System.out.println();
//			}System.out.println("--------");
//		}
		
		//�迭 ��ü�� ��� ����(�迭�� ����)�� ������ �� ����
		//(in Application)������ �迭 : ArrayList��� ��ü ���
		
		ArrayList<String> www=new ArrayList<String>();
		System.out.println("�迭���� : "+www.size());
		www.add(new String("Hello"));
		www.add("HOLA");
		www.add("ALOHA");
		System.out.println("�迭���� : "+www.size());
		www.remove(1);
		String s1=www.get(0);
		System.out.println(s1);
		s1=www.get(1);
		System.out.println(s1);
		
		
		
		//�迭��ü�� �迭�� ����(��Ұ���)�� ������ �� ����!!!
				//�ۿ����� ������ �迭 : ArrayList��� ��ü�� �����	//**������ �ڷ���(class)�� ����	
				ArrayList<String> ttt= new ArrayList<String>();
				System.out.println("�迭���� : " +  ttt.size() );
				
				ttt.add(new String("Hello"));
				System.out.println("�迭���� : " +  ttt.size() );
				
				ttt.add(new String("Nice"));
				ttt.add(new String("android"));
				ttt.add(new String("aaa"));
				System.out.println("�迭���� : " +  ttt.size() );
				
				ttt.remove(1);
				System.out.println("�迭���� : " +  ttt.size() );
				
				String s= ttt.get(0);
				System.out.println( s );
				
				s= ttt.get(1);
				System.out.println( s );
				
				ttt.add("bbb");
				System.out.println( ttt.get(3) );
				
				for(int i=0; i<ttt.size(); i++) {
					String t= ttt.get(i);
					
					System.out.println(t);
				}
				
				for( String t : ttt) {
					System.out.println( t );
				}
				//Wrapper classȰ��
				ArrayList<Integer> zrt= new ArrayList<Integer>();
				
		
		
	} 
}
