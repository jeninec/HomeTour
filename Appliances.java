package fixtures;

public class Appliances extends Fixture implements Powerable{
	public Appliances(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}

	@Override
	public void powerOn() {
		System.out.println("You turned on " + name);
	}
	
	@Override
	public void powerOff() {
		System.out.println("You turned off " + name);
	} 

}
