package BasicKnwoledge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trycatchfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a=new Scanner(System.in);
try {
int age=    a.nextInt();
System.out.println(age);
}
catch(InputMismatchException b) {
	System.out.println("input mismatch");
}
finally {
	System.out.println("enter again");
}
	}

}
