import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class CollectionsClass {

	public static void main(String[] args) {
		// Collections class�� static method�Ұ�
		//1) sort()
		//2) shuffle()
		ArrayList<String>datas=new ArrayList<String>();
		
		datas.add("Spring");datas.add("flower");
		datas.add("Fall");datas.add("Winter");
		datas.add("April");datas.add("Cocoa");
		System.out.println(datas);
		//����Ʈ�� ��ҵ� ����
		Collections.sort(datas);
		System.out.println(datas);
		//���α׷��� ������ �� ���� ��ҵ��� ��ġ�� �����ϰ� ���� ���
		Collections.shuffle(datas);
		System.out.println(datas);
		
		//�ڷᱸ������ ���� ������ 2���� ���� ����
		//Stack�� Queue�� ������ ���
		//1. Stack - FILO(First Input Last Output)
		//[���� ����� ���� ���� ���߿� ���´�.]--�巳�뿡 ���̵�, ���ͳ� �˾�â
		//push : ��� �߰�, pop : ��� ������
		//2. Queue - FIFO(First Input First Output)
		//[���� ����� ���� ���� ���� ���´�.]--�޼��� ť, Ű���� ť
		//offer : ����߰�, poll : ��� ������
		Stack<String> stack=new Stack<String>();
		stack.push("byebyemyblue");
		String s=stack.pop();//���� ��Ұ� ��������. ��� ������ �پ�� !=get()
		Queue<String> queue=null;//ť�� �������̽� �̱� ������ �����ؼ� ���
		queue.offer("hihihi");
		String s2=queue.poll();//���� ��Ұ� ��������. ��� ������ �پ�� !=get()
		
	}

}
