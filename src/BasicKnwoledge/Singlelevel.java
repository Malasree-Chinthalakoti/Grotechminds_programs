package BasicKnwoledge;
class parent{
	static void add()
	{
		System.out.println("addition");
	}
	static void sub()
	{
		System.out.println("subtraction");
	}
}
class child  extends   parent            {
	static void mul()
	{
		System.out.println("multiplication");
	}
}
public class Singlelevel extends child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add();
sub();
mul();
		
		
	}

}
