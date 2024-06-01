package BasicKnwoledge;
abstract class amazon{
	abstract void login1();
	abstract void login2();
	void add()
	{
		System.out.println("add");
	}
	void sub()
	{
		System.out.println("sub");
	}
}
abstract class amazon_flip extends amazon{
	abstract void logic1();
	abstract void logic2();
	void mul()
	{
		System.out.println("mul");
	}
}
public class Abclass3 extends amazon_flip {
	static void div()
	{
		System.out.println("div");
	}
	void mod()
	{
		System.out.println("mod");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abclass3 m1=new Abclass3();
		m1.mod();
		m1.mul();
		div();
		m1.add();
		m1.sub();
		m1.logic1();
		m1.logic2();
		m1.login1();
		m1.login2();
	}
	
	void logic1() {
		// TODO Auto-generated method stub
		System.out.println("m");
	}
	
	void logic2() {
		// TODO Auto-generated method stub
		System.out.println("a");
	}
	
	void login1() {
		// TODO Auto-generated method stub
		System.out.println("l");
	}
	
	void login2() {
		// TODO Auto-generated method stub
		System.out.println("a");
	}

}
