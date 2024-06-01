package BasicKnwoledge;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int rollno[]=new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the array-->"+i);
			rollno[i]=        s1.nextInt();
		}
		System.out.println("Enter the numbers of second array");
		int rollno1[]=new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the array-->"+i);
			rollno1[i]=        s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		
		System.out.println(Arrays.toString(rollno1));
		if(Arrays.equals(rollno, rollno1)==true)
		{
			System.out.println("two arrays are exactly same");
		}
		else
		{
			System.out.println("two arrays are not same");
		}
		s1.close();
	}

}
