import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StringInputOutput {

	public static void main(String[] args) {
		// 문자열 데이터를 한단어씩 입력받아 별도의 파일에 저장하고 읽어오는 프로그램
		//사용자로부터 문자열 데이터 입력받기
		Scanner scan=new Scanner(System.in);
		//사용자가 NO라는 글자를 입력할때까지 계속 입력
		while(true) {
			System.out.print("		Input Word(NO->end) : ");
			String str=scan.nextLine();			
			if(str.equalsIgnoreCase("NO"))break;
			//문자열 비교:[==]사용불가	└대소문자 구분없이 비교		
			
			//파일은 프로그램에서 자동으로 만들어주지 않기에 명시적으로 파일 만들기
			//별도의 파일에 저장하기 위한 File(해임달)객체 생성
			//목표위치: "본인프로젝트폴더/files/bts.txt"
			//먼저 폴더위치가 지정된 File객체생성
			File path= new File("files");//files라는 폴더명 생성
			if(!path.exists()/*exists:존재여부*/) path.mkdirs();
			//└폴더가 없으면 만듬//경로+파일명.확장자 를 가진 File객체생성
			File file=new File(path,"bts.txt");//"files/bts.txt"
			
			//파일과 연결할 무지개로드(Stream)객체 생성
			//단, byte stream(Output Stream)이 아닌 문자스트림(Writer)사용
			//Writer중에서-File용으로 만들어진 FileWriter사용
			try {
				FileWriter fw=new FileWriter(file,true);//append모드
				fw.write(str+"\n");//줄바꿈
				fw.flush();//Stream에 남아있을지 모르는 data밀어넣기
				fw.close();
				//데이터를 콘솔창화면에 출력하듯 더 쉽게 파일의 저장형태 제어
				//보조 Writer class//기존 FileWriter보조
				PrintWriter writer=new PrintWriter(fw);
				writer.println(str);
				writer.flush();
				writer.close();//보조스트림을 닫으면 FileWriter도 같이 close()
			} catch (IOException e) {
				//문서가 없으면 자동으로 만들기 때문에 FilNotFound Exception은 발생X
				System.out.println("		파일쓰기 작업중 ERROR발생");
			}			
		}//while
		
		System.out.println("		======================");
		System.out.println("		저장된 파일의 데이터를 화면에 출력");
		System.out.println("		======================");
		
		//파일에 한줄씩 저장되어 있는 문자열을 ArrayList에 추가기키기
		ArrayList<String> datas=new ArrayList<String>();
		
		//읽어올  File객체 생성
		File file=new File("files/bts.txt");//해임달
		//파일과 연결되는 무지개로드(Stream) 생성
		try {
			FileReader fr=new FileReader(file);
			//┌한 글자씩 받아오려면 반복문 사용-줄마다 반복문의 횟수가 달라 복잡해짐..
			//fr.read();//한글자씩 읽어옴: 영어-1byte
			//한글-2~3byte(언어마다 읽어들이는 바이트가 다르게 결정됨)
			
			//[Buffer:보관 상자≒레지스터]
			//키보드 버퍼:예)검색창,메신저-키보드에서 엔터누르기 전까지 담아놓는 곳
			//입력을 편하게 한줄씩 입력받기 위한 보조스트림(BufferdReader)class
			//BufferedReader : FileReader가 한글자씩 준 데이터를 모아놓고 사용
			BufferedReader reader=new BufferedReader(fr);
			//BufferedReader에게 저장된 데이터를 한줄씩 읽어달라 요청
			String line=reader.readLine();//한줄읽기, 줄바꿈 문자는 포함 X
			
			while(line!=null)	{
				datas.add(line);//ArrayList에추가
				line=reader.readLine();//다음줄로 
			}
			//ArrayList에있는 문자열 차례로 출력
			for(int i=0;i<datas.size();i++) 
				System.out.println("		"+datas.get(i));
			reader.close();//작업이 끝나면Stream 닫기
		} catch (FileNotFoundException e) {
			System.out.println("		No File");
		} catch (IOException e) {
			System.out.println("		Reading ERROR");
		}
		

	}//main

}//SIO







