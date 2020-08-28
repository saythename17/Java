import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// ※자바에서 배열은 객체!!!
		//int arr[3];=int형 3칸짜리 배열객체 생성
		//객체는 반드시 heap메모리 영역에 생성됨 ∴ new키워드 사용
		//new int[3];//멤버변수인 int형 3개의 데이터가 쪼로록 붙어있는 객체
		//자동으로 0으로 초기화--쓰레기값을 허용하지 않음 
		//double : 0.0 boolean : false
		//index:배열의 요소(element)를 구분하기 위한 방번호
//		int[] arr=new int[3];
//		//참조하는 변수의 자료형 [] 참조변수명 = new 자료형[];
//		//참조변수 : 배열의 시작 주소를 가지고 있음 (4byte)
//		//☆heap메모리에 생성된 데이터를 다루기 위해서는 
//		//☆반드시 참조변수가 있어야함
//		
//		int[] arr2;//참조변수만 선언
//		arr2=arr;//참조변수의 대입가능.두변수는 주소를 공유
//		System.out.println(arr);
//		//해시코드  : [I@배열의 시작주소
//		//배열의 참조변수 출력 : 참조변수가 가리키는 객체의 정보출력
//		//베열의 값은 나오지 않음    --- 배열은 요소별로 다뤄야함
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		//요소값 대입
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		//배열객체는 생성시 본인의 배열길이값을 가지고 있는 멤버변수가 존재
//		// └length : 
//			for(int i=0;i<arr.length;i++){System.out.println(arr[i]);}			
//		//배열생성과 동시에 초기화
//		int[] arr3= new int[] {10,20,30};
//		// └초기화시 배열인덱스 번호를 지정할 수 없음
//		
//		//초기화 문법(약식)
//		int[] arr4= {10,20,30}; //new int[]생략가능 -자동
//		
//		//배열의 길이값을 변수로 지정하는 것이 가능(스캐너 활용법)
//		int n=3;
//		int[] arr5=new int[n];//변수길이 입력가능
//		Scanner scan=new Scanner(System.in);
//		n=scan.nextInt();
//		arr5=new int[n];
//		
//		for (int t=0; t<arr5.length;t++) {
//			System.out.println(arr5[t]);
//		}
		
		
		
		
		//초기화할때 변수값대입가능
//		int k=6;
//		int[] arr6= new int[] {k,k+1,k+2};
//		for(int j=0;j<arr6.length;j++) {
//			System.out.println(arr6[j]);
//		}System.out.println();
//		
//		//길이가 0인 배열도 생성가능
//		int[] arr7=new int[0];
//		System.out.println(arr7.length);
//		int[] arr8=new int[] {};
//		System.out.println(arr8.length);
//		System.out.println();
//		
//		//배열 참조변수끼리 대입가능-배열 공유(배열 주소 복사)
//		double[] arr9=new double[] {1.1,2.2,3.3};
//		double[] arr10;//쓰레기값을 가지고 있는 지역참조변수
//		arr10= arr9;//배열의 주소 복사(배열(값)이 복사된 것 X)
//		for (int i=0;i<arr10.length;i++) {System.out.print(arr10[i]+", ");}
//		System.out.println();
//		for (int i=0;i<arr9.length;i++) {System.out.print(arr9[i]+", ");}
//		System.out.println("\n");
//		//다른 참조변수에의해 원본이 변할 수 있음
//		
//		//배열값 복사
//		int[] arr11=new int[] {10,20,30};
//		int[] arr12=new int[arr11.length];//arr11과 값은 같지만 다른 객체 생성
//		for(int l=0; l<arr11.length;l++) {	arr12[l]= arr11[l];	}
//		
//		//기본형이 아닌 참조형자료형의 배열
//		//참조변수가 가리키는 배열객체안 요소참조변수가 있고 요소참주변수가 각각의 요소인 객체를 참조한다
//		//참조형 배열의 초기화
//		String[] arr=new String[] {new String("아주"),"NICE"};
//		String[] arr17= {"S","V","T"};//new String[] 생략가능
//		//String 참조형
//		String[] arr13=new String[3];;//string 참조변수(4byte)를 3개 생성 : 12byte
//									  //참조변수의 초깃값 : null값(0)
//		System.out.println(arr13[0]);//null출력
//		arr13[1]=new String("Hello");
//		arr13[2]="^-^!!";//new String생략가능
//		System.out.println(arr13[1]);
//		System.out.println(arr13[2]);
//		System.out.println(arr13);//참조하는 String배열 객체의 정보
//		System.out.println(arr13.length);//배열이 갖고있는 멤버변수 length-메모리에 배열이 생성될때마다 자동으로 선언됨
//		System.out.println(arr13[1].length());//문자열객체의 멤버함수 length
//		System.out.println(arr13[1].toUpperCase());
//		//
//		System.out.println(arr13[1].charAt(1));
		
		
		
		
		
		
		
		
			
		//다른 참조형(Class : 객체의 자료형) 배열
		//※※※배열은 객체를 가지고 있지않음 참조변수를 가지고 있음
		Random[] arr19= new Random[3];
		//Random 참조변수 3개의 배열 : 총 12byte---null값으로 초기화되어있음
		//Random 참조변수 : 리모컨
		arr19[0]=new Random();
		int m=arr19[0].nextInt();
		System.out.println(m+"\n");
		
		Scanner[] arr20=new Scanner[3];
		//Scanner객체를 3개 만든 것이 아니라 배열객체 1개를 생성한 것
		arr20[0]= new Scanner(System.in);
		int h=arr20[0].nextInt();
		System.out.println(h+"\n");
		
		//p.s└프로그래머 정의 자료형
//		Student[] stus = new Student[3];
//		stus[0]=new Student();
//		stus[0].name="Change up";		
//		//참조형 배열객체는 참조변수를 가지고 있는 객체
//		
//		//배열에서 <확장된 for문> 사용법...for each문
//		int[] nums=new int[3];
//		nums[0]=10;
//		nums[1]=20;
//		nums[2]=30;
//		for (int i:nums) {System.out.println(i);}		
//		String[] bbb=new String[] {"aaa","bbb","ccc"};
//		for (String str : bbb) {System.out.println(str);};
		//str은 객체가 아닌 참조변수
	}
}
//프로그래머 정의 자료형
//class Student{
//	String name;
//	int kor;
//	int eng;
//	double ever;
//	void stus(){System.out.printf("랄랄라");}
//	
//
//}
