package corejava;


final class Myname {
	private final String name;
	private final String city;
	public Myname(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	
	
}

public class ImmutableObject {

	public static void main(String[] args) {
		Myname myname=new Myname("Amlan", "Kolkata");
		System.out.println(myname.getName()+" "+myname.getCity());
		

	}

}
