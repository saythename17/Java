
public class First {
	
	//객체 생성시 (new) 자동으로 !한번! 실행되는 Method : Constructor
	//The Rule of How To Make <Constructor>
	//1.Constructor name==class name
	//2.Constructor got no return type
	//All class have Constructor : (default Constructor) : nothing ---First() {         }
	 
	First(){
		System.out.println("Create void Constructor");
	}
	First(int n) {//Constructor Overloading
		System.out.println("Create Integer Constructor"+n);
	}

}
