
public class Test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= new char[26];
		char a='A';
		for (int i=0;i<arr.length;i++) {
			arr[i]=(char)(a+i);
			System.out.println(arr[i]);
		}System.out.println();

		for(char i:arr) System.out.println(i);
	}

}
