import java.util.Scanner;
public class control6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int total=0;
		for(int i=0;i<5;i++) {
			System.out.print("���� �Է� : ");
			int n=scan.nextInt();
			if(n<=1) {
				i--;
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���");
				continue;
			}
			total+=n;
		}
		System.out.println("���� : "+total);
	}
	

}
