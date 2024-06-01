package BasicKnwoledge;

import java.util.Date;

public class Dateclass2 {

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
		String name=d2.toString();
		String date=name.substring(8,10);
		System.out.println(date);
		String month=name.substring(4,7);
		System.out.println(month);
		String year=name.substring(24);
		System.out.println(year);
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));
	}

}
