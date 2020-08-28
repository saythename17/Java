package Polymorphysm2;

public class PetFactory {
	//Pet(Dog,Cat,Pig)�� ����� method
	Pet makePet(int n){
		Pet ani=null;
		
		switch(n) {
		case 1:
			ani=new Dog();
			break;
		case 2:
			ani=new Cat();
			break;
		case 3:
			ani=new Pig();
			break;			
		}
		return ani;
	}

}
