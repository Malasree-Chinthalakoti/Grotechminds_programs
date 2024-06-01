package BasicKnwoledge;

import java.util.Arrays;

public class Arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]=new String[3];
		name[0]="sana";
		name[1]="hana";
		name[2]="kana";
		
		String namecopy[]=new String[name.length];
		for(int i=0;i<3;i++) 
		{
			namecopy[i]=name[i];
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(namecopy));
	}

}
