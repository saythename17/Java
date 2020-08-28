import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Set {

	public static void main(String[] args) {
		// TODO Set Interface :����X, index X,�ߺ�data X
		//Set<String> set=new Set<String>();ERROR�������̽� - ��ü���� �Ұ�
		//Set�������̽��� ������ ���� Ŭ���� ���
		//1.HashSet : ������� �ľ�X, hash�˰������� ���� ����, Set�迭�� �������� ����
		//2.TreeSet : ����Ǵ� ������ ���� ���� ���� ����, red-black�˰��� ���
		//3.LikedHashSet : ����� ������� ����. ������ ���� ������
		//HashSet<String> set=new HashSet<String>();
		//TreeSet<String> set=new TreeSet<String>();		
		LinkedHashSet<String> set=new LinkedHashSet<>();
		//����߰�
		set.add(new String("A"));
		set.add("B");	set.add("C");	set.add("B");//�ߺ������� ����X
		set.add("F");	set.add("D");	set.add("E");
		//��� ����
		System.out.println("��Ұ��� : "+set.size());
		//��� ���---get()method X, index X
		//����������  ��������
		//BUT for�����Ұ�- index X
		//way 1)Ȯ��� for��(for each��)
		for( String t : set ) {
			System.out.println( t );
		}System.out.println();
		// way 2)�ݺ���( iterator)
		Iterator<String> datas=set.iterator();
		while(datas.hasNext()) {
			System.out.println(datas.next());
		}System.out.println();
		
		
		
		
		
		
		//way 3)�迭�� ��ȯ�ؼ� ���
		String[] arr=new String[set.size()];
		set.toArray(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//��������� Ŭ������ �ߺ��˻簡 �⺻���� ��������
		//hashCode()�� equals()�޼ҵ带 �������̵��ؾ���
		HashSet<AAA> set3=new HashSet<AAA>();
		set3.add(new AAA(10));
		set3.add(new AAA(20));
		set3.add(new AAA(10));//�ߺ����� ��������--Override
		System.out.println(set3.size());
	}

}
class AAA{
	int a;
	public AAA(int a) {
		this.a=a;
	}
	@Override
	public int hashCode() {
		return this.a;
	}
	@Override
	public boolean equals(Object obj) {
		return ((AAA)obj).a==this.a;
	}
}
