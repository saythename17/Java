import member.Person;

public class Main {

	public static void main(String[] args) {
		// TODO 접근 제한자 Access Modifier
		/*1. private : 선언된 class내부에서만 멤버에 접근 가능
		  2. (default,package) : 같은 package안에서 .연산자로 접근 가능
		  3. protected : 같은 package안에서 .연산자로 접근 가능
		  				  다른 package에서 상속관계면 접근 가능
		  4. public : 어느 곳에서나 .연산자를 통해 멤버에 접근 가능*/
		//접근제한자 사용→ 필드,메소드,클래스
		
		//같은 package의 객체 생성
		First f=new First();
//f.a=10; → ERROR : private은 외부(객체class밖)에서 사용 불가
		f.b=10; //default
		f.c=10; //protected
		f.d=10; //public
		//같은 package내의 멤버는 private제외 사용가능
		
		f.aaa(); //default
		aaa.Second s = new aaa.Second();//다른 패키지 멤버에 접근하기 위해 [패키지명.]필요
		//s.a=10; ERROR : private은 외부에서 접근 불가
		//s.b=10; ERROR : (default) 다른 패키지에서 접근 불가
		//s.c=10; ERROR : protected 다른 패키지 에서 접근 불가
		s.d=10;//public
		//s.aaa(); ERROR : (default)접근 제한 메소드 
		s.bbb();//public method→ 어디에서나 접근 가능
		//다른 package의 (default) class는 객체 생성 불가
		//ERROR)aaa.Test t;--- information hiding: 정보은닉
		//하나의 자바문서안에 클래스 여러개를 설정시  각 클래스별로 접근제한자 개별 설정 불가
		
		//접근제한자 권장 규칙
		//대체로 필드(멤버변수)는 private, 메소드는 public
		
		
		
		
		
		
		
		
		
		
		
		
		Person p=new Person();
		//p.name="Sam";ERROR : private 정보은닉
		//은닉된 멤버변수에 값 대입하는 메소드 호출
		p.setMembers("Sam", 25, "Korea");
		//멤버함수를 통해 호출
		p.show();
		
		//멤버변수 별로 세팅하는  메소드 호출
		p.setName("Rose");
		p.setAge(16);
		p.setNation("America");
		p.show();
		
		//필드 사용법---멤버변수값 리턴해주는 메소드 호출
		if (p.getAge()<20) {
			System.out.println(p.getName()+"는 미성년자");
		}
		

	}

}
