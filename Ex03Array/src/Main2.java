import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO 다차원 배열
		int[][] aaa= new int[2][3];//2층 3칸
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
		
		//각 층마다 칸이다른 배열 생성 가능
		int[][] bbb=new int[3][];//3층의 배열 생성
		//배열 참조 변수를 가진 12byte의 int형 배열 객체
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
		
		//2차원 배열 초기화
		int[][] ccc=new int[][] {
					new int[] {10,20},
					{100,200,300}};//new int[]생략
		//초기화시, []안의 값을 지정하지 않음
					
		//확장된 for문
		for (int[] t : ccc) {
			for (int e : t) {
				System.out.println(e+", ");
				}System.out.println();
			}
		
		//키보드입력으로 2차원 배열지정
		Scanner scan=new Scanner(System.in);
		System.out.println("층수 입력 : ");
		int n=scan.nextInt();	
		int[][] ddd= new int[n][]; //n층짜리 배열		
		for(int i=0; i<ddd.length; i++) {
			System.out.print("호실 수 입력 : ");
			int m= scan.nextInt();
			ddd[i]= new int[m]; //m개짜리 1차원배열
		}
		for (int[] i:ddd) {
			for (int j : i) {
				System.out.print(j+", ");
			}System.out.println();
			
		}
		
		
		
		//3차원 배열
		int[][][] abc=new int[2][][];//int형 2차원 배열 참조변수 2개
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
		
		//배열 객체는 요소 개수(배열의 길이)를 변경할 수 없음
		//(in Application)유동적 배열 : ArrayList라는 객체 사용
		
		ArrayList<String> www=new ArrayList<String>();
		System.out.println("배열길이 : "+www.size());
		www.add(new String("Hello"));
		www.add("HOLA");
		www.add("ALOHA");
		System.out.println("배열길이 : "+www.size());
		www.remove(1);
		String s1=www.get(0);
		System.out.println(s1);
		s1=www.get(1);
		System.out.println(s1);
		
		
		
		//배열객체는 배열의 길이(요소개수)를 변경할 수 없음!!!
				//앱에서는 유동적 배열 : ArrayList라는 객체를 사용함	//**참조형 자료형(class)만 가능	
				ArrayList<String> ttt= new ArrayList<String>();
				System.out.println("배열길이 : " +  ttt.size() );
				
				ttt.add(new String("Hello"));
				System.out.println("배열길이 : " +  ttt.size() );
				
				ttt.add(new String("Nice"));
				ttt.add(new String("android"));
				ttt.add(new String("aaa"));
				System.out.println("배열길이 : " +  ttt.size() );
				
				ttt.remove(1);
				System.out.println("배열길이 : " +  ttt.size() );
				
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
				//Wrapper class활용
				ArrayList<Integer> zrt= new ArrayList<Integer>();
				
		
		
	} 
}
