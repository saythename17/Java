
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.name="THE8";
		stu.kor=80;
		stu.eng=70;
		stu.show();
	
		Student stu2=new Student();
		//값을 일일이 대입하지않아도 입력가능한 코드
		stu2.setMembers("Dino",40,60);
		//입력메소드 호출&입력할 값을 메소드에 파라미터로 전달
		stu2.show();//출력메소드 호출
		Student stu3=new Student();
		stu3.setMembers("Jisu", 90, 85);
		stu3. show();
		
		//멤버변수별로 값을 대입하기
		stu3.setEng(756);
		stu3.show();
		stu3.setEng(75);
		stu3.show();
		
		//객제지향 : 스스로의 값으로 스스로 계산하도록 만듬
		int total=stu3.calTotal();//메소드의 리턴값이 저장됨
		System.out.println("총점 : "+total);
		
		
		
		//평균출력
		System.out.println("평균:"+stu3.culAverage());
		//System.out.println("평균 : "+aver+"\n");
		
		//정리
		//class(객체) : 필드 + 메소드 (변수+함수-기능)
		//p.s 필드없이 메소드만 존재하는 객체도 많음
		
		int a =10;
		int b=4;		
		//사칙연산을 위한 계산기 객체 생성(기능만 존재하는 class)	
		Calculator cal= new Calculator();
		int sum=cal.add(a, b);
		System.out.println(sum);
		int sub=cal.subtract(a, b);
		System.out.println(sub);
		System.out.println(cal.multiply(a, b));
		System.out.println(cal.divide(a, b));
		//메소드 오버로딩
		double c=3.5;
		double d=4.6;
		System.out.println(cal.add(c, d));
		System.out.println(cal.subtract(c, d));
		System.out.println(cal.multiply(c, d));
		System.out.println(cal.divide(c, d)+"\n");
		
		//숫자 문자열의 덧셈연산
		System.out.println(  "123" + "456" );
		int n= Integer.parseInt("123");
		int n2= Integer.parseInt("456");
		System.out.println( n+n2 );
		//문자열을 숫자로 변환하여 산술연산을 해주는 기능의 객체 생성
		System.out.println("변환 : "+cal.add("123", "456"));
		
		
		
		
		
		
		
		
		
		
		
		
		//call by value
		int x=10;
		Cal ca=new Cal();//객체 생성
		ca.increase(x);//전달 받은 값 1증가시키는 메소드
		System.out.println(x);//원본이 변하지 않음
		//파라미터에 전달한 인수(argument)에 값만 전달
		
		//call by Reference(참조값-주소 전달)
		int[] arr=new int[] {10,20,30};
		//참조변수인  arr의값: 주소가 전달됨 
		ca.increase(arr);
		System.out.println();
		for(int t:arr) {//arr[]의 값도 변경됨
			System.out.print(t+"\t");
		}System.out.println();
		
		//가변길이 인자(파라미터)
		ca.aaa();//length=0인 배열
		ca.aaa(10);System.out.println();		
		ca.aaa(10,20);System.out.println();
		ca.aaa(10,20,30,40,50);			
	}//main Method
}//Main class

class Cal{//Method는 언제나 Class 안에 존재
	//전달받은 값 1증가!-call by Value
	void increase(int x) {
		x++;
		System.out.println("x: "+x);}
	//배열을 파라미터로 받아 그값들을 1씩 증가시키는 메소드
	void increase(int[] a) {
//		            └배열X,arr과 같은 값을 가리키는 참조변수(4byte)
		for (int i=0;i<a.length;i++) {
			a[i]++;
			System.out.print(a[i]+"\t");}}
	//가변길이 인자
	void aaa(int... a) {//...(spread 연산자)
		for (int t:a)//a는 배열(참조변수)임
		System.out.print(t+"\t");
	}
}
