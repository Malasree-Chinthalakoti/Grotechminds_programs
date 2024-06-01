package BasicKnwoledge;


class parent11 {
	parent11(int a)
	{
		
		System.out.println("parent");
	}
	
}
class child1 extends parent11 {
	child1()
	{
		super(100);
		System.out.println("child");
	}
}
class child12 extends child1 {
	child12(double b)
	{
		super();
		System.out.println("child2");
	}
}
class child13 extends child12 {
	child13(int a)
	{
		super(14.14);
		System.out.println("child3");
	}
}
public class Supercall11 extends child13{

	Supercall11(int a) {
		super(200);
		System.out.println("child4");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Supercall11(300);
		
	}

}
