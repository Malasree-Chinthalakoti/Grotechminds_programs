package BasicKnwoledge;

public class Encapsulation {
private String name="malasree";
public String getname() {
return name;
}
public void setname(String name) {
	this.name=name;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation s=new Encapsulation();
		s.setname("madhu");
		System.out.println(s.getname());
	}

}
