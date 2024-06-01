package BasicKnwoledge;
class ammu{
	
	static int a=10;
	
}

public class Superkeyword extends ammu{
	void sub()
	{

		this.a=1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superkeyword m1=new Superkeyword ();
		m1.sub();
		System.out.println(a);
	}

}
