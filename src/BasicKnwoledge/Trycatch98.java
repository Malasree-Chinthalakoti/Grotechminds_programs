package BasicKnwoledge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trycatch98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		try {
		int n1=   s1.nextInt();
		
				String[] name= new String[n1];
				name[0]="Ram";
				name[1]="Sita";
				name[2]="Laxman";
				name[3]="hanumam";
				System.out.println(" digit");
		}
				catch(ArrayIndexOutOfBoundsException a)
				{
					System.out.println("enter wrong digit");
				}
				catch(InputMismatchException a1)
				{
					System.out.println("enter wrong digit1");
				}
				
				//System.out.println("t");
				//if the user enter entered n1= 3,
				//if the user enter entered n1= manish,
	}

}
