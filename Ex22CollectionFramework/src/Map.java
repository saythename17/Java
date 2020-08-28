import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		// TODO Map [key-value]�� �����͸� ����
		//Map�� �������̽��̹Ƿ� ���� ��ü���� �Ұ�, ����Ŭ������ Map�� ����
		HashMap<String, String> map=new HashMap<String, String>();
		//TreeMap<String, String> map=new TreeMap<String, String>();-- key���� ���ĺ� ������� ��µ�
		//LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
		//������� ������� ���
		//Hashtable<String, String> map=new Hashtable<String, String>();
		//��99%==HashMap//1% - ����ȭó�� �Ǿ�����
		map.put("Name", "Ben");//Map�� .add()��� .put()�� ��
		map.put("ID", "baby");
		map.put("PW", "120");
		map.put("KKK", "Ben");//�ߺ� value���
		map.put("KKK", "willy");//�ߺ� key�� ���X,���� key�� ���� ���� ����
		System.out.println("��Ұ���: "+map.size());
		//��� ������
		System.out.println(map.get("Name"));
		System.out.println(map.get("ID"));
		System.out.println(map.get("PW"));
		System.out.println(map.get("KKK"));
		System.out.println(map.get("BAB"));//��ã���� null
		System.out.println("============");
		//������ ���
		//for�� �Ұ�..-index�� ����
		//Ȯ�� for���� �Ұ�..
		//���1.
		//�ϴ�, key���鸸 �̾ƿ���
		Set<String> keys=map.keySet();
		for(String t:keys) {
			//System.out.println(t);---key�� ���
			System.out.println(t+":"+map.get(t));
		}System.out.println("============");
		//���2. Map��ü�� Set���� ��ȯ//entry:Map�� ������(entry class)
		Set<Entry<String,String>> entries=map.entrySet();
		for (Entry<String, String> e:entries) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		//���� key���� index��ȣ�� �ϰ�ʹٸ� key�� �ڷ����� Integer��..
		HashMap<Integer, String> map2=new HashMap<Integer, String>();
		map2.put(0, "a");	map2.put(1, "b");	map2.put(2, "c");
		//--->�ݺ��� ��밡��
		for(int i=0;i<map2.size();i++) {
			System.out.println(map2.get(i));
		}

	}

}
