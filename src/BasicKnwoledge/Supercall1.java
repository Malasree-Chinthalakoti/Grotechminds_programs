package BasicKnwoledge;

public class Supercall1 {
	Supercall1()
	{
		this(100);
		System.out.println("a1");
	}
	Supercall1(int a)
	{
		this(10.14);
		System.out.println("a2");	
	}
	Supercall1(double a)
	{
		
		System.out.println("a3");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supercall1 m1=new Supercall1();
		
	}

}
