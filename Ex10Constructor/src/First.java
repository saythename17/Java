
public class First {
	
	//��ü ������ (new) �ڵ����� !�ѹ�! ����Ǵ� Method : Constructor
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
