import java.util.Scanner;
public class control5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� Ƚ�� : ");
		int n=scan.nextInt();
		int total=0;
		for(int i=0;i<n;i++) {
			int num=scan.nextInt();
			total+=num;
		}
		System.out.println("��� : "+(double)total/n);
	}

}
