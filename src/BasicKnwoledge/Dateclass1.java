package BasicKnwoledge;

import java.util.Date;

public class Dateclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d1=new Date();
System.out.println(d1.getTime());
String input= d1.toString();
System.out.println(input);
Date d2=new Date(d1.getTime()-(60*60*1000*24*7));
System.out.println(d2);
Date d3=new Date(d1.getTime()+(60*60*1000*24*7));
System.out.println(d3);
	}

}
