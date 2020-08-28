import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Collection Ŭ������ : �ڷᱸ���� ������ Java API Ŭ������ [ Collection Framework ] - �뷮�� �����͸� ����
		
		// �迭�� ������.
		// �迭�� ���ο� �����͸� �����ϰ� ���� �� �����ϴ� ��ġ�� �ִ� ���� ���� ������ �Űܾ� �ϰ� �����濡 �ִ� ���� �� �� ���������� �Űܾ� ��.
		// �����Ҷ��� ������ ����� �ڸ��� �� �ڿ�ҵ��� ���ʷ� ��� �Űܾ� ��.
		// �迭�� ������ ��� ä���ٸ� ���ο� �������� ������ �ȵ�. ���̸� �ٲ� �� ���...
		
		// �̷� �������� �߰�/����/����/���� ���� ���ϰ� ���ֱ� ���� ������� Ŭ�������� Collection��. 
		// ��, Collection�� �������̽���
		
		// �÷����� ���� ����п� ���� ũ�� 3���� ������ ���е�
		
		//- Collection�������̽��� 3���� ū ���� : List, Set, Map [��� �������̽� ��]
		// 1)List : �ڷ���� ����� ������� ������ �ڵ� �ο��� �ε�����ȣ�� ������. �ߺ��� ���� ���� �� ����.
		// 2)Set : �ڷ���� ��ȣ�� �������� ���� �����ϸ� �ε��� ��ȣ ����. �ߺ��� ���� ���� �� ����.
		// 3)Map : �ε�����ȣ X, �ڷḦ �����ϱ� ���� ���ڿ��� �� Key���� ������. key�� �ߺ� X, Value�� �ߺ��� ���� ���� �� ����.
		
		// �� 3���� ��� ������ �������� ������ ������ �������̽� �̹Ƿ� ���� ����ϴ� ���� �ƴ϶�..
		// �� �������̽��� �����Ͽ� ����� ���� Ŭ�������� ����ϴ� ����.
		// 1) List : ArrayList, LinkedList, Vector(��Ƽ������ ����ȭó�� �Ǿ� ����)...
		// 2) Set : HashSet, TreeSet, LinkedHashSet
		// 3) Map : HashMap, TreeMap, LinkedHashMap, HashTable(��Ƽ������ ����ȭ)
		
		
		//List�� �������̽���. ���� ��ü ���� �Ұ�!
		//List arr= new List();//error: interface�� �ٷ� ��ü���� �Ұ�!!
		
		//List�������̽��� ������ ���� Ŭ������ ��ü�� ����� ����ؾ� ��.
		//List�迭 : ArrayList, LinkedList, Vector..��
		
		//����, ���� �� �˷����� ���Ǿ��� ArrayList����!
		//����Ʈ��ü�� ������ �������� ������ Generic( Ŭ������< > )������ ����Ͽ� ������ ���� ����!
		//����� ����� �߰�,������ �� �ӵ��� ����. ��ſ� Ư�� ��° ��ҿ� �����ϴ� ���� ����.
		ArrayList<String> arrList= new ArrayList<String>();
		
		//List�� ������ �ִ� �ֿ� ���(�޼ҵ�)�� �˾ƺ���
		//List�� Collection�������̽��� ��ӹ��� ��ŭ Collection�������̽��� (�߻�)�޼ҵ带 ������ �ִٰ� Ȯ���� �� ����.
		//ex) add(), remove(), clear(), size(), contains() .... etc...
		
		//1. ����� ����
		System.out.println("��� ���� : "+ arrList.size() );
		
		//2. ����� �߰�
		String s= new String("aa");
		arrList.add(s);
		arrList.add( new String("bb") );
		arrList.add("cc");//�ڵ�  new String()
		System.out.println("��� ���� : "+ arrList.size());
		
		//3. ��� ������
		String str= arrList.get(0);
		System.out.println(str);
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		
		//4. ��� �����ϱ�
		arrList.remove(1);
		System.out.println("��� ���� : "+ arrList.size());
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		//System.out.println(arrList.get(2));//error[Exception]
		
		
		
		//9. ����� �� ���� ��ɵ�..
		//arrList.clear();		
		System.out.println(arrList.isEmpty());//��� �ִ��� ����[true, false]
		System.out.println(arrList.contains("aa"));//�� �����Ͱ� �ִ��� ����[true, false]
		System.out.println(arrList.contains("bb"));
		
		//10. �ѹ��� ������Ҹ� �߰��ϱ�..
		arrList.clear();
		arrList.add("aa");
		arrList.add("bb");
		arrList.add("cc");
		
		ArrayList<String> arrList2= new ArrayList<String>();
		arrList2.add("kk");
		arrList2.add("ss");
		
		arrList.addAll(arrList2);
		System.out.println( arrList.toString() );//�ڵ� ��ҵ��� [,,,,]�ؼ� ���ڿ��� �������(���Ǳ��)
		
		//10.1 Ư����ġ�� ������ �ѹ濡 �߰��ϱ�
		arrList.addAll(1, arrList2);
		System.out.println( arrList.toString() );
		
		//11. Ư����ҵ��� �ѹ濡 �����ϱ�
		ArrayList<String> arrList3= new ArrayList<String>();
		arrList3.add("aa");
		arrList3.add("ss");
		arrList.removeAll(arrList3);
		System.out.println(arrList);
		
		//12. Ư�� ��Ҹ� ����� ����..
		arrList3.clear();
		arrList3.add("kk");
		arrList.retainAll(arrList3);
		System.out.println(arrList);
		
		//13. Ư�� ��ҵ��� ��� ���ԵǾ� �ִ��� �ѹ濡 ��
		arrList.clear();
		arrList2.clear();
		
		arrList.add("aa");
		arrList.add("bb");
		arrList.add("cc");
		arrList.add("dd");
		arrList.add("ee");
		arrList.add("ff");
		arrList.add("cc");
		arrList.add("aa");
		arrList.add("gg");
		
		arrList2.add("aa");
		arrList2.add("bb");
		arrList2.add("kk");
				
		System.out.println( arrList.containsAll(arrList2) );
		
		//14. List�迭���� �ִ� ���!
		//Ư����Ұ� ����濡 �ִ��� -- ���ϰ��� int��(index��ȣ ��ȯ)
		System.out.println( arrList.indexOf("cc") );
		System.out.println( arrList.lastIndexOf("cc") );
		
		
		//��ҵ��� ���������� ������...
		//���1. for�� ����ϱ�
		for(int i=0; i<arrList.size(); i++) {
			System.out.println( arrList.get(i) );
		}
		System.out.println();
		
		//���2. foreach�� ����ϱ�
		for( String t : arrList ) {
			System.out.println(t);
		}
		System.out.println();
		
		//���3. iterator()..�� �̿��ϴ� ���!! -->Set������ ����غ���
		
		//���4(?)
		// List�� �迭�� �����ؼ� ���!
		//��, List��ü�� --> �迭��ü�� ��ȯ!!
		String[] arr= new String[arrList.size()];
		arrList.toArray(arr);
		System.out.println( Arrays.toString(arr) );
		
		
		//List�������̽� ���� Ŭ������ LinkedList�� ����.
		//������� ArrayList�� ���� ����. - ��, �������̸� ����.
		//����� ����� �߰�,���Žÿ� �ӵ��� ����. ��, Ư����ҿ� �����ϴ� ���� 
		LinkedList<String> linkList= new LinkedList<String>();
		
		linkList.add(new String("aaa"));
		linkList.add("bbb");
		linkList.add("ccc");
		
		linkList.remove(1);
		
		//��ũ�帮��Ʈ���� �ִ� ���
		linkList.addFirst("kkk");
		linkList.addLast("ssss");
		
		System.out.println(linkList.toString());
		
		
		//VectorŬ���� ����� ArrayList�� 100%����.[����ȭ ó���Ǿ� �ִٴ� ���̸� ����]
		Vector<String> v= new Vector<String>();
		
		
		
		//#����#####
		//�迭�� ����Ʈ�� �����ϱ�!!
		String[] arr2= new String[] {"aaa", "bbb", "ccc"};
		List<String> list= Arrays.asList(arr2);
		System.out.println( list.toString() );
		
		//List<> �θ����������� ��� �ڽİ�ü��(ArrayList, LinkedList, Vector) �����Ͽ� ������ �� ����.
		List<String> li= null;
		li= new ArrayList<String>();
		li= new LinkedList<String>();
		li= new Vector<String>();
		
		
		//�⺻�� �����͵��� �����ϰ� ���� ��!!!!
		//ArrayList<int> arrList5= new ArrayList<int>();//error : �⺻���� ���� �ٴ� �� ����.
		
		//Collection�� ���׸��� �����. ��, ���׸��� �������� ������.
		//�׷��Ƿ� int, double���� �⺻���� ����� �� ����.
		//int�� ����Ͽ� Integer ��� WrapperŬ������ �̿�
		ArrayList<Integer> arrList5= new ArrayList<Integer>();
		arrList5.add( new Integer(10) );
		arrList5.add( 20 ); //���� �ڽ�(Auto Boxing)
		arrList5.add( 30 );
		arrList5.add( 40 );
		
		int n= arrList5.get(0); //���� ��ڽ�(Auto UnBoxing)
		System.out.println(n);
		
		
		
		arrList.clear();
		//## ��һ����� ���� ����
		arrList.add(new String("aaa"));
		arrList.remove(new String("aaa"));//��� ������ ��Ȯ�� ���� : ��ü�� hashCode()�� ���ϰ��� ���� equals()�� ���ϰ��� true�� remove�� ��
		System.out.println("��� ���� : "+ arrList.size());
		
		
		//��������� Ŭ���� ��ü ���
		Person p1= new Person(10);
		Person p2= new Person(10);
		
		ArrayList<Person> persons= new ArrayList<Person>();
		persons.add(p1);
		persons.remove(p2);
		System.out.println("Persons ��Ұ��� : "+ persons.size());
		
		
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println( p1.equals(p2) );
		
		System.out.println(new String("aa").hashCode());
		System.out.println(new String("aa").hashCode());
		
		System.out.println( new String("aa").equals("aa"));
		
		

	}//main method..

}//Main class..

class Person{
	int age;
	
	//������
	public Person(int age) {
		this.age= age;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		Person p= (Person)obj;
		
		return age== p.age;
	}
}





