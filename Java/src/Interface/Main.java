package Interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone i=new IPhone();
		Galaxy g=new Galaxy();
		
		System.out.println("메신저 최소문자:"+ Messenger.MIN);
		System.out.println("메신저 최대문자:"+ Messenger.MAX);
		i.Login(true);
		i.getMessage();
		i.setMessage("HI");
		i.clear();
		g.Login(true);
		g.getMessage();
		g.setMessage("HI");
		g.changeKeyboard();
		System.out.println();System.out.println();System.out.println();
		
		g.fileUpload();
		g.fileDownload();
		i.button();
		i.draw();
		
		
		
		
		Messenger test=new Messenger() {

			@Override
			public String getMessage() {
				// TODO Auto-generated method stub
				return "test";
			}

			@Override
			public void setMessage(String msg) {
				// TODO Auto-generated method stub
				System.out.println("test message: "+msg);
			}
			
		};
		System.out.println(test.getMessage());
		test.setMessage("nice day");


	}

}



class IOS{
	public void draw() {
		System.out.println("[       ]");
	}
	public void button() {
		System.out.println( "○○○○○");
	}
}

class IPhone extends IOS implements Messenger {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "IPhone";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("iphone message:"+msg);
		}
		
	public void clear() {
		System.out.println("delete");
		}

}
	
class Galaxy implements Messenger,WorkFile{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Galaxy";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("galaxy message:"+msg);		
	}
	public void changeKeyboard() {
		System.out.println("key delete");
	}

	@Override
	public void fileUpload() {
		// TODO Auto-generated method stub
		System.out.println("upload");
	}

	@Override
	public void fileDownload() {
		// TODO Auto-generated method stub
		System.out.println("download");
	}
}
