
package Inheritance5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//어떤 대학의 정보제공 앱 제작-회원간입 가능
		//1. 일반회원 : 이름, 나이
		//2. 학      생 : 이름, 나이, 전공
		//3. 교      수 : 이름, 나이, 연구과제
		//4. 근로학생 : 이름, 나이, 전공, 업무
		
		//일반회원
		Person p= new Person("sam", 20);
		p.show();System.out.println();
				
		//학생
		Student stu=new Student("robin",25,"android");
		stu.show();System.out.println();
		
		//교수
		Professor pro=new Professor("maranda",50,"mobile optimization");
		pro.show();
		
		//근로학생
		Alba alba=new Alba("somi",23,"web","PC management");
		alba.show();
	}
}
