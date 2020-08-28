
public class Main {

	public static void main(String[] args) {
		// TODO 다형성 Polymorphism (세포분열)TODO
		First f=new First();//참조변수가 객체를 잡고있음 : ★casting★
		Second s=new Second();//참조변수 자료형==객체 자료형 :casting
		
		//class의 자료형 !=참조변수 자료형이 가능한 경우 : 상속관계(자식객체에게)
		//부모는 자식 참조가능 (super can control sub)
		//└자식객체는 반드시 부모객체의 멤버를 가지고 있기 때문
		f= new Second();
		//UP casting --나보다 큰 객체를 잡음(super참조변수 pointing sub)	
		//└부모가 자식참조
		
		//s= new First();---ERROR sub참조변수 can't pointing super
		//└DOWN casting --나보다 작은 객체를 잡음, 자식이 부모참조
		//UP casting하더라도  자식객체의 고유 멤버 사용불가
		f.a=100;//본인(super) 멤버만 사용가능
		//f.b=600;---sub class's member b ERROR
		//★참조변수==리모컨
		Second s2;
		s2=(Second)f; //super→sub로 명시적 형변환시 DOWN casting 가능
		//└기존에 있는 f주소에 s2저장
		//---reference variable copy reference
		
		
		
		
		
		
		First f4=new Second();//UP casting
		f4.a=1;
		f4.show();//method override(부모참조변수로 Second method실행)
		//부모 참조변수 1개로 자식객체 모두 제어가능
		
		//one super's reference variable can control all the sub class 
		First f5= new First();
		f5.show();//*override
		
		f5=new Second();
		f5.show();//*override
		
		//First를 상속한 class Third class
		f5=new Third();
		f5.show();//*override
		//*모양은 같은데 성질이 다름 : 동상이형  : 다형성
		
		//계층 상속관계 (grand->parent->child)
		f5= new Fourd();//UP casting
		f5.show();
	}

}
