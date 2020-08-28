package BBB;

import Inheritance2.AAA;

public class BBB extends AAA {

	//이미 AAA의 멤버변수 4개를 보유하나 상태
	void show() {
		//System.out.println(a);--- private
		//a가 필드로서 존재함을 인식하지만 private(Access Modifier)로 인해 접근 불가
		//System.out.println(b);--- (default)
		//default는 다른 package에서 접근 불가
		System.out.println(c);//protected
		//같은 package에서만 사용가능하나 예외적으로 상속관계에서는 접근 허용
		System.out.println(d);//public---어디서든 허용
	}
}


