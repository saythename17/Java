
public class Calculator {
	//integer calculator
	//���� ��� �޼ҵ�
	int add(int x,int y) {
		return x+y;
	}
	//���� ��� �޼ҵ�
	int subtract(int x,int y) {
		return x-y;
	}
	//���� ��� �޼ҵ�
	int multiply(int x, int y) {
		return x*y;
	}
	//������ ��� �޼ҵ�
	double divide(int x, int y) {
		return (double)x/y;
	}
	
	//double float calculator
	//--=Overloading ����� ���� �ڷ����� �ٸ���� 
	//: �޼ҵ���� ����  �Ķ����(�ڷ���,����)�� �ٸ� �޼ҵ�
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
	
	//���ڿ��� ���ڷ� ��ȯ�Ͽ� �����ϴ� ��� 
	int add(String s1,String s2) {
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		return n1+n2;
	}
	

}
