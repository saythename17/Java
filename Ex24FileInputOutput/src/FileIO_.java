import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File을 copy해주는 프로그램 
		//원본파일의 경로와 파일명.확장자 필요
		String srcPath="D:/files/aaa.txt";
		
		try {//원본파일을 읽어오기 위해 무지개로드 생성- 해임달없이 해보기
			FileInputStream fis=new FileInputStream(srcPath);
			
			//읽어온 데이터를 저장할 파일의 경로와 파일명지정
			File path=new File("D:/copy");//경로지정
			if(!path.isDirectory())	path.mkdirs();//없으면 만들어라
			File file=new File(path, "bbb.txt");//경로+파일명 결합한 객체 생성
			//위에서 만든 파일과 연결된 OutputStream 생성
			FileOutputStream fos=new FileOutputStream(file);
			FileInputStream fis2=new FileInputStream(file);
			//원본에서 1byte씩 읽어오면서 바로 카피할 파일에 1byte씩 저장
			while(true) {
				byte b=(byte)fis.read();				
				if(b==-1)break;
				System.out.print((char)b);
				fos.write(b);//위에서 읽어온 data 1byte씩 바로쓰기
			}
			fos.flush();// Stream에 남아있을 수 있는 데이터 밀어내기
			fis.close(); 		fos.close();
			System.out.println("복사 완료");
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음");
		} catch (IOException e) {
			System.out.println("복사중 오류발생");
		}

	}

}




