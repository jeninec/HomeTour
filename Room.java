package fixtures;

public class Room extends Fixture{
	
	Room[] exits = {}; //contains 4 exits in the N, S, E, & W directions
	
	
	// can add items in room with priv Fix[] items;
	// could create item classes (fridge, lamp, or appliance)
	// class would extend Fixture and implements interface named Interactable
	// interactable could have abstract methods like open and close
	// - could add more interfaces 
	
	public Room(String name, String shortDesc, String longDesc) {
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
		this.exits = new Room[4];
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
		if (dir == "north") {
			return this.exits[0];
		}
		if (dir == "south") {
			return this.exits[1];
		}
		if (dir == "east") {
			return this.exits[2];
		}
		if (dir == "west") {
			return this.exits[3];
		}
		return this.exits[2];
		
	}

	
	
	
}
