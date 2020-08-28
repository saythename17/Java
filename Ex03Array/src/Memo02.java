import java.util.Scanner;
public class Memo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("학생의 수를 입력하시오 : ");
		int n = scan.nextInt();	
		int[] student=new int[n];
		int sum=0;
		for(int i=1;i<(student.length)+1;i++) {
			System.out.print("학생 "+i+"의 성적을 입력하세요 : ");
			int score=scan.nextInt();
			if(score<0 || score>100) {System.out.println("잘못된 성적입니다. 다시 입력하세요.");i--;}
			else sum+=score;
		}
		double aver=sum/student.length;
		System.out.println();
		System.out.println("성적 평균은 "+ aver +" 입니다.");

	}

}
