import java.util.Scanner;

public class Memo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5];
		int sum=0;int max=0; int min=0;
		for (int i=0;i<arr.length;i++) {
			Scanner scan=new Scanner(System.in);
			int num=scan.nextInt();
			arr[i]=num;
			sum+=num;
		}		
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>max)max=arr[i];
			if(arr[i]<min)min=arr[i];			
		}
		System.out.println("�Էµ� ���� �� �ִ밪 : "+max);
		System.out.println("�Էµ� ���� �� �ּҰ� : "+min);
		System.out.println("�Էµ� ����  �� �� : "+sum);
		

	}

}
