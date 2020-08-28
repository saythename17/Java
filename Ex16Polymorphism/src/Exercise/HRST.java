package Exercise;
abstract class Employee{
	String name;
	int salary;
	public abstract void calSalary();
	public abstract void calBonus();
}
class Salesman extends Employee{
	int annual;
	@Override
	public void calSalary() {
		// TODO Auto-generated method stub
		System.out.println("salesman급여");
	}
	@Override
	public void calBonus() {
		// TODO Auto-generated method stub
		System.out.println("salesman보너스");
	}
}
class Consultant extends Employee{
	int project=1000;
	@Override
	public void calSalary() {
		// TODO Auto-generated method stub
		System.out.println("Consultant 급여");
		
	}
	@Override
	public void calBonus() {
		// TODO Auto-generated method stub
		System.out.println("Consultant bonus");
	}
}



 class Manager extends Employee{
	 int team;
	@Override
	public void calBonus() {
		// TODO Auto-generated method stub
		System.out.println("Manager bonus");
		
	}
	@Override
	public void calSalary() {
		// TODO Auto-generated method stub
		System.out.println("Manager salary");
	}
}
class Director extends Manager{
	int d;
	@Override
	public void calSalary() {
		// TODO 	super.calSalary();
		System.out.println("Director salary");
	
	}
	@Override
	public void calBonus() {
		// TODO Auto-generated method stub
		System.out.println("Director bonus");
	}
}
public class HRST {
	public static void calTax(Employee e) {
		if (e instanceof Salesman) {
			((Salesman) e).annual=65000;
			System.out.println("salesman tax"+((Salesman)e).annual);
		}
		else if (e instanceof Director) {
			Director d = (Director)e;
			d.d=5;
			System.out.println("director "+d.d);
		}
		else if (e instanceof Manager) {
			System.out.println("manager tax");
			System.out.println(((Manager) e).team);
		}
		else if (e instanceof Consultant) {
			System.out.println("consultant tax"+((Consultant)e).project);
		}
		
		else System.out.println("employee");


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salesman s=new Salesman();
		s.calBonus();
		Consultant c=new Consultant();
		c.calBonus();
		Director d=new Director();
		d.calBonus();
		System.out.println();
		calTax(s);
		calTax(c);
		calTax(d);
		System.out.println();
		
//		System.out.println(s.toString());
//		System.out.println(c.toString());
//		System.out.println(d.toString());
		
//		Salesman s2=s;
//		System.out.println(s2.toString());
//		if(s.equals(s2)) {
//			System.out.println("동일 객체");
//		}else {
//			System.out.println("다른 객체");
//		}
		
		
		
		
		Salesman s1=new Salesman();
		Employee s2=new Salesman();
		Object s3=new Salesman();
		
		Object m1=new Manager();
		Employee m2=new Manager();
		Manager m3=new Manager();
		//Director m4= (Director) new Manager();
		
		Object[] arr=new Object[6];
		arr[0]=s1;
		arr[1]=s2;
		arr[2]=s3;
		arr[3]=m1;
		arr[4]=m2;
		arr[5]=m3;
		for(Object t:arr) {
			System.out.println(t);
		}
		System.out.println();
		

	}

}
