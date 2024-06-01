package BasicKnwoledge;

public class Arrays1 {
static int a=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nos[]=new int[5];
nos[0]=10;
nos[1]=41;
nos[2]=41;
nos[3]=41;
nos[4]=50;
for(int i=0;i<5;i++) {
	System.out.println(nos[i]);

if(nos[i]==41)	
{
	a++;
	System.out.println("41 is present");
}
else
{
	//System.out.println("41 is not present");
}

}	
System.out.println(a);
//System.out.println("41 is not present");
	}

}
