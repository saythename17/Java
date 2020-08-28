import java.util.Random;
public class Hello {
	
	public static void main(String[] args) {
		//변수 값 대입시 주의사항
		//※메모리가 작은 자료형 변수에 메모리가 큰 상수 대입 불가능
		//ex) int a(4byte)= 3.14(8byte); → ERROR
		int a = (int)3.14;
		float b;//b=3.14; 실수형 리터럴 상수의 메모리 크기 : double 8byte
		b = 3.14f;//∴float형으로 강제형변환
		b = 10;//10.0으로 자동형변환
		byte d;
		d = 127;//byte=8bit=256가지 숫자 저장(+127,-127)
		short e;
		e = 32500;
		long m;
		m = 2500000000L;//L : long형변환 - 정수형 int(오른쪽)의 메모리크기를 넘는 수를 대입하기위함
		
		char k = 65;//유니코드(전세계문자를 다 가지고 있음) : 아스키 코드 + α
		System.out.println(k);
		
		boolean x,y;
		x = true; y = 5>3;
		System.out.println(x);//boolean논리 값
		System.out.println(true);//true글자
		System.out.println(y);
	
		//Java는 문자열데이터를 무조건 객체로 관리
		//"Hello";//literal String 객체
		String s = new String("Hello");//String 객체 (새로만듬)
		String ss = new String("Hello");
		System.out.println(s.length());//length() : 글자수 
		// 참조변수 : 리모콘  / 객체 : 에어컨
		String s1 = "Yolo";//자동 new처리
		String ss1 = "Yolo";
		System.out.println(s1);
		String s2 = s;//주소 공유
		System.out.println(s2);
		System.out.println(s==s2);//주소가 같은지 묻는 것
		System.out.println(s==ss);
		System.out.println(s1==ss1);
		
	}
}
/*자료형*/
/*●기본형 : Primitive ---일반변수,논리값 저장
   └boolean : 논리 -true,false(1bit만 사용 → 1byte할당)
   └byte 정수(1bte) : 이미지 파일 ,동영상 편집/char(2byte)/short(4byte)/int(2byte)
   └long(8byte)/float(4byte)/double(8byte)

 *●참조형 : Reference ---포인터 변수,첫글자가 대문자
   └String,Random,Scanner… 약 4000개*/