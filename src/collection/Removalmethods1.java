package collection;

import java.util.ArrayList;

public class Removalmethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList s1=new ArrayList();
s1.add("akshara");
s1.add("shanu");
System.out.println(s1);
System.out.println(s1.clone());
System.out.println(s1.size());
System.out.println(s1.remove("shanu"));
System.out.println(s1.removeAll(s1));
	}

}
