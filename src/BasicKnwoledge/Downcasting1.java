package BasicKnwoledge;
class  something{
	void add()
	{
		System.out.println("parent");
	}
}
 class Downcasting1 extends something {
void sub()
{
	System.out.println("child");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		something a=new Downcasting1();//up casting
		Downcasting1 a1=(Downcasting1) a;//down casting
		
		a1.add();
		a1.sub();
	}

}
