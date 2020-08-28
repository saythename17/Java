import java.util.Scanner;
public class Memo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[10];
		for (int i=0;i<arr.length;i++) {
			int n=scan.nextInt();
			
			
			if (n>0||n<11) arr[0]++;
			else if (n>10||n<21) arr[1]++;
			else if (n>20||n<31) arr[2]++;
			else if (n>30||n<41) arr[3]++;
			else if (n>40||n<51) arr[4]++;
			else if (n>50||n<61) arr[5]++;
			else if (n>60||n<71) arr[6]++;
			else if (n>70||n<81) arr[7]++;
			else if (n>80||n<91) arr[8]++;
			else if (n>90||n<101) arr[9]++;			
		}
		System.out.println("  1 - 10 : ");
		
		

	}

}
