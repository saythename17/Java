import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Exception 예외 처리
		// Error : 오류 -실행불가
		// Exception : 예외-실행 중(Run Time) 문제 발생
		
		//Exception 
		//ex1)사용자가 잘못된 데이터를 입력하는 경우
		//ex2)계발자의 로직이나 계산이 잘못된 경우 
		//└(배열의 인덱스를 잘못맞춘 경우)(0으로 나눈경우)
		//ex3)네트워크 or 하드웨어 오류
		//ex4)악의적 과부하 공격(디도스 공격,크래커) : 해결이 어려움
		//System.out.println("예외처리에 대해 알아봅시다.");
		
		//예외처리 : 프로그램 사용 중 예외상황이 발생하면 앱이 다운되지않고 
		// 	  	   예외가 발생한 작업을 제외한 나머지 작업을 그대로 수행하도록
		//예측불가능한 요소로 예외가 발생하는 경우 강제시도(try)해보고 
		//예외가 발생해도 프로그램이 다운되지 않도록 대응하는 방법
		//try-catch 문법   //if-else와 유사
		
		//★예외 상황1 0으로 나눗셈---필드기본값으로 나눌때 많이 실수
		//예외가 발생하는 순간, 프로그램은 그 위치에서 강제 종료
		int a=0;
//		try {//예외발생이 예상되는 코드를 작성
//			System.out.println(10/a);//---예외가 발생하면 실행X
//		}catch(ArithmeticException e) {//매개변수 자료형A~n
//			System.out.println("예외 발생");//예외가 발생하면 실행
//			System.out.println(e.getMessage());//에러 정보
//			System.out.println(e.toString());
//			//override된 method:자세한 에러 정보 - 개발자들이 더 많이 씀
//		}	//예외상황발생뒤에도 프로그램이 종료 되지 않음
//		System.out.println("예외상황 후");
//		System.out.println();
		//전달받은 파라미터 e는 예외정보를 가진 객체
		
		
		//★예외상황2 배열의 인덱스번호 사용 오류
		int[] arr=new int[5];
//		try {
//			for(int i=0;i<=5;i++) System.out.println(arr[i]);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("에러!");
//			//앞 인데스는 출력 arr[5]의 순간에 넘어옴
//		}
//		System.out.println();		
//		
//		//★예외상황3 null 참조변수로 객체의 method사용 
//		String s=null;
//		try {
//			System.out.println(s.length());
//		}catch(NullPointerException e) {
//			System.out.println("null error 객체없음");
//		}
//		System.out.println();
		
		//★예외상황 4 잘못된 데이터 입력
		Scanner scan=new Scanner(System.in);
//		int n;
//		try {
//			n=scan.nextInt();
//			System.out.println("입력 값 : "+n);
//			//예외상황이발생하지 않을때만 출력
//		}catch(InputMismatchException e) {
//			System.out.println("정수만 입력");
//		}
//		System.out.println();
		
		//★예외상황5 숫자가 아닌값 숫자로 변경
		//String str=scan.next();
//		try {
//			int num=Integer.parseInt(str);
//			System.out.println(num);
//		}catch(NumberFormatException e) {
//			System.out.println("정수아닌값변환불가");
//		}
		
		//###정리
		//예외처리 : 예외 발생시 프로그램이 다운되지 않도록 하는 문법###
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//예외처리 중첩 : 예외가 한번에 여러개 발생하는 경우
		//예) 두 수를 입력받아 나눗셈하는 경우
//		int c,d;
//		try {
//			c=scan.nextInt();
//			d=scan.nextInt();
//			
//			System.out.println("나눗셈결과 : "+c/d);
//		}catch(InputMismatchException e) {
//			System.out.println("정수만 입력가능");
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나눗셈 산수 불가");
//		}//멀티 catch: 가독성 ↑,개수제한X,몇개든 한번에 처리가능]
//		//* 모든 예외상황에서 처리할 내용이 다르지 않다면?
//		//멀티 캐치 대신 모든 Exception class들의 super class
//		//==Exception의 참조변수 이용
//		try {
//			c=scan.nextInt();
//			d=scan.nextInt();
//			
//			System.out.println("나눗셈결과 : "+c/d);
//		}catch(Exception e) {//모든 종류의 Exception 처리
//			System.out.println("ERROR");
//		}
//		
//		
//		//finally 문법 : 예외가 발생하든 안하든 무조건 실행되는 영역
		int x=0;
		try {
			System.out.println(10/x);
			System.out.println("계산 성공");
		}catch(Exception e) {
			System.out.println("계산 실패");
		}finally {//에러와 상관없이 실행
			System.out.println("무조건 실행-end fo network");
		}	
		//finally 를 굳이 사용하지않아도 try...catch {}밖에 작성하면
		//무조건 실행
		//BUT! 네트워크 작업,스트리밍시 finally를 쓰지않으면
		//꺼지지않음 :  메모리 낭비
		//연관성있는 코드를 묶어 가독성 ↑
		//finally :catch문 생략 가능
		try {			
		}finally{}//예외가 발생했을때 그냥 넘어감
		
		//Exception
		//1.Checked Exception : 예외처리를 안할시 실행이 안됨
		//2.UnChecked Exception :  예외처리 자유-개발자의 선택
		
		//대표적 Checked Exception-반드시 예외처리 해야하는 것
		//Net work 작업
		try {
			URL url=new URL("http://www.naver.com");
			System.out.println("연결성공");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("서버주소에 이상이 있음");
		}
		
		
		//파일 입출력
		File file=new File("D://aaa.txt");
		try {
			FileInputStream fis= new FileInputStream(file);
			System.out.println("파일 접속 성공");
		}catch(FileNotFoundException e) {
			System.out.println("파일 접속 실패- 파일 없음");
		}

	}

}
