
public class Student {
	//�ʵ�(��� ����) ����
	String name;
	int kor;
	int eng;
	
	//Method(��� �Լ�) ����
	//�ʵ尪 ��� ���
	void show() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println();	}
	//�ʵ尪 �Է� ���
	void setMembers(String name,int kor, int eng) {
		//�Ű�����(�Ķ����) != �������
		//�Ķ������ ���� ��������� ����
		this.name=name;//[this.]���������� ������ ��Ī
		//��� ��ü�� �ڱ��ڽ��� �����ϴ� ���������� �ϳ� ������:this
		this.kor=kor;
		this.eng=eng;		}
	
	//�ʵ尪 ������ ���� ���
	void setMemb(String name) {this.name=name;}	
	void setKor(int kor) {
		if (kor<0||kor>100) {
			System.out.println("�߸��� �� �Է�"  );
			return;	//�Լ�����	
			}
		else this.kor=kor;}
	void setEng(int eng) {
		if (eng<0||eng>100) {
			System.out.println("�߸��� �� �Է�"  );
			return;	//�Լ�����	
			}
		else this.eng=eng;}
	
	//���� ��� ���
	int calTotal() {//���� Ÿ���� �ڷ���==���ϰ� �ڷ���
		int total=kor+eng;
		return total;}
		
		
	//����� ����Ͽ� �������ִ� ��� �޼ҵ�(in ��ü)
	double culAverage() {
		double aver=(double)calTotal()/2;
//�ϳ��� �޼ҵ忡�� �ٸ� �޼ҵ� ȣ�� ����(��� �޼ҵ忡�� �ٸ� ��� �޼ҵ� ȣ��)
		return aver;}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

