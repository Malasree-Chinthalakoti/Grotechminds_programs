package BasicKnwoledge;
class paren{
	String name="john";
	void m1()
	{
		System.out.println("this is m1 from parent..");
	}
}
class manu extends paren
{
	int s=100;
	void m2()
	{
		System.out.println("this is m2 from child..");
	}
}
public class Typecasting_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*manu c=new manu();
		System.out.println(c.name);
		c.m1();
		System.out.println(c.s);
		c.m2();*/
		paren p=new manu();//upcasting
		
		System.out.println(p.name);
		p.m1();
		manu p2=(manu) p;
		//System.out.println(p.s);//we cannot acces
		//p.m2();//we cannot acces
		//paren p1=new paren();
		//paren p2=new manu();
		//System.out.println(p.s);
		p2.m1();
		p2.m2();
		
		//System.out.println(p.s);
	}

}
