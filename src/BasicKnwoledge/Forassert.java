package BasicKnwoledge;

public class Forassert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]=new String[3];
		name[0]="ram";
		name[1]="";
		name[2]="sita";
		
		for(int i=0;i<3;i++)
			
	
		System.out.println(name[i]);
		assert name[1].length()>0;
	}
}
