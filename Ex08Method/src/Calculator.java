
public class Calculator {
	//integer calculator
	//덧셈 기능 메소드
	int add(int x,int y) {
		return x+y;
	}
	//뺄셈 기능 메소드
	int subtract(int x,int y) {
		return x-y;
	}
	//곱셈 기능 메소드
	int multiply(int x, int y) {
		return x*y;
	}
	//나눗셈 기능 메소드
	double divide(int x, int y) {
		return (double)x/y;
	}
	
	//double float calculator
	//--=Overloading 기능은 같고 자료형이 다른경우 
	//: 메소드명은 같고  파라미터(자료형,개수)가 다른 메소드
	double add(double x, double y) {
		return x+y;	
	}
	double subtract(double x, double y) {
		return x-y;	
	}
	double multiply(double x, double y) {
		return x*y;	
	}
	double divide(double x, double y) {
		return x/y;	
	}
	
	//문자열을 숫자로 변환하여 덧셈하는 기능 
	int add(String s1,String s2) {
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		return n1+n2;
	}
	

}
