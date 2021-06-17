package game;

import fixtures.Room;

public class RoomManager {

	private Room startingRoom;
	private Room[] rooms;
	//protected boolean gameRunning = true;

	public RoomManager(int count) {
		super();
		rooms = new Room[count];
	}
	
	/*
	 * init() method controls 
	 * - room creation
	 * - exit selection
	 */
	public void init() {
		//while (gameRunning) {
			//play game until gameRunning is false
		
		// create rooms in the house
		Room foyer = new Room(
				"The Foyer",
				"a grand entrance",
				"The small entryway of an eastern traditonal  mansion. A dining room is open to the south, where a large table can be seen." + "\n"
				+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
				+ "To the north is a small room, where you can see a piano."); // change long description
		
		this.rooms[0] = foyer;
		
		
		Room living = new Room(
				"The Living Room",
				"a sleek modern living room",
				""// add long description
				);
		this.rooms[1] = living;
		
		Room kitchen = new Room(
				"The Kitchen",
				"a newly renovated kitchen",
				"with marble countertops"// add long description
				);
		this.rooms[2] = kitchen;
		
		Room dining = new Room(
				"The Dining Room",
				"a formal dining room",
				""// add long description
				);
		this.rooms[3] = dining;
		
		Room bedroom = new Room(
				"The Bedroom",
				"a gorgeous bedroom",
				""// add long description
				);	
		this.rooms[4] = bedroom;
		
		Room walkIn = new Room(
				"The walk in closet",
				"a very spacious walk in closet",
				""// add long description
				);	
		this.rooms[5] = walkIn;
		
		Room bathroom = new Room(
				"The Bathroom",
				"an elegant bathroom",
				""// add long description
				);
		this.rooms[6] = bathroom;
		
		Room guestRoom = new Room(
				"The Guest Bedroom",
				"a comfy guest bedroom",
				""// add long description
				);	
		this.rooms[7] = guestRoom;
		
		Room garage = new Room(
				"The Garage",
				"a 12 car garage",
				""// add long description
				);	
		this.rooms[8] = garage;
		
		//set the starting room to the living room
		this.startingRoom = kitchen;
		
		// setting exits to create home layout
		foyer.setExits(new Room[] {null, null, living, null});
		living.setExits(new Room[] {guestRoom, dining, bathroom, foyer});
		guestRoom.setExits(new Room[] {null, living, null, null});
		dining.setExits(new Room[] {living, null, kitchen, null});
		kitchen.setExits(new Room[] {bathroom, garage, null, dining});
		garage.setExits(new Room[] {kitchen, null, null, null});
		bathroom.setExits(new Room[] {null, kitchen, bedroom, living});
		bedroom.setExits(new Room[] {walkIn, null, null, kitchen});
		walkIn.setExits(new Room[] { null, bedroom, null, null});
		
		
	}
	
	//getters and setters
	public Room getStartingRoom() {
		return startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
}
