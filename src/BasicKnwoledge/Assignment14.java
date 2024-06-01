package BasicKnwoledge;
interface madhu{
	void add();
	void sub();
}
interface maha extends madhu{
	void mul();
	void div();
}
public class Assignment14 implements maha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a1");
		Assignment14 m1=new Assignment14();
		m1.add();
		m1.sub();
		m1.mul();
		m1.div();
		
	}

	
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("a2");
	}

	
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("a3");
	}

	
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("a4");
	}

	
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("a5");
	}

}
