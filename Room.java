package fixtures;

public class Room extends Fixture{
	
	private Room[] exits; //will contain 4 exits in the N, S, E, & W directions
	
	//contain any objects found in a room
	private Fixture[] items;
	
	// could create item classes (fridge, lamp, or appliance)
	// class would extend Fixture and implements interface named Interactable
	// interactable could have abstract methods like open and close
	// - could add more interfaces 
	
	public Room(String name, String shortDesc, String longDesc) {
		super(name,shortDesc, longDesc);
		this.exits = new Room[4]; //not sure I need this
	}
	
	//returns rooms at each exit for all directions
	public Room[] getExits() {
		return this.exits;
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	
	//takes a string direction and returns the room at that exit
	public Room getExit(String dir) {
		
		if (dir == "NORTH") {
			return this.exits[0];
		}
		if (dir == "SOUTH") {
			return this.exits[1];
		}
		if (dir == "EAST") {
			return this.exits[2];
		}
		if (dir == "WEST") {
			return this.exits[3];
			
		}
		return null;
		
	}

	public Fixture[] getItems() {
		return items;
	}

	public void setItems(Fixture[] items) {
		this.items = items;
	}
	

	
	
	
}
