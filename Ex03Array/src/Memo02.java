import java.util.Scanner;
public class Memo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�л��� ���� �Է��Ͻÿ� : ");
		int n = scan.nextInt();	
		int[] student=new int[n];
		int sum=0;
		for(int i=1;i<(student.length)+1;i++) {
			System.out.print("�л� "+i+"�� ������ �Է��ϼ��� : ");
			int score=scan.nextInt();
			if(score<0 || score>100) {System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��ϼ���.");i--;}
			else sum+=score;
		}
		double aver=sum/student.length;
		System.out.println();
		System.out.println("���� ����� "+ aver +" �Դϴ�.");

	}

}
