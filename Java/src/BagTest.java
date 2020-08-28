class Bag<T,N>{
	private T thing;
	private N name;
	public Bag(T thing, N name) {
		this.thing=thing;
		this.name=name;
	}
	public T getThing() {
		return thing;
	}
	public void setThing(T thing) {
		this.thing=thing;
	}
	public N getName() {
		return name;
	}
	public void setName(N name) {
		this.name=name;
	}
	void show(){
		System.out.println("T type is : "+thing.getClass().getName());
		System.out.println("N type is : "+name.getClass().getName());
		
	}
}
class Book{
	public String toString() {
		return "책";
	}
}
class Cartoon{}
class Macbook{}
public class BagTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag<Book,String> bag=new Bag<>(new Book(),"과학");
		Book book=bag.getThing();
		System.out.println("This is : "+book);
		System.out.println("Name : "+bag.getName());
		Bag<Cartoon,String> bag2=new Bag<>(new Cartoon(),"치인트");
		//Bag<Macbook> bag3=new Bag<Macbook>(new Macbook());
		bag.show();
		bag2.show();
		//bag3.show();
		//bag=bag2;
		
	}

}
