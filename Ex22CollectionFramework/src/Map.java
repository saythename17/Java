import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		// TODO Map [key-value]로 데이터를 저장
		//Map도 인터페이스이므로 직접 객체생성 불가, 하위클래스로 Map을 구현
		HashMap<String, String> map=new HashMap<String, String>();
		//TreeMap<String, String> map=new TreeMap<String, String>();-- key값의 알파벳 순서대로 출력됨
		//LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
		//└저장된 순서대로 출력
		//Hashtable<String, String> map=new Hashtable<String, String>();
		//└99%==HashMap//1% - 동기화처리 되어있음
		map.put("Name", "Ben");//Map은 .add()대신 .put()을 씀
		map.put("ID", "baby");
		map.put("PW", "120");
		map.put("KKK", "Ben");//중복 value허용
		map.put("KKK", "willy");//중복 key는 허용X,기존 key의 방의 값을 변경
		System.out.println("요소개수: "+map.size());
		//요소 얻어오기
		System.out.println(map.get("Name"));
		System.out.println(map.get("ID"));
		System.out.println(map.get("PW"));
		System.out.println(map.get("KKK"));
		System.out.println(map.get("BAB"));//못찾으면 null
		System.out.println("============");
		//순차적 출력
		//for문 불가..-index가 없음
		//확장 for문도 불가..
		//방법1.
		//일단, key값들만 뽑아오기
		Set<String> keys=map.keySet();
		for(String t:keys) {
			//System.out.println(t);---key값 출력
			System.out.println(t+":"+map.get(t));
		}System.out.println("============");
		//방법2. Map객체를 Set으로 변환//entry:Map의 구성원(entry class)
		Set<Entry<String,String>> entries=map.entrySet();
		for (Entry<String, String> e:entries) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		//만약 key값을 index번호로 하고싶다면 key의 자료형을 Integer로..
		HashMap<Integer, String> map2=new HashMap<Integer, String>();
		map2.put(0, "a");	map2.put(1, "b");	map2.put(2, "c");
		//--->반복문 사용가능
		for(int i=0;i<map2.size();i++) {
			System.out.println(map2.get(i));
		}

	}

}
