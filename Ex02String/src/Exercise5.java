import java.util.Scanner;
public class Exercise5 {
	public static void  main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("ù��° �ڸ� �Է�(3�ڸ�) : ");
		String first;
		do {
			first = scan.next();
			if (first.length()!=3) System.out.println("[�߸� �Է��ϼ̽��ϴ�. 3�ڸ��� ���ڸ� �Է°����մϴ�.]");
		}while(first.length()!=3);
		System.out.print("�ι�° �ڸ� �Է�(3~4�ڸ�) : ");
		String second;
		do {
			second = scan.next();
			if (second.length()<3 || second.length()>4) System.out.println("[�߸� �Է��ϼ̽��ϴ�. 3~4�ڸ��� ���ڸ� �Է°����մϴ�.]");
		}while(second.length()<3 || second.length()>4);
		System.out.print("����° �ڸ� �Է�(4�ڸ�) : ");
		String third;
		do {
			third = scan.next();
			if (third.length()!=4) System.out.println("[�߸� �Է��ϼ̽��ϴ�. 4�ڸ��� ���ڸ� �Է°����մϴ�.]");
		}while(third.length()!=4);
		System.out.println();
		System.out.println("�Էµ� ��ȭ��ȣ��  ["+first+"-"+second+"-"+third+"] �Դϴ�.");
	}

}
