
public class First {
	public int a=10;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "First field :"+a;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		First f= (First)obj;
		return f.a == this.a;
	}

}
