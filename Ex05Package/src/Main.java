//다른 패키지의 클래스를 편하게 사용
//import aaa.Student;
//import aaa.Person;
//aaa패키지 내부 모든 클래스 한번에 import
import aaa.*;// [*] : ALL

public class Main {

	public static void main(String[] args) {
		//class생성→ 객체생성 및 사용
		Test test=new Test();
		test.a=10;//field사용
		test.show();//method사용
		
		//같은 이름을 가진 class생성시 문제발생
		// ∴ package 사용(≒C's namespace)
		//실제 패키지구분을 통해 (이미 존재하는 )같은 이름의  class를 생성
		
		//다른 패키지의 클래스는 [패키지명.클래스명]으로 호출해야 인식됨
		aaa.Student stu =new aaa.Student();//aaa패키지 폴더의  class 객체 생성
		stu.eng=80;
		stu.kor=100;
		stu.name="DAHOON";
		
		//패키지명(.aaa)생략법 : import
		Student stu2=new Student();
		//Java system API사용시(약 4000개) import 필요
		// └ 모두 패키지 적용
		// [ . ]: 하위 폴더로
		bbb.Student stu3= new bbb.Student();
		stu3.name="robin";
		
		aaa.Person p=new aaa.Person();
		Person p1=new Person();
		
		mehi.dev.World w=new mehi.dev.World();
		
		//디폴트 패키지는 다른 패키지에서 사용 불가 → 실무에서 사용되지 않음
		//자동으로 클래스를 만들면서 패키지 생성
		
		
			
		
	}

}
