package FileIO_;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test04 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try (BufferedInputStream in=new BufferedInputStream(new FileInputStream("D:\\Java\\workspace\\Java\\src\\FileIO_/a.txt"));
//			ByteArrayOutputStream out= new ByteArrayOutputStream();	){
//			byte[] buf=new byte[1024];
//			int len=0;
//			while((len=in.read(buf))!=-1) {
//				out.write(buf,0,len);
//			}
//			byte[] arr=out.toByteArray();
//			String s=new String(arr);
//			System.out.println(s);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		byte[] arr=null;
		try(BufferedInputStream in=new BufferedInputStream(new FileInputStream("D:\\Java\\workspace\\Java\\src\\FileIO_/a.txt"));
				ByteArrayOutputStream out =new ByteArrayOutputStream();) {
			byte[] arr2=new byte[1024];
			int len=0;
			while((len=in.read(arr2))!=-1) {
				out.write(arr2);
			}
			arr=out.toByteArray();
			String s=new String(arr);
			System.out.println(s);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try (BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream("a2.txt"))){
			bo.write(arr);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
