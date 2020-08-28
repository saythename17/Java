import java.util.Scanner;
public class main2 {

	public static void main(String[] args) {
		String s=new String("Hello");
		
		//<indexOf>
//		// 4.문자열 안에 특정문자가 있는 인데스번호(몇번째방에 있는지)
		int index=s.indexOf('l');
		System.out.println(index);//앞문자부터 셈
		System.out.println(s.lastIndexOf('l'));//뒤에서부터 셈
		System.out.println(s.indexOf("el"));//특정문자열위지(시작인덱스 번호)
		System.out.println(s.indexOf("eo"));//존재하지 않는 문자열의 인덱스 번호 : 음수
		//특정위치부터 검사 시작
		System.out.println(s.indexOf('o',2));//2번 인덱스부터 검사시작
		System.out.println();
		
		//<contains>
		// 5.문자열안에 특정문자열이 포함되었는가(비속어 필터링에 이용)
		String s2="Hello world! Hello android! Nice world!!";
		boolean b=s2.contains("world");
		System.out.println(b);
		System.out.println();
		
		//<concat>
//		// 6.문자열의 결합
		//※(immutable)불변의 법칙 : Java의 객체안의 값들은 절대로 바꿀 수 없음
		//※ ∴ 자바의 문자열 객체안의 문자열값을 변경하는 것이 불가능
		String s3=s2.concat("Nice android!");
		//concat: 각각의 문자열의 값을 합쳐 새로운곳에 다시저장 
		//기존 문자열뒤에 붙이는 것이 아님
		System.out.println(s3);
		System.out.println(s2);//원본은 그대로. 바뀌지 않음
		//concat은 사용빈도가 낮음 --문자열 결합연산자(+)사용
		System.out.println();
		
		//<startsWith> <endsWith>
//		//7.특정문자열로 시작하는가(특정이메일 검증)
		System.out.println(s2.startsWith("Hello"));
		System.out.println(s2.startsWith("world"));
		//특정문자열로 끝나는가?
		System.out.println(s2.endsWith("world"));
		System.out.println(s2.endsWith("!!"));
		System.out.println();
		
		//<toUpperCase>
//		//8.대소문자 자동변환----영어 대문자나 소문자만 해당
		 String s4=s2.toUpperCase();
		 System.out.println(s4);//다대문자로 변환
		 System.out.println(s);//★원본은불변
		 System.out.println(s2.toLowerCase());//다소문자로 변환
		 System.out.println();
		 
		 //<trim>
//		 //9.문자열 양끝의 공백문자 제거
		 s="Hello world                  ";
		 System.out.println("["+s+"]");
		 System.out.println("["+s.trim()+"]");
		 System.out.println();
		 
		
		
		
		 //<replace>
		 //★10.특정 문자 변경하기
		s="Hello world! Hello android! Nice android!!";
		String s6=s.replace('H', 'K');//s값 (원본)이 바뀌는 것이 아님
		System.out.println(s);
		System.out.println(s6);
		String s7=s.replace("android", "ios");//문자열 변경도 가능
		System.out.println(s7);
		System.out.println(s);//원본은 그대로
		//중간 공백 제거
		String s8=s.replace(" ", "");
		System.out.println(s8);
		//비속어 거르기
		//s=scan.next();
		//s=s.replace("fuck", "XXXX");
		System.out.println();
		
		//<substring>
		//★11.문자열 잘라내기
		String s9=s.substring(6,12);//(시작 인덱스,마지막 인덱스 전까지)
		System.out.println(s9);
		s9=s.substring(6);//(시작 인덱스,마지막 인덱스 전까지)
		System.out.println(s9);
		System.out.println();
		
		//<compareTo>
		//★12.문자열 대소비교(정렬할때 사용)
		char ch1='a';
		char ch2='b';
		System.out.println(ch1>ch2);
		
		String s10="ddd";
		String s11="bbb";
		//System.out.println(s10>s11);--ERROR주소 비교는 불가
		System.out.println(s10.compareTo(s11));//알파벳 순서대로나옴
		
		//<split>
		//13.문자열 분리-문자열 안에 특정 문자를 기준으로 문자열을 분리하여 배열을 리턴
		s="android:ios:windows:hello";
		String[] arr=s.split(":");
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		//System.out.println(arr[4]);--ERROR
		
		
		
		
		
		
		
		
		
		
		
		//String class static Method
		//static method : 객체생성없이 바로 사용할수 있는 메소드 [클래스명 . 메소드명()]
		//시계앱 만들기
		//1. format()메소드 - printf()와 흡사
		int h=10, m=5, sec=12;//시,분,초 변수 설정
		System.out.println(h+":"+m+":"+sec);
		m=15;
		System.out.println(h+":"+m+":"+sec);	
		//출력을 특정 출력형식으로 하는 함수 : printf--but consol창에서만 출력 가능
		System.out.printf("%02d:%02d:%02d\n",h,m,sec);
		m=5; sec=2;
		System.out.printf("%02d:%02d:%02d\n",h,m,sec);
		//GUI(앱개발 환경)에서는 반드시 출력데이처가 String이어야 함
		String sss=h+":"+m+":"+sec;//sss문자열로 만듬
		//format()메소드는 콘솔창이 아니어도 문자열로 포멧된 글씨를 리턴
		sss=String.format("%02d:%02d:%02d", h,m,sec);
		System.out.println(sss);
		System.out.println();
		
		//2. valueOf() : 기본형자료형→문자열
		int n=100;
		String munja=String.valueOf(n);
		System.out.println(munja.length());//문자열 100의 자리수를 알려줌
		double l=3.14;
		munja=String.valueOf(l);
		System.out.println(munja.length());
		//굳이 valueOf를 쓰지 않음
		munja=n+"";//결합연산자에 의해 문자열로 변환
		
		//3. 짜료형.parse짜료형 : 문자열→기본형자료형
		// Wrapper class(Integer,Double,FLoat,Long)
		String s12="5";//숫자가 아닌 문자열 100
		System.out.println(s12+3);
		//int g=s12;---ERROR
		int g=Integer.parseInt(s12);//s12를 Int로 parse분석해라. Integer class를 통해
		System.out.println(g+3);
		
		s12= "3.14";
		double w= Double.parseDouble(s12);
		System.out.println( w+1.2  );
		


}

}
