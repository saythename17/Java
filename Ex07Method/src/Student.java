
public class Student {
	//filed ����(��� ����, �����ִ� �����͸� �����Ҽ� �ִ� ����)
	String name;
	int kor;
	int eng;
	double aver;
	
	//Method ����(���)
	void calAverage() {
		aver=(double)(kor+eng)/2;
	}
	void output() {
		//class �� �������(Method ���忡�� ��������) ���
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("��� : "+aver);
		System.out.println();}
	

}
