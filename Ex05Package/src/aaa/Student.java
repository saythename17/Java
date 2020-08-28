package aaa;
import bbb.Nice;
//이름,국어,영어 데이터 저장
public class Student {
	public String name; public int kor; public int eng;
	
	//main함수가 아닌곳에서도 사용자정의 class 사용가능
	
	//다른 패키지의 class사용 가능
	bbb.Nice n= new bbb.Nice();
	Nice n2= new Nice();
	
	//본인이 본인 class사용 가능
	
	//패키지명 권장사항
	//가급적 적어도 두단어로 생성
	//두단어 사이에  .표시
	//ex1) svt.hoshi / kako.map / google.api.android
	//소속.카테고리.기능

	
}
