import java.util.Scanner;

public class Memo09 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] arr=new int[3][];
		int[] total=new int[3];
		double[] aver=new double[3];
		double allAver=0;
		
		for(int i=0;i<3;i++) {
		System.out.print("["+(i+1)+"반] 인원 수 입력 : ");
		int n=scan.nextInt();
		arr[i]=new int[n];
		
		for (int j=0;j<arr[i].length;j++) {
			System.out.printf("[%d반 %d번] : ",i+1,j+1);
			int score=scan.nextInt();
			arr[i][j]=score;
			total[i]+=score;}
		
		aver[i]=(double)total[i]/n;
		System.out.println();}//입력 for
		
		//출력
		System.out.println("----Java Programming 성적표 ----");
		for(int i=0;i<3;i++) {		
		System.out.printf("[%d반]  ",i+1);
		for(int j:arr[i]) System.out.print(j+"  ");		
		System.out.printf("[평균 : %.1f]",aver[i]);
		allAver+=aver[i]; System.out.println();
		}//출력 for
		System.out.println("-----------------------------");
		System.out.println("전체 평균 : "+(allAver)/3);
		int cl=(aver[0]>aver[1])||(aver[0]>aver[2])?1:aver[1]>aver[2]?2:3;
		System.out.println("최우수반 : "+cl);
		

		
		
		
	}
}
