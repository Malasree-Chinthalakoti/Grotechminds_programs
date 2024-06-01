package BasicKnwoledge;
class parent1 {
	static void add()
	{
		System.out.println("parent1");
	}
}
class parent2 extends parent1{
	void sub()
	{
		System.out.println("parent2");
	}
}
public class Abtrstrct4 extends parent2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Abtrstrct4 c1=new  Abtrstrct4();
		 c1.sub();
		add();
		System.out.println("child");
	}

}
