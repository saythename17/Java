import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Collection Framework
		//Collection class: �ڷᱸ���� ������ Java API class - �뷮�� ������ ����
		//�÷����� ���� ����п����� ũ�� 3������ ����
		//Collection interface(��ü ������ �Ұ�) 3���� : List / Set / Map 
		//1) List : �ڷ���� ����� ������� ���� (����ü��ó�� ����)
		//			�ڵ� �ο��� index��ȣ�� �־� �̸����� ��� ����
		//			�ߺ������� ���尡��
		//			List�������̽��� ������ ����Ŭ����:
		//			��ArrayList, LinkedList, Vector
		//2) Set : �ڷ���� ����� ���� ������� ���� (�ܹ��� ��Ʈ�޴�ó�� �ϳ��� ������)
		//		   index��ȣ�� ����,�ߺ������� ����Ұ�
		//		  	��HashSet, TreeSet, LinkedHashSet
		//3) Map : �ڷ���� ����� ���� ������� ���� (����ü��ó�� ����)
		//		   index��ȣ ��� ���ڿ�(�ڷ���)�� �� key���� ���� ��Ҹ� ����
		//		   (����ȣ��� �̸����� ����),�ߺ��� value�� ����.�ߺ��� key���� �Ұ�		
		// <key-value> pair
		//			��HashMap, TreeMap,LinkedHashMap, HashTable
		
		//List
		//List l=new List();//interface cannot instantiate
		//List interface�� ������ ���� class�� ��ü�� ����� ���
		//collection�� �迭�� ���� ���� �ڷ��������� ���尡��
		// ���ڷ���: Generic�� �̿��� ���� ---�������� ������ �⺻�ڷ��� Object
		
		
		ArrayList<String> arrList=new ArrayList<String>();
		ArrayList<String> arr=new ArrayList<>();//new�� �ڷ������� ��������
		//List�迭 Class�� �⺻������ �����ϰ� �ִ� Method
		//�� add(), size(), remove(),get() ...
		//1. ���(Element)�� ���� 
		int size=arrList.size();
		System.out.println("��Ұ���: "+size);
		//2. ��� �߰�
		String s=new String("element1");
		arrList.add(s);
		arrList.add(new String("element2"));
		arrList.add("element3");
		System.out.println("��Ұ���: "+arrList.size());
		//arrList�� ����� �� : �� String��ü�� ����Ű�� ��������(4byte)
		//3. ��� ���
		String str=arrList.get(0);
		System.out.println(str);
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		//4. ��� ����
		arrList.remove(1);
		System.out.println("��Ұ���: "+arrList.size());
		System.out.println(arrList.get(1));
		System.out.println();
		
		
		
		
		
		//5. Ư�� ��ġ�� ����߰�
		arrList.add(1,"new element");
		System.out.println(arrList.get(1));
		//6. �ε�����ȣ�� �ƴ� ���������ε� ���� ����
		String s2=new String("Test");
		arrList.add(s2);
		System.out.println("��Ұ���: "+arrList.size());
		arrList.remove(s2);//==.remove(3);
		System.out.println("��Ұ���: "+arrList.size());
		//7. ��� ��� �����
		arrList.clear();
		System.out.println("��Ұ���: "+arrList.size());
		//8. �ߺ� ������ ���� ����
		arrList.add("a");
		arrList.add("a");
		arrList.add("a");
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		//9. ��� ��
		//isEmpty() - ��Ұ� ����ִ��� ���� true or false
		System.out.println(arrList.isEmpty());
		//contains() :�����ϴ�, Ư����� ���� ����
		System.out.println(arrList.contains("a"));
		arrList.clear();
		System.out.println(arrList.contains("a"));
		
		
		
		
		
		for(int i=0;i<10;i++)System.out.println();
		
		
		
		
		//10. �ѹ��� �ٸ� �÷��ǰ�ü�� ��Ҹ� �߰��ϱ�
		arrList.add("a");		arrList.add("b");
		arrList.add("c");
		ArrayList<String> arrList2=new ArrayList<>();
		arrList2.add("d");		arrList2.add("e");
		arrList.addAll(arrList2);
		System.out.println("10"+arrList.toString());//��Ұ����� ���ڿ��� ��� [,,]
		//11. Ư����ġ�� ������ �߰� ����
		arrList.addAll(0,arrList2);//addAll(index,class);
		System.out.println("11"+arrList.toString());
		//12. Ư����� �ѹ��� ����
		ArrayList<String> arrList3=new ArrayList<String>();//���� ���
		arrList3.add("b");
		arrList3.add("d");
		arrList.removeAll(arrList3);
		System.out.println("12"+arrList);// .toString��������
		//13. Ư����� ���� ��� ����
		arrList.retainAll(arrList2);//retain:��������
		System.out.println("13"+arrList);
		//14. �������� Ư����Ұ� ��� ���Ե��ִ��� �ѹ��� ��
		arrList.clear(); 		arrList2.clear();
		arrList.add("a");		arrList.add("b");
		arrList.add("c");		arrList.add("d");
		arrList.add("a");		arrList.add("b");
		//���Ե��ִ��� Ȯ���ϰ� ���� ��� arrList2�� �ۼ�
		arrList2.add("a");
		arrList2.add("b");
		System.out.println("14"+arrList.containsAll(arrList2));
		//15. Ư����Ұ� �ִ� index��ȣ(int) return - List�迭���� �ִ� ���
		System.out.println(arrList.indexOf("b"));//�տ������� b�� ã��
		System.out.println(arrList.lastIndexOf("b"));//�ڿ������� b�� ã��
		System.out.println(arrList.indexOf("w"));//��ã����(������) -1 return
		
		
		
		
		
		
		for(int i=0;i<10;i++)System.out.println();
		
		
		
		
		//��ҵ��� ���� ���������� ������
		//way 1: for�� ���
		for(int i=0;i<arrList.size();i++) {
			String t=arrList.get(i);
			System.out.print(t+",");
		}System.out.println();
		//way 2: Ȯ�� for��[for each��] ���
		for(String t:arrList) {
			System.out.print(t+",");
		}System.out.println();
		//way 3: iterator()��� -->Set���� �Ұ�
		//way 4: List��ü�� �迭��ü�� �����ؼ� ���
		String[] array=new String[arrList.size()];
		arrList.toArray(array);//copy element
		System.out.println(Arrays.toString(array));
		//��Arrays class's static method
		
		//p.s ��������� class(���α׷��Ӱ� ����class)�� ArrayList�� ���尡��	
		ArrayList<P> p=new ArrayList<P>();
		P p1=new P();
		p1.name="��";		p1.age=1;
		p.add(p1);
		System.out.println("��Ұ��� : "+p.size());
		P p2=p.get(0);
		p.get(0).show();//==p2.show();
		p.add(new P());
		System.out.println("��Ұ��� : "+p.size());
		
		
		
		
		
		
		for(int i=0;i<10;i++)System.out.println();
		
		
		
		
		
		
		
		//�⺻�� �ڷ��� ����-Wrapper class
		ArrayList<Integer> arrList5=new ArrayList<Integer>();
		//��int�� �ڵ����� ��ü������ �����ִ� WrapperŬ���� �̿�
		arrList5.add(new Integer(10));
		arrList5.add(20);//auto boxing-- �ڵ� new Integer()
		int n= arrList5.get(1);//Integer(20)�� �ڵ����� 20���� ��ȯauto unboxing
		System.out.println(n);		
		
		// +)
		//List�迭 �ٸ� Ŭ������ 
		LinkedList<String> ll=new LinkedList<String>();
		//LikedList �����== ArrayList, ���ɸ� �ٸ�
		//����� �߰� �������־ ����--��Ұ� ������ LinkedList�� ����ϴ°� ȿ����
		//���������� ��ȯ������ ���̰���
		//ArrayList���� ����� ����, ������ ����
		//ArrayList���� Ư��index�� ���� �о���°��� ����
		ll.add("A");		ll.add("B");
		System.out.println(ll.size());
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());		
		
		//Vector(ArrayList�� 99%��ġ)- ��, ����ȭ(in Thread)ó�� �Ǿ�����
		Vector<String> v=new Vector<String>();		
		//List Interface�迭�� ArrayList,LinkedList,Vector�� 
		//��� ������� ���� �޼ҵ嵵 ��κ� �����ϴ�
		//List(��������-parent)�� ����Ŭ����(sub) ��ü���� ��� ������ �� ����
		List<String> list=null;
		list= new ArrayList<String>();
		list= new LinkedList<String>();
		list= new Vector<String>();
		
		//�迭�� list�� �����ϱ�
		String[] arr2=new String[] {"A","B","C"};
		List<String> list1=Arrays.asList(arr2);
		System.out.println(list1.toString());
	}
}
//p.s
class P{
	String name;
	int age;
	void show() {
		System.out.println("name: "+name);
		System.out.println("age : "+age);
		System.out.println("=============");
	}
}

    
















