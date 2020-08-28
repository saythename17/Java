import java.util.Random;
public class Memo07 {
	public static void main(String[] args) {
		int[][] arr=new int[5][5];
		Random rnd=new Random();
		int j;
		for(int i=0;i<arr.length;i++) {
			
			for (j=0;j<arr[i].length;j++) {arr[i][j]=rnd.nextInt(25)+1;
			for(int k=0;k<j;k++) {if(arr[i][j]==arr[i][k]) j--;break;}	
			}//for j
			for(int k=0;k<i;k++) {if(arr[i][j]==arr[k][j]) { i--; break;}}
		}//for i
		
		
		for(int i=0;i<arr.length;i++) {
			for(int o=0;o<arr[i].length;o++) {
				System.out.print(arr[i][o]+"\t");
			}System.out.println();
		}
	}//main

}
