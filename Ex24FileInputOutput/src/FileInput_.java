import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput_ {

	public static void main(String[] args) {
		// 읽어올 파일의 파일명을 가진 해임달객체 생성
		File file=new File("aaa.txt");
		
		//파일 과 연결할 무지개로드(Stream)생성 -데이터를 읽어오는 InputStrem
		//그 중에서도, File용으로 만들어진 [FileInputStream]생성
		try {//파일이 존재하지 않으면 예외발생!- 자동으로 생성X
			FileInputStream fis=new FileInputStream(file);
			//stream을 통해 읽어오기
//			byte b=(byte)fis.read();//1byte로 읽어옴
//			while(b!=-1/*read()는 글자가 더이상 없을때 -1리턴*/) {
//				System.out.print((char)b);
//				b=(byte)fis.read();
//			}
			//byte[]배열로 한번에 읽어오기
			//읽어올 데이터를 저장할 비어있는 byte[]배열준비
			byte[] bytes=new byte[1024];//1024=1KB :여유있는 크기로
			fis.read(bytes);
			//읽어온byte[]배열→String으로 변환하여 출력
			String s=new String(bytes);
			//└생성자에 전달된 byte[]배열을 문자열로 전환
			System.out.println(s);
			System.out.println("파일 로드 완료");
			//지구와 아스가르드 사이의 무지개로드 닫기->데이터 읽기가 끝났으면 Stream닫기
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않음");
		} catch (IOException e) {
			System.out.println("읽기 작업 중 오류 발생");
		}

	}

}








