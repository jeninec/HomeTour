package game;

import fixtures.Appliances;
import fixtures.Car;
import fixtures.Clothing;
import fixtures.Fixture;
import fixtures.Furniture;
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
		
		//Foyer and items
		Room foyer = new Room(
				"The Foyer",
				"a large entry way",
				"The large entryway of an eastern traditonal mansion. A living room is open to the east, "
				+ "\n where a custom-made white leather couch can be seen." + "\n"
				); // change long description
		
		this.rooms[0] = foyer;
		Furniture plant = new Furniture(
				"plant",
				"a fiddle leaf fig",
				"a 5 year old fiddle leaf fig plant"
				);
		Clothing coat = new Clothing(
				"coat",
				"a red jacket",
				"a red puffer coat with tortoise shell buttons"
				);
		Fixture[] foyItems = {plant, coat};
		foyer.setItems(foyItems);
		
		//Living Room and items
		Room living = new Room(
				"The Living Room",
				"a sleek modern living room",
				"The sleek and modern living room with a white leather sofa and a crystal ceiling light fixture."
				+ "\n A bathroom with floor to ceiling tiles and a claw-foot soaker tub is to the east." 
						+ "\n The hardwood floor leads south to an archway, through it a formal dining room with"
						+ "\n a long redwood table. To the north is a bedroom, in it a stunninng oak bedframe." 
						+ "\n To the west a large entryway of an eastern traditonal mansion."
				);
		this.rooms[1] = living;
		Furniture sofa = new Furniture(
				"sofa",
				"a white leather sofa",
				""
				);
		Furniture chaise = new Furniture(
				"recliner",
				"a pink chaise lounge",
				"a pink chaise lounge"
				);
		Appliances tv = new Appliances(
				"tv",
				"a plasma flat screen tv",
				"a plasma flat screen tv"
				);
		Appliances light2 = new Appliances(
				"light",
				"crystal light fixture",
				"a grey Keruig a grey coffee maker"
				);
		Fixture[] livItems = {sofa, chaise, tv, light2};
		living.setItems(livItems);
		
		//Kitchen and items
		Room kitchen = new Room(
				"The Kitchen",
				"a newly renovated kitchen",
				"A newly renovated kitchen with marble countertops. A bathroom with floor to ceiling tiles "
				+ "\n and a claw-foot soaker tub is to the north. From here, there is a spacious garage "+ "\n"
				+ "filled with luxury cars to the south. To the west is a formal dining room with a long redwood table."
				);
		this.rooms[2] = kitchen;
		Appliances fridge = new Appliances(
				"fridge",
				"a stainless steel refrigerator",
				"a smart LG stainless steel refrigerator"
				);
		Appliances microwave = new Appliances(
				"microwave",
				"a stainless steel microwave",
				"a smart LG stainless steel microwave"
				);
		Appliances oven = new Appliances(
				"oven",
				"a stainless steel oven",
				"an LG stainless steel oven"
				);
		Appliances coffeemaker = new Appliances(
				"coffeemaker",
				"a grey coffee maker",
				"a grey Keruig a grey coffee maker"
				);
		Fixture[] kitchItems = {fridge, microwave, oven, coffeemaker};
		kitchen.setItems(kitchItems);
		
		//Dining Room and items  
		Room dining = new Room(
				"The Dining Room",
				"a formal dining room",
				"A formal dining room, in it a long custom redwood table and a golden chandelier. "+ "\n"
					+ "From here, there is a sleek modern livng room to the north." + "\n"
					+ "To the east is a newly renovated kitchen with marble countertops."
				);
		this.rooms[3] = dining;
		Furniture diningTable = new Furniture(
				"dining table",
				"a long oak dining table",
				"a long oak dining table that seats 16"
				);
		Furniture bench1 = new Furniture(
				"long bench",
				"a long bench",
				"a long bench under the dining room table"
				);
		Furniture bench2 = new Furniture(
				"short bench",
				"a shorter bench",
				"a short bench under the dining room table"
				);
		Appliances chandelier = new Appliances(
				"chandelier",
				"a golden chandelier",
				"a golden chandelier"
				);
		Fixture[] dinItems = {diningTable, bench1, bench2, chandelier};
		dining.setItems(dinItems);
		
		//Bedroom and items
		Room bedroom = new Room(
				"The Bedroom",
				"a gorgeous bedroom",
				"An elegant bedroom with an Alaskan king bed and a mahogany desk. To the west, a claw-foot "
						+ "\n soaker tub can be seen inside a bathroom with floor to ceiling tiles." + "\n"
						+ "To the north is a walk in closet with a solid mirror wall and a shoe carousel."
				);	
		this.rooms[4] = bedroom;
		Furniture bed = new Furniture(
				"bed",
				"an Alaska king bed",
				"an Alaska king bed with a white quilted headboard"
				);
		Appliances lamp1 = new Appliances(
				"right corner light",
				"a gold tri-pod light",
				"a 90 inch tall gold tri-pod light"
				);
		Appliances lamp2 = new Appliances(
				"left corner light",
				"a gold tri-pod light",
				"a 90 inch tall gold tri-pod light"
				);
		Furniture desk = new Furniture(
				"desk",
				"a large mahogny desk",
				"a large mahogny desk with plush pink office chairs"
				);
		Fixture[] bedItems = {bed, lamp1, lamp2, desk};
		bedroom.setItems(bedItems);
		
		//Walk-in closet and items
		Room walkIn = new Room(
				"The walk in closet",
				"a very spacious walk in closet",
				"A very spacious walk in closet, in it a solid mirror wall and a shoe carousel. "+ "\n"
						+ "The cream colored carpet leads out to the bedroom, where there is "+ "\n"
						+ "an Alaskan king bed and a large mahogany desk."
				);	
		this.rooms[5] = walkIn;
		Clothing dress = new Clothing(
				"dress",
				"a little black dress",
				"a short black dress with a sweetheart neckline and empire waist"
				);
		Clothing blouse = new Clothing(
				"blouse",
				"a blue blouse",
				"a blue and white pin striped blouse with pearl buttons"
				);
		Clothing shorts = new Clothing(
				"shorts",
				"a pair of denim shorts",
				"a pair of Levi's high waisted dark wash distressed denim shorts"
				);
		Clothing blazer = new Clothing(
				"blazer",
				"a tan blazer",
				"a tan blazer with shoulder pads and white piping"
				);
		Clothing cardigan = new Clothing(
				"cardigan",
				"a cream cardigan",
				"a large cozy cream colored waffle knit cardigan with balloon sleeves"
				);
		Clothing skirt = new Clothing(
				"skirt",
				"a pink plaid skirt",
				"an a-line skirt with two front zipper details"
				);
		Fixture[] walkInItems = {dress, blouse, shorts, skirt, blazer, cardigan};
		walkIn.setItems(walkInItems);
		
		//Bathroom and Items
		Room bathroom = new Room(
				"The Bathroom",
				"an elegant bathroom",
				 "A bathroom with a claw-foot soaker tub and floor to ceiling tiles."+ "\n"
						+ "From here, there is a sleek modern livng room to the west." + "\n"
						+ "To the south is a newly renovated kitchen with marble countertops."
				);
		this.rooms[6] = bathroom;
		
		Furniture toilet = new Furniture(
				"toilet",
				"a white porcelain toilet",
				"a white porcelain toilet"
				);
		Appliances light = new Appliances(
				"light",
				"a gold light fixture",
				"a gold light fixture"
				);
		Fixture[] bathItems = {toilet,light};
		bathroom.setItems(bathItems);
		
		//Guest Room and items
		Room guestRoom = new Room(
				"The Guest Bedroom",
				"a gorgeous guest bedroom",
				"A gorgeous guest bedroom, in it a queen bed with floating oak bedframe and a cozy"
				+ "\n reading nook. From here, there is a sleek modern livng room to the north." + "\n"
						+ "To the east is a newly renovated kitchen with marble countertops."
				);	
		this.rooms[7] = guestRoom;
		Furniture bed2 = new Furniture(
				"bed",
				"an queen bed",
				"a queen bed with a floating oak bedframe"
				);
		Appliances lamp3 = new Appliances(
				"right corner light",
				"a gold tri-pod light",
				"a 90 inch tall gold tri-pod light"
				);
		Fixture[] guestItems = {bed2, lamp3};
		guestRoom.setItems(guestItems);
		
		//Garage and items
		Room garage = new Room(
				"The Garage",
				"a 12 car garage",
				"A spacious, well-light 12 car garage, in it many luxury cars. "+ "\n"
						+ "The exit is to the north into the newly renovated kitchen with marble countertops."
				);	
		this.rooms[8] = garage;
		Car lambo = new Car(
				"lambo",
				"a green lambourghini",
				""
				);
		Car lexus = new Car(
				"lexus",
				"a silver lexus es330",
				""
				);
		Car rover = new Car(
				"rover",
				"a range rover",
				""
				);
		Car jeep = new Car(
				"jeep",
				"a white jeep patriot",
				""
				);
		Car ford = new Car(
				"ford",
				"a red ford F150",
				""
				);
		Car corvette = new Car(
				"corvette",
				"an orange corvette",
				""
				);
		Car benz = new Car(
				"benz",
				"a matte black G-wagon",
				""
				);
		Car toyota = new Car(
				"toyota",
				"a blue toyata camry",
				""
				);
		Car cadillac = new Car(
				"cadillac",
				"a silver cadillac CTS",
				""
				);
		Car rolls = new Car(
				"rolls",
				"a black Rolls Royce",
				""
				);
		Car camaro = new Car(
				"camaro",
				"a yellow camaro",
				""
				);
		Car vw = new Car(
				"vw",
				"a pink volks wagen convertible",
				""
				);
		
		Fixture[] garItems = {lambo, lexus, rover, jeep, ford, corvette, benz, toyota,vw, rolls, camaro, cadillac};
		garage.setItems(garItems);
		
		//set the starting room to the living room
		this.startingRoom = bedroom;
		
		// setting exits to create home layout
		foyer.setExits(new Room[] {null, null, living, null});
		living.setExits(new Room[] {guestRoom, dining, bathroom, foyer});
		guestRoom.setExits(new Room[] {null, living, null, null});
		dining.setExits(new Room[] {living, null, kitchen, null});
		kitchen.setExits(new Room[] {bathroom, garage, null, dining});
		garage.setExits(new Room[] {kitchen, null, null, null});
		bathroom.setExits(new Room[] {null, kitchen, bedroom, living});
		bedroom.setExits(new Room[] {walkIn, null, null, bathroom});
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
