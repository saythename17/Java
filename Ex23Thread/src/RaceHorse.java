
public class RaceHorse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse h1=new Horse("õ����");
		Horse h2=new Horse("���丶");
		Horse h3=new Horse("ĳ��");
		System.out.println("\t���ֽ���!!");
		h1.start();
		h2.start();
		h3.start();
		

	}

}
class Horse extends Thread{	
	String name;
	
	public Horse(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	//Thread �� ���� ó�� �޼ҵ�
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("\t"+name+" : �ٱ״�!! �ٱ״�!!");
			//0.4�� ���==400millisecond
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {}
		}//for
		System.out.println("\t"+name+"\t����!!");
	}//run
}//Horse