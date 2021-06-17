package fixtures;

public abstract class Fixture {

	public String name;
	public String shortDesc;
	public String longDesc;
	
	public Fixture(String name, String shortDesc, String longDesc) {
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
	}
	
	@Override
	public String toString() {
		return "Fixture [name=" + name + ", shortDesc=" + shortDesc +  "]";
	}
}
