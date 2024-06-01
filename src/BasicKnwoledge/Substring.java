package BasicKnwoledge;

import java.util.Arrays;

public class Substring {
static int a=0; 
static int a1=0; 
static int a2=0; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="mala  sree 123 @#$";
char [] c1= name.toCharArray();
System.out.println(c1.length);
System.out.println("===================");
System.out.println(Arrays.toString(c1));
System.out.println("===================");
for(int i=0;i<c1.length;i++)
{
//Character.isAlphabetic(c1[i]);

boolean ans =Character.isAlphabetic(c1[i]);

boolean ans1 =Character.isDigit(c1[i]);
boolean ans2=Character.isSpaceChar(c1[i]);

if(ans==true)
{
    a++;
    //System.out.println(a);
  
}

if(ans1==true) {
	a1++;
//System.out.println(a1);

}
if(ans2==true) {

	a2++;
	//System.out.println(a2);
	
}

}
System.out.println("no of special characters--->"+(c1.length-(a+a1+a2)));
System.out.println("no of alphabets--->"+a);
System.out.println("no of numericals--->"+a1);
System.out.println("no of spaces--->"+a2);
}
}


