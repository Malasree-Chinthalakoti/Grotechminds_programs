package BasicKnwoledge;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="bread";
String name1="beard";
if(name.length()!=name1.length())
{
	System.out.println("they are not anagram");
}
else
{
char[] c1=   name.toCharArray();
char[] c2=   name1.toCharArray();
System.out.println(Arrays.toString(c1));
System.out.println(Arrays.toString(c2));
	Arrays.sort(c1);
	Arrays.sort(c2);
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
if	(Arrays.equals(c1, c2)==true)
{
	System.out.println("they are anagram");
}
else
{
	System.out.println("they are not anagram");
}
	}

	
	}
}


