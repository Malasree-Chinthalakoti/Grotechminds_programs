package collection;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1=new ArrayList();
a1.add("ram");
a1.add("madhu");
a1.add("sita");
System.out.println(a1);
System.out.println(a1.clone());
ArrayList a2=new ArrayList();
a2.add("ram");
a2.add("anu");
a2.add("anitha");
System.out.println(a2);
a1.addAll(a2);
System.out.println(a1);
a1.removeAll(a2);
System.out.println(a1);
//a1.clear();
//System.out.println(a1);
a2.addAll(a1);
System.out.println(a2);
System.out.println(a1.containsAll(a2));
System.out.println(a2.containsAll(a1));
System.out.println(a2.contains("madhu"));
System.out.println(a1.contains(""));
System.out.println(a1.isEmpty());
a1.remove("madhu");
System.out.println(a1);

System.out.println(a1.size());
a1.clear();
System.out.println(a1);

	}

}
