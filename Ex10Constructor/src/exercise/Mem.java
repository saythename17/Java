package exercise;

public class Mem {
	public static void main(String[] args) {
		Mem member=new Mem();
		Mem member1=new Mem("iu");
		Mem member2=new Mem("iu",23);
	}
		private String name;
		private int age;
		public Mem() {
			this("zu");	
		}
		public Mem(String name) {
			this(name,0);
		}
		public Mem(String name,int age) {
			this.name=name;
			this.age=age;
			System.out.println(this.name+this.age);
		}
		
	

}
