import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput_ {

	public static void main(String[] args) {
		// TODO ����ڷκ��� ���ڿ��� �Է¹޾� ������ ���Ͽ� ����
		Scanner scan=new Scanner(System.in);
		System.out.print("		������ Data �Է� : ");
		String data=scan.next();
		
		//������ file���� �������ε�(Stream)�� ������ִ� ���Ӵ� ��ü(File) ����
		//�ļ��ڷ� �������ε带 ������ ��ġ�� ������ �־�� ��
		//���� ���� ��ġ ���� �� ���ϸ�.Ȯ���� ����
		//��ũ�� ��ġ��θ� �������� ������ ���� �۾����� �ڹٹ����� �ִ� ������Ʈ ������ ����
		File file=new File("svt.txt");
		
		//##############���� ������ġ(����) ����#################
		//������Ʈ���� ��, Ư�� ������ ���� �����ϱ�
		file =new File("sevneteen/svt.txt");//seventeen������ ��������
		file =new File("sevneteen\\svt.txt");//ū����ǥ�� �������ô� Ư������
		//��� ���� ���� [/]-windows :\,/ ��� ��밡��
		//Linux, MacPC������ /�� ��� ����
		//������ ������ �ڵ����� ����������� ������ ��������� ����
		//���α׷����� seventeen��������
		File path=new File("seventeen");
		if(!path.isDirectory()) {//path���������� ����Ű�� ������ ���°�?
			//������ ������ ���� (make directory)
			path.mkdirs();//���� ��������  �Ѳ����� ���� �� ����			
		}
		//������ ���� ��ο� ���ϸ�.Ȯ���ڱ��� ������  File��ü ���λ���
		file=new File(path,"svt.txt");//path��ο� ���ϸ� ����
		
		//�� ������Ʈ�� �ƴ� Ư����ġ�� ����
		file=new File("D:/aaa.txt");
		
		//Ư������ ����->��θ� �ִ� File��ü ����
		path=new File("D:files/kkk");
		if(!path.isDirectory()) path.mkdirs();		
		//�� ��ο� ���ϸ��� ������ File��ü ������ ����
		file=new File(path,"svt.txt");
		//################################################
		
		//���ϰ�ü�� ���� ������ġ�� �����͸� ������ ���� �������ε�(Stream)����
		//�����͸� �������� ���̹Ƿ� Stream��, OutputStream���
		//OutputStream��, File�� �����͸� �����ϴ� �뵵�� FileOutputStream���
		//���� Output�Ϸ��� ������ ���ٸ�, OutputStream�� �ڵ����� �� ������ ����
		//���� Output�Ϸ��� ������ ������, �� ������ ���� �ȿ� ������ ����
		//�⺻������ FileOutputStream�� ���� �����͸� ����� ��
		//����� ������ �ִ� �����͸� ������ ���ο� �����ͷ� ����
		try {
			//FileOutputStream fos=new FileOutputStream(file);
			//���� ������ʰ� �̾���̰� �ʹٸ�
			FileOutputStream fos=new FileOutputStream(file,true);
			//���ι�° �Ķ���� : append[�����̴�]����:true,false
			//��Ʈ���� ���� �����͸� ���Ͽ� �ۼ�(������)
			//FileOutputStream�� �ѹ��� 1byte���� �����͸� ���� �� ����
			//fos.write(65);//�빮�� 'A'�ۼ�==fos.write('A');
			//1byte�� �����͸� ������ ����� ���ڿ��������� ��� ����
			//���ڿ�(String) ��ü�� ������ ����  byte[]�� ��ȯ�ϴ� ��� method ���
			byte[] bytes=data.getBytes();//String->byte[]
			fos.write(bytes);//byte[] �迭�� ������
			fos.flush();//[ write-flush ]���� ��� �����ϰ� output
			//flush:��������--Stream�� �ִ� data�� �о�ֱ��enter
			
			//������ ������ ������ ������ ��Ʈ���� ���̻� �ʿ����� �����Ƿ�
			//��Ʈ���� ���� ������ �޸��� �����߻�(memory leak:���)
			fos.close();
			
			//������� �Դٸ� ������ �� �Ǿ��ٴ� �� 
			System.out.println("		���� ���� ����");
		} catch (FileNotFoundException e) {
			System.out.println("		������ �������� ����");
		} catch (IOException e) {
			System.out.println("		���� �۾� �� ���� �߻�");
		}

	}

}