package BasicKnwoledge;

public class palindrom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="mom";
		String reverse="";
		//System.out.println(name.toUpperCase());
		for(int i=name.length()-1;i>=0;i--)
		{
		 char op=              name.charAt(i);
		reverse=reverse+op;
			}
		System.out.println(reverse);
		if(name.equals(reverse))
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not a palindrom");
		}
		//System.out.println(name.equals(reverse));
	}

}
