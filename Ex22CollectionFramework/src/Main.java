import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Collection Framework
		//Collection class: 자료구조를 구현한 Java API class - 대량의 데이터 관리
		//컬렉션은 저장 방법론에따라 크게 3가지로 구분
		//Collection interface(객체 생성은 불가) 3가지 : List / Set / Map 
		//1) List : 자료들이 저장된 순서대로 있음 (기차체인처럼 연결)
		//			자동 부여된 index번호가 있어 이를통해 요소 구별
		//			중복데이터 저장가능
		//			List인터페이스를 구현한 하위클래스:
		//			→ArrayList, LinkedList, Vector
		//2) Set : 자료들이 저장된 순서 상관없이 있음 (햄버거 세트메뉴처럼 하나씩 놓아짐)
		//		   index번호가 없음,중복데이터 저장불가
		//		  	→HashSet, TreeSet, LinkedHashSet
		//3) Map : 자료들이 저장된 순서 상관없이 있음 (기차체인처럼 연결)
		//		   index번호 대신 문자열(자료형)로 된 key값을 통해 요소를 구분
		//		   (└번호대신 이름으로 지정),중복된 value는 가능.중복된 key값은 불가		
		// <key-value> pair
		//			→HashMap, TreeMap,LinkedHashMap, HashTable
		
		//List
		//List l=new List();//interface cannot instantiate
		//List interface를 구현한 하위 class를 객체로 만들어 사용
		//collection도 배열과 같이 같은 자료형끼리만 저장가능
		// └자료형: Generic을 이용해 지정 ---지정하지 않으면 기본자료형 Object
		
		
		ArrayList<String> arrList=new ArrayList<String>();
		ArrayList<String> arr=new ArrayList<>();//new쪽 자료형지정 생략가능
		//List계열 Class가 기본적으로 보유하고 있는 Method
		//└ add(), size(), remove(),get() ...
		//1. 요소(Element)의 개수 
		int size=arrList.size();
		System.out.println("요소개수: "+size);
		//2. 요소 추가
		String s=new String("element1");
		arrList.add(s);
		arrList.add(new String("element2"));
		arrList.add("element3");
		System.out.println("요소개수: "+arrList.size());
		//arrList에 저장된 것 : 각 String객체를 가리키는 참조변수(4byte)
		//3. 요소 사용
		String str=arrList.get(0);
		System.out.println(str);
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		//4. 요소 삭제
		arrList.remove(1);
		System.out.println("요소개수: "+arrList.size());
		System.out.println(arrList.get(1));
		System.out.println();
		
		
		
		
		
		//5. 특정 위치에 요소추가
		arrList.add(1,"new element");
		System.out.println(arrList.get(1));
		//6. 인덱스번호가 아닌 참조변수로도 삭제 가능
		String s2=new String("Test");
		arrList.add(s2);
		System.out.println("요소개수: "+arrList.size());
		arrList.remove(s2);//==.remove(3);
		System.out.println("요소개수: "+arrList.size());
		//7. 요소 모두 지우기
		arrList.clear();
		System.out.println("요소개수: "+arrList.size());
		//8. 중복 데이터 저장 가능
		arrList.add("a");
		arrList.add("a");
		arrList.add("a");
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		//9. 요소 비교
		//isEmpty() - 요소가 비어있는지 여부 true or false
		System.out.println(arrList.isEmpty());
		//contains() :포함하다, 특정요소 포함 여부
		System.out.println(arrList.contains("a"));
		arrList.clear();
		System.out.println(arrList.contains("a"));
		
		
		
		
		
		for(int i=0;i<10;i++)System.out.println();
		
		
		
		
		//10. 한번에 다른 컬렉션객체의 요소를 추가하기
		arrList.add("a");		arrList.add("b");
		arrList.add("c");
		ArrayList<String> arrList2=new ArrayList<>();
		arrList2.add("d");		arrList2.add("e");
		arrList.addAll(arrList2);
		System.out.println("10"+arrList.toString());//요소값들을 문자열로 출력 [,,]
		//11. 특정위치에 여러개 추가 가능
		arrList.addAll(0,arrList2);//addAll(index,class);
		System.out.println("11"+arrList.toString());
		//12. 특정요소 한번에 제거
		ArrayList<String> arrList3=new ArrayList<String>();//지울 목록
		arrList3.add("b");
		arrList3.add("d");
		arrList.removeAll(arrList3);
		System.out.println("12"+arrList);// .toString생략가능
		//13. 특정요소 제외 모두 제거
		arrList.retainAll(arrList2);//retain:남겨지다
		System.out.println("13"+arrList);
		//14. 여러개의 특정요소가 모두 포함되있는지 한번에 비교
		arrList.clear(); 		arrList2.clear();
		arrList.add("a");		arrList.add("b");
		arrList.add("c");		arrList.add("d");
		arrList.add("a");		arrList.add("b");
		//포함되있는지 확인하고 싶은 목록 arrList2에 작성
		arrList2.add("a");
		arrList2.add("b");
		System.out.println("14"+arrList.containsAll(arrList2));
		//15. 특정요소가 있는 index번호(int) return - List계열에만 있는 기능
		System.out.println(arrList.indexOf("b"));//앞에서부터 b를 찾음
		System.out.println(arrList.lastIndexOf("b"));//뒤에서부터 b를 찾음
		System.out.println(arrList.indexOf("w"));//못찾으면(없으면) -1 return
		
		
		
		
		
		
		for(int i=0;i<10;i++)System.out.println();
		
		
		
		
		//요소들의 값을 순차적으로 얻어오기
		//way 1: for문 사용
		for(int i=0;i<arrList.size();i++) {
			String t=arrList.get(i);
			System.out.print(t+",");
		}System.out.println();
		//way 2: 확장 for문[for each문] 사용
		for(String t:arrList) {
			System.out.print(t+",");
		}System.out.println();
		//way 3: iterator()사용 -->Set에서 소개
		//way 4: List객체를 배열객체로 변경해서 출력
		String[] array=new String[arrList.size()];
		arrList.toArray(array);//copy element
		System.out.println(Arrays.toString(array));
		//└Arrays class's static method
		
		//p.s 사용자정의 class(프로그래머가 만든class)도 ArrayList에 저장가능	
		ArrayList<P> p=new ArrayList<P>();
		P p1=new P();
		p1.name="나";		p1.age=1;
		p.add(p1);
		System.out.println("요소개수 : "+p.size());
		P p2=p.get(0);
		p.get(0).show();//==p2.show();
		p.add(new P());
		System.out.println("요소개수 : "+p.size());
		
		
		
		
		
		
		for(int i=0;i<10;i++)System.out.println();
		
		
		
		
		
		
		
		//기본형 자료형 저장-Wrapper class
		ArrayList<Integer> arrList5=new ArrayList<Integer>();
		//└int를 자동으로 객체형으로 감싸주는 Wrapper클래스 이용
		arrList5.add(new Integer(10));
		arrList5.add(20);//auto boxing-- 자동 new Integer()
		int n= arrList5.get(1);//Integer(20)을 자동으로 20으로 변환auto unboxing
		System.out.println(n);		
		
		// +)
		//List계열 다른 클래스들 
		LinkedList<String> ll=new LinkedList<String>();
		//LikedList 사용방법== ArrayList, 성능만 다름
		//빈번한 추가 삭제에있어서 용이--요소가 많으면 LinkedList를 사용하는게 효율적
		//참조변수의 변환만으로 삽이가능
		//ArrayList보다 요소의 삽입, 삭제가 빠름
		//ArrayList보다 특정index의 값을 읽어오는것이 느림
		ll.add("A");		ll.add("B");
		System.out.println(ll.size());
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());		
		
		//Vector(ArrayList와 99%일치)- 단, 동기화(in Thread)처리 되어있음
		Vector<String> v=new Vector<String>();		
		//List Interface계열의 ArrayList,LinkedList,Vector는 
		//모두 사용방법이 같고 메소드도 대부분 동일하다
		//List(참조변수-parent)로 하위클래스(sub) 객체들을 모두 참조할 수 있음
		List<String> list=null;
		list= new ArrayList<String>();
		list= new LinkedList<String>();
		list= new Vector<String>();
		
		//배열을 list로 변경하기
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

    
















