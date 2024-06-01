package BasicKnwoledge;

public class Palindrom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="madhu";
String reverse="";
//System.out.println(name.toUpperCase());
for(int i=name.length()-1;i>=0;i--)
{
 char op=              name.charAt(i);
reverse=reverse+op;
	}
System.out.println(reverse.toUpperCase());
}
}