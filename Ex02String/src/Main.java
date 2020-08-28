import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String s=new String("Hello");		
		//String class의 유용한 Method(기능)들
		
		//<length>
		//1.문자열 데이터의 길이(글자수)를 ★리턴해주는 기능		
		int len=s.length();
		System.out.println(len);//println단축키 sysout+ctrl+space		
		
		//<equals>
		//2.문자열 값의 비교
		System.out.println(s=="Hello");//값이 아닌 주소를 비교
		String s2=s;
		System.out.println(s==s2);//주소를 공유하고 있기때문에 같음
		System.out.println(s.equals(new String("Hello")));
		System.out.println(s.equals("Hello"));
		//                    └equals : 값을 비교
		System.out.println(s.contentEquals(s2));
		System.out.println(new String("Nice").equals("Nice"));
		//참조변수 없이 일회용으로 비교
		System.out.println("Nice".equals("Nice"));
		//Java에서 문자열 데이터는 객체이다.
		"Seventeen".length();//문자열은 객체이기때문에 메소드활용가능
		//대문자소문자구분없이 단어만 비교
		System.out.println(s.equals("hello"));
		System.out.println(s.equalsIgnoreCase("hello"));		
		
		
		//charAt
		//3.문자열안에서 특정 char 가져오기
		//s.charAt(index);---index : 배열의 방번호
		char ch =s.charAt(0);
		System.out.println(ch);
		System.out.println(s.charAt(0));//charAt 실행후 리턴된 값 출력
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));		
		for (int i=0;i<s.length();i++){//문자열을 바꿀 때도 자동으로 글자수에 맞춤
			System.out.println(s.charAt(i));
		}		
		
		//Scanner class에 char형 입력
		Scanner scan=new Scanner(System.in);
		char c=scan.next().charAt(0);//문자열로 입력받기
		System.out.println(c);

	}

}
