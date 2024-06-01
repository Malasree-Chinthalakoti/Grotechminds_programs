package BasicKnwoledge;
abstract class malasree extends madhumala  {
abstract void login();
abstract void reg();
void add()
{
	int a=10;
	int b=20;
	System.out.println(a+b);
}
void sub()
{
	int c=10;
	int d=20;
	System.out.println(c-d);
}
}
//abstract void login ();


public class Abstrct2  extends  malasree
{
	
		void mod()
		{
			System.out.println("modulus");
		}
		static void logic()
		{
			System.out.println("logic");
		}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstrct2 a1=new Abstrct2();
		a1.mod();
		logic();
		a1.login();
		a1.reg();
		a1.mul();
		logic1();
		a1.add();
		a1.sub();
	}
	
	void login() {
		// TODO Auto-generated method stub
		System.out.println("login");
	}
	
	void reg() {
		// TODO Auto-generated method stub
		System.out.println("reg");
	}
	
	

}
	class madhumala 
	{
		void mul()
		{
			
			System.out.println("multiplication");
		}
		static void logic1()
		{

			System.out.println("multiplication");
		}
	}
