
public class Student {
	//filed 정의(멤버 변수, 연관있는 데이터를 저장할수 있는 변수)
	String name;
	int kor;
	int eng;
	double aver;
	
	//Method 정의(기능)
	void calAverage() {
		aver=(double)(kor+eng)/2;
	}
	void output() {
		//class 안 멤버변수(Method 입장에선 전역변수) 사용
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("평균 : "+aver);
		System.out.println();}
	

}
