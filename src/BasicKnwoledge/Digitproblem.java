package BasicKnwoledge;

import java.util.Arrays;

public class Digitproblem {
static int a2=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="12345";
char[] a1=name.toCharArray();
System.out.println(Arrays.toString(a1));
System.out.println(a1.length);
for(int i=0;i<a1.length;i++)
{
boolean a=Character.isDigit(a1[i]);
if(a==true)
{
	a2++;
	}
}
System.out.println(a2);
if(a2==a1.length)
{
	System.out.println("Given string is numeric");
}
}
}