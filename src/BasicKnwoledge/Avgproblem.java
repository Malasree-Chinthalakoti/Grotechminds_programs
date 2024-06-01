package BasicKnwoledge;

public class Avgproblem {
static int sum1=0;
static double sum2=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[4];
a[0]=10;
a[1]=20;
a[2]=30;
a[3]=40;
double b[]=new double[4];
b[0]=12.12;
b[0]=13.12;
b[0]=14.12;
b[0]=15.12;

for(int i=0;i<a.length;i++)
{
 sum1 = sum1+a[i];
}
for(int i=0;i<b.length;i++)
{
	sum2=sum2+b[i];
}
double avg=(sum1+sum2)/(a.length+b.length);
System.out.println(sum1);
System.out.println(sum2);
System.out.println(avg);
	}

}
