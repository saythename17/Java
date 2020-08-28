package FileIO_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("이름 입력");
			String name=br.readLine();
			System.out.println("Hello "+name);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
