import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput_ {

	public static void main(String[] args) {
		// �о�� ������ ���ϸ��� ���� ���Ӵް�ü ����
		File file=new File("aaa.txt");
		
		//���� �� ������ �������ε�(Stream)���� -�����͸� �о���� InputStrem
		//�� �߿�����, File������ ������� [FileInputStream]����
		try {//������ �������� ������ ���ܹ߻�!- �ڵ����� ����X
			FileInputStream fis=new FileInputStream(file);
			//stream�� ���� �о����
//			byte b=(byte)fis.read();//1byte�� �о��
//			while(b!=-1/*read()�� ���ڰ� ���̻� ������ -1����*/) {
//				System.out.print((char)b);
//				b=(byte)fis.read();
//			}
			//byte[]�迭�� �ѹ��� �о����
			//�о�� �����͸� ������ ����ִ� byte[]�迭�غ�
			byte[] bytes=new byte[1024];//1024=1KB :�����ִ� ũ���
			fis.read(bytes);
			//�о��byte[]�迭��String���� ��ȯ�Ͽ� ���
			String s=new String(bytes);
			//�������ڿ� ���޵� byte[]�迭�� ���ڿ��� ��ȯ
			System.out.println(s);
			System.out.println("���� �ε� �Ϸ�");
			//������ �ƽ������� ������ �������ε� �ݱ�->������ �бⰡ �������� Stream�ݱ�
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� ����");
		} catch (IOException e) {
			System.out.println("�б� �۾� �� ���� �߻�");
		}

	}

}








