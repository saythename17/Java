import java.util.Scanner;

public class Memo04 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] array= new int[10];
		while(true) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�( 1(Y) �Ǵ� 0(N) )? : ");
			int check =scan.nextInt();
			if (check==0) {System.out.println("������ �����մϴ�. "); break;}
			else {
				System.out.println(" ������ ���� ���´� ������ �����ϴ�.");
				System.out.println(" -----------------------");
				System.out.println(" �¼� ��ȣ :  1  2  3  4  5  6  7  8  9  10");
				System.out.println(" -----------------------");
				System.out.print(" ���� ���� :  ");
				for (int i:array)System.out.print(i+"  ");
				System.out.println();
				while(true) {
				System.out.print(" ���° �¼��� �����Ͻðڽ��ϱ�? : ");
				int sit=scan.nextInt();
				if(array[sit-1]!=0) System.out.println(" �˼��մϴ�. �̹� ����� �¼��Դϴ�. �ٸ� �¼��� ������ �ּ���."+"\n");
				else {
					array[sit-1]=1;
					System.out.println("  "+sit+"�� �¼� ����Ǿ����ϴ�."); System.out.println(); break;}
				
				}
				
			}
			
		}
	}

}
