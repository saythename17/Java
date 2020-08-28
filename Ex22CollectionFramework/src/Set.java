import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Set {

	public static void main(String[] args) {
		// TODO Set Interface :순서X, index X,중복data X
		//Set<String> set=new Set<String>();ERROR인터페이스 - 객체생성 불가
		//Set인터페이스를 구현한 하위 클래스 사용
		//1.HashSet : 저장순서 파악X, hash알고리즘으로 순서 결정, Set계열중 가장좋은 성능
		//2.TreeSet : 저장되는 데이터 값에 따라 순서 결정, red-black알고리즘 사용
		//3.LikedHashSet : 저장된 순서대로 정렬. 성능이 가장 안좋음
		//HashSet<String> set=new HashSet<String>();
		//TreeSet<String> set=new TreeSet<String>();		
		LinkedHashSet<String> set=new LinkedHashSet<>();
		//요소추가
		set.add(new String("A"));
		set.add("B");	set.add("C");	set.add("B");//중복데이터 삽입X
		set.add("F");	set.add("D");	set.add("E");
		//요소 개수
		System.out.println("요소개수 : "+set.size());
		//요소 사용---get()method X, index X
		//순차적으로  가져오기
		//BUT for문사용불가- index X
		//way 1)확장된 for문(for each문)
		for( String t : set ) {
			System.out.println( t );
		}System.out.println();
		// way 2)반복자( iterator)
		Iterator<String> datas=set.iterator();
		while(datas.hasNext()) {
			System.out.println(datas.next());
		}System.out.println();
		
		
		
		
		
		
		//way 3)배열로 변환해서 출력
		String[] arr=new String[set.size()];
		set.toArray(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//사용자정의 클래스는 중복검사가 기본으로 되지않음
		//hashCode()와 equals()메소드를 오버라이드해야함
		HashSet<AAA> set3=new HashSet<AAA>();
		set3.add(new AAA(10));
		set3.add(new AAA(20));
		set3.add(new AAA(10));//중복으로 보지않음--Override
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
