package BasicKnwoledge;
interface father1{
	 void reg1();
	}
interface mother1{
	 void reg2();
	}

public class Multiplelevel implements father1,mother1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Multiplelevel m1=new  Multiplelevel();
		 m1.reg1();
		 m1.reg2();
}
public void reg2() {
		// TODO Auto-generated method stub
		System.out.println("reg2");	
	}
public void reg1() {
		// TODO Auto-generated method stub
		System.out.println("reg1");
	}

}
