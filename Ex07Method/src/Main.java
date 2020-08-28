import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//성적관리 프로그램		
		//class 정의 →연관있는 데이터의 묶음(이름,국어,영어,평균)
		//새로운 class정의시 별도의 .java문서에 만드는 것을 권장
		
		//새로 설계된 Student class로 객체 생성
		Student stu=new Student();
		stu.name="SUGAR";
		stu.kor=100;
		stu.eng=80;
		stu.aver=(double)(stu.kor+stu.eng)/2;		
		//화면 출력
		System.out.println(stu);//객체에 대한 정보
		System.out.println("이름 : "+stu.name);
		System.out.println("국어 : "+stu.kor);
		System.out.println("영어 : "+stu.eng);
		System.out.println("평균 : "+stu.aver);
		
		//멤버값 변경
		int k=10;
		stu.kor=k;//일반변수를 멤버변수에 대입
		System.out.println("변경된 국어: "+stu.kor);
		
		//멤버값 키보드로 입력 받기
		Scanner scan=new Scanner(System.in);
		Student stu3=new Student();
		stu3.name=scan.next();
		stu3.kor=scan.nextInt();
		stu3.eng=scan.nextInt();
		stu3.calAverage();
		//화면 출력
		//객체에게 특정동작을 수행하는 기능(Function==Method)부여
		//Java-Class에 특정기능을 수행하는 코드 작성==ㅡMethod작성
		stu3.output();//Method호출
	
		//파라미터 : 특정기능을 수행하면서 데이터를 전달--값전달
		//stu5.입력해("ㅁㅁㅁ",30,50,40.0);
		//TODO : class에 입력기능 만들기 
		
		
	
	}

}
