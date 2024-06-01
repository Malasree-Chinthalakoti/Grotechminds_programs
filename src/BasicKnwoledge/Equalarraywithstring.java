package BasicKnwoledge;

import java.util.Arrays;
import java.util.Scanner;

public class Equalarraywithstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		String name[]=new String[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the array-->"+i);
			name[i]=        s1.next();
		}
		System.out.println("Enter the numbers of second array");
		String name1[]=new String[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the array-->"+i);
			name1[i]=        s1.next();
		}
		System.out.println(Arrays.toString(name));
		
		System.out.println(Arrays.toString(name1));
		if(Arrays.equals(name, name1)==true)
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
