package game;

public class Runner {
	//initialize a RoomManager
	private static RoomManager manager = new RoomManager(9);
	
	private static Displays display = new Displays();
	
	//controls game loop
	private static boolean gameIsRunning = true;
	
	//Main application method
	public static void main(String[] args) {
		//builds the rooms
		manager.init();
		
		Player p = new Player();
		display.printInstructions();
		
		p.setCurrentRoom(manager.getStartingRoom());
		
		//game loop
		while(gameIsRunning) {
			display.printRoom(p);
			String[] input = Input.collectInput();
			Input.parse(input,p);
		}
		
		System.out.println("Bye! See ya later!");
		
		
	}
	
	public static void endGame() {
		gameIsRunning = false;
	}

}
