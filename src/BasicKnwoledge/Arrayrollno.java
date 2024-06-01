package BasicKnwoledge;

public class Arrayrollno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]=new String[3];
		name [0]="jyothi";
		name [1]="deepa";
		name [2]="harini";
		
		
		int rollno[]=new int [3];
		rollno [0]=77;
		rollno [1]=78;
		rollno [2]=79;
		char gender[]=new char[3];
		gender[0]='F';
		gender[1]='M';
		gender[2]='M';
		System.out.println("name   rollno   gender" );
		for(int i=0;i<3;i++)
		System.out.println(name[i]+"    "+ rollno[i]+"    "+gender[i]);
	}

}
