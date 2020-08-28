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
		// ���ڿ� �����͸� �Ѵܾ �Է¹޾� ������ ���Ͽ� �����ϰ� �о���� ���α׷�
		//����ڷκ��� ���ڿ� ������ �Է¹ޱ�
		Scanner scan=new Scanner(System.in);
		//����ڰ� NO��� ���ڸ� �Է��Ҷ����� ��� �Է�
		while(true) {
			System.out.print("		Input Word(NO->end) : ");
			String str=scan.nextLine();			
			if(str.equalsIgnoreCase("NO"))break;
			//���ڿ� ��:[==]���Ұ�	����ҹ��� ���о��� ��		
			
			//������ ���α׷����� �ڵ����� ��������� �ʱ⿡ ���������� ���� �����
			//������ ���Ͽ� �����ϱ� ���� File(���Ӵ�)��ü ����
			//��ǥ��ġ: "����������Ʈ����/files/bts.txt"
			//���� ������ġ�� ������ File��ü����
			File path= new File("files");//files��� ������ ����
			if(!path.exists()/*exists:���翩��*/) path.mkdirs();
			//�������� ������ ����//���+���ϸ�.Ȯ���� �� ���� File��ü����
			File file=new File(path,"bts.txt");//"files/bts.txt"
			
			//���ϰ� ������ �������ε�(Stream)��ü ����
			//��, byte stream(Output Stream)�� �ƴ� ���ڽ�Ʈ��(Writer)���
			//Writer�߿���-File������ ������� FileWriter���
			try {
				FileWriter fw=new FileWriter(file,true);//append���
				fw.write(str+"\n");//�ٹٲ�
				fw.flush();//Stream�� ���������� �𸣴� data�о�ֱ�
				fw.close();
				//�����͸� �ܼ�âȭ�鿡 ����ϵ� �� ���� ������ �������� ����
				//���� Writer class//���� FileWriter����
				PrintWriter writer=new PrintWriter(fw);
				writer.println(str);
				writer.flush();
				writer.close();//������Ʈ���� ������ FileWriter�� ���� close()
			} catch (IOException e) {
				//������ ������ �ڵ����� ����� ������ FilNotFound Exception�� �߻�X
				System.out.println("		���Ͼ��� �۾��� ERROR�߻�");
			}			
		}//while
		
		System.out.println("		======================");
		System.out.println("		����� ������ �����͸� ȭ�鿡 ���");
		System.out.println("		======================");
		
		//���Ͽ� ���پ� ����Ǿ� �ִ� ���ڿ��� ArrayList�� �߰���Ű��
		ArrayList<String> datas=new ArrayList<String>();
		
		//�о��  File��ü ����
		File file=new File("files/bts.txt");//���Ӵ�
		//���ϰ� ����Ǵ� �������ε�(Stream) ����
		try {
			FileReader fr=new FileReader(file);
			//���� ���ھ� �޾ƿ����� �ݺ��� ���-�ٸ��� �ݺ����� Ƚ���� �޶� ��������..
			//fr.read();//�ѱ��ھ� �о��: ����-1byte
			//�ѱ�-2~3byte(���� �о���̴� ����Ʈ�� �ٸ��� ������)
			
			//[Buffer:���� ���ڡַ�������]
			//Ű���� ����:��)�˻�â,�޽���-Ű���忡�� ���ʹ����� ������ ��Ƴ��� ��
			//�Է��� ���ϰ� ���پ� �Է¹ޱ� ���� ������Ʈ��(BufferdReader)class
			//BufferedReader : FileReader�� �ѱ��ھ� �� �����͸� ��Ƴ��� ���
			BufferedReader reader=new BufferedReader(fr);
			//BufferedReader���� ����� �����͸� ���پ� �о�޶� ��û
			String line=reader.readLine();//�����б�, �ٹٲ� ���ڴ� ���� X
			
			while(line!=null)	{
				datas.add(line);//ArrayList���߰�
				line=reader.readLine();//�����ٷ� 
			}
			//ArrayList���ִ� ���ڿ� ���ʷ� ���
			for(int i=0;i<datas.size();i++) 
				System.out.println("		"+datas.get(i));
			reader.close();//�۾��� ������Stream �ݱ�
		} catch (FileNotFoundException e) {
			System.out.println("		No File");
		} catch (IOException e) {
			System.out.println("		Reading ERROR");
		}
		

	}//main

}//SIO






