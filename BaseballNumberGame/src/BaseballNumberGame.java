import java.util.Random;
import java.util.Scanner;
public class BaseballNumberGame {
	public static void main(String[] args) {
		Random rnd=new Random();
		int h;
		while(true) {
			h=rnd.nextInt(899)+100;
			if (h/100!=(h%100)/10 && h/100!=h%10) {
				if((h%100)/10 != (h%10)) break;
			}
		}//while
		
		
		Scanner scan=new Scanner(System.in);
		int h100=h/100,  h10=h%100/10,  h1=h%10;
		
		for(int i=1;i<11;i++)
		{ 
			if (i==10) {System.out.println("~LOSE~"); break;}
			System.out.println("[ "+i+"회 ]");
			System.out.print("중복되지 않는 3자리 입력 :");
			int user=scan.nextInt();
			if (user==h) {System.out.println("HOMERUN!!!");	break;}
			
			int strike=0,ball=0;
			
			//strike
			int u100=user/100,  u10=user%100/10,  u1=user%10;
			if (u100==h100) strike++;
			if (u10==h10) strike++;
			if (u1==h1) strike++; 
			//ball
			if(u100==h10||u100==h1) ball++;
			if(u10==h100||u10==h1) ball++;
			if(u1==h100||u1==h10) ball++;
			
			//출력
			System.out.println(strike+" strike\t"+ball+" ball");
			System.out.println();
		}
	}

}
