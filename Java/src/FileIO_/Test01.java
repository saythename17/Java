package FileIO_;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fi=new FileInputStream("D:\\Java\\workspace\\Java\\src\\FileIO_/a.txt");
			FileOutputStream fo=new FileOutputStream("b.txt");
			int c=0;
			while((c=fi.read())!=-1)	fo.write(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
