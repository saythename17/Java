import java.util.Random;

public class Memo06 {
	public static void main(String[] args) {
		int[] array=new int[25];
		Random rnd=new Random();
		for (int i=0;i<array.length;i++) {
				array[i]=rnd.nextInt(25)+1;
				for(int j=0;j<i;j++) {
					if(array[i]==array[j]) i--;
				}
			}
		for (int i=0;i<array.length;i++) {
			if(i%5==0)System.out.println();
			System.out.print(array[i]+"\t");
			}
	}
	

}
