
public class Test37 {
	public static void main(String[] args) {
		int[] score= {90,85,78,100,98};
		int sum=0;
		double aver=0.0;
		int max=0;
		int min=101;
		for (int i=0;i<score.length;i++) {
			sum+=score[i];
			if(score[i]>max) max=score[i];
			if(score[i]<min) min=score[i];
		}
		aver=sum/score.length;
		System.out.println("��   �� : "+sum);
		System.out.println("��   �� : "+aver);
		System.out.println("�ִ� : "+max);
		System.out.println("�ּڰ� : "+min);
	}

}
