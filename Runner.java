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
		//game:  label
		while(gameIsRunning) {
			//if 
			display.printRoom(p);
			String[] input = Input.collectInput();
			Input.parse(input,p);
			
			//boolean gameIsRunning = Input.parse(input,p);
//			System.out.println("//parsed//");
//			System.out.println("running="+(Input.running = false));
//			if (gameIsRunning = false) {
//				System.out.println("//quiting?//");
//				endGame();
//				//sc.close();
//				break game;
//			}
		}
		
		System.out.println("You're leaving...\n"
				+ "~~~~~~~~~~  GOODBYE! ~~~~~~~~~~");
		
		
	}
	
	public static void endGame() {
		gameIsRunning = false;
	}

}
