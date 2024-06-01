package BasicKnwoledge;

import java.util.Scanner;

public class Arrayprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size");
		Scanner s1=new Scanner(System.in);
		int a=        s1.nextInt();
		String name[]=new String[a];
		name[0]="anu";
		name[1]="snu";
		name[2]="mnu";
		name[3]="knu";
		name[4]="jnu";
   for(int i=0;i<a;i++)
   {
	   
	   System.out.println(name[i]);
   }
s1.close();
	}

}
