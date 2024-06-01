package BasicKnwoledge;


import java.util.Scanner;

public class Assignment68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter statement");	
Scanner s1=new Scanner(System.in);
boolean statement[]=new boolean[3];
statement[0]=    s1.nextBoolean();
statement[1]=    s1.nextBoolean();
statement[2]=    s1.nextBoolean();

for(int i=0;i<3;i++)
{
	if(!statement[i])
	{
		System.out.println('F');
	}
	else
	{
		System.out.println('T');	
	}
	
}
s1.close();
	}

}
