import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class CollectionsClass {

	public static void main(String[] args) {
		// Collections class의 static method소개
		//1) sort()
		//2) shuffle()
		ArrayList<String>datas=new ArrayList<String>();
		
		datas.add("Spring");datas.add("flower");
		datas.add("Fall");datas.add("Winter");
		datas.add("April");datas.add("Cocoa");
		System.out.println(datas);
		//리스트의 요소들 정렬
		Collections.sort(datas);
		System.out.println(datas);
		//프로그램을 실행할 때 마다 요소들의 위치를 랜덤하게 섞는 기능
		Collections.shuffle(datas);
		System.out.println(datas);
		
		//자료구조에서 가장 유명한 2가지 저장 구조
		//Stack과 Queue의 구조와 용어
		//1. Stack - FILO(First Input Last Output)
		//[먼저 저장된 것이 가장 나중에 나온다.]--드럼통에 쌓이듯, 인터넷 팝업창
		//push : 요소 추가, pop : 요소 꺼내기
		//2. Queue - FIFO(First Input First Output)
		//[먼저 저장된 것이 가장 먼저 나온다.]--메서지 큐, 키보드 큐
		//offer : 요소추가, poll : 요소 꺼내기
		Stack<String> stack=new Stack<String>();
		stack.push("byebyemyblue");
		String s=stack.pop();//실제 요소가 빠져나옴. 요소 개수가 줄어듦 !=get()
		Queue<String> queue=null;//큐는 인터페이스 이기 때문에 구현해서 사용
		queue.offer("hihihi");
		String s2=queue.poll();//실제 요소가 빠져나옴. 요소 개수가 줄어듦 !=get()
		
	}

}
