import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File�� copy���ִ� ���α׷� 
		//���������� ��ο� ���ϸ�.Ȯ���� �ʿ�
		String srcPath="D:/files/aaa.txt";
		
		try {//���������� �о���� ���� �������ε� ����- ���Ӵ޾��� �غ���
			FileInputStream fis=new FileInputStream(srcPath);
			
			//�о�� �����͸� ������ ������ ��ο� ���ϸ�����
			File path=new File("D:/copy");//�������
			if(!path.isDirectory())	path.mkdirs();//������ ������
			File file=new File(path, "bbb.txt");//���+���ϸ� ������ ��ü ����
			//������ ���� ���ϰ� ����� OutputStream ����
			FileOutputStream fos=new FileOutputStream(file);
			FileInputStream fis2=new FileInputStream(file);
			//�������� 1byte�� �о���鼭 �ٷ� ī���� ���Ͽ� 1byte�� ����
			while(true) {
				byte b=(byte)fis.read();				
				if(b==-1)break;
				System.out.print((char)b);
				fos.write(b);//������ �о�� data 1byte�� �ٷξ���
			}
			fos.flush();// Stream�� �������� �� �ִ� ������ �о��
			fis.close(); 		fos.close();
			System.out.println("���� �Ϸ�");
		} catch (FileNotFoundException e) {
			System.out.println("���� ����");
		} catch (IOException e) {
			System.out.println("������ �����߻�");
		}

	}

}



