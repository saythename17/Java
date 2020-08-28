
public class Student {
	//필드(멤버 변수) 생성
	String name;
	int kor;
	int eng;
	
	//Method(멤버 함수) 생성
	//필드값 출력 기능
	void show() {
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println();	}
	//필드값 입력 기능
	void setMembers(String name,int kor, int eng) {
		//매개변수(파라미터) != 멤버변수
		//파라미터의 값을 멤버변수의 전달
		this.name=name;//[this.]참조변수를 사용→멤버 지칭
		//모든 객체는 자기자신을 참조하는 참조변수가 하나 더있음:this
		this.kor=kor;
		this.eng=eng;		}
	
	//필드값 별도로 대입 기능
	void setMemb(String name) {this.name=name;}	
	void setKor(int kor) {
		if (kor<0||kor>100) {
			System.out.println("잘못된 값 입력"  );
			return;	//함수종료	
			}
		else this.kor=kor;}
	void setEng(int eng) {
		if (eng<0||eng>100) {
			System.out.println("잘못된 값 입력"  );
			return;	//함수종료	
			}
		else this.eng=eng;}
	
	//총점 계산 기능
	int calTotal() {//리턴 타입의 자료형==리턴값 자료형
		int total=kor+eng;
		return total;}
		
		
	//평균을 계산하여 리턴해주는 기능 메소드(in 객체)
	double culAverage() {
		double aver=(double)calTotal()/2;
//하나의 메소드에서 다른 메소드 호출 가능(멤버 메소드에서 다른 멤버 메소드 호출)
		return aver;}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

