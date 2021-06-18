package fixtures;

public class Clothing extends Fixture implements Wearable{

	public Clothing(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}
	
	@Override
	public void putOn() {
		System.out.println("You're wearing " + name +
				"It looks great on you!");
	}
	
	@Override
	public void takeOff() {
		System.out.println("You took off " + name +
				"Don't forget to hang it back up!");
	}
}
