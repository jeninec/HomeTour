package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
	
	private static RoomManager manager = new RoomManager(9);
	
	public static void main(String[] args) {
		//manager.gameRunning = true;
		//start the game, load the rooms
		manager.init();
		// create a player
		Player p = new Player();
		p.setCurrentRoom(manager.getStartingRoom());
		
		printRoom(p);
		
		//ask for player input
		String[] input = collectInput(); 
		parse(input,p);
		 
		
	}
	
	private static void printRoom(Player p) {
		Room[] currExits = p.getCurrentRoom().getExits();
		String[] dirs = {"north", "south","east","west"};
		System.out.println("You are currently in " + p.getCurrentRoom().name + "\n"
				+ "\n" + p.getCurrentRoom().longDesc + "\n");
		System.out.println("Exits: ");
		
		for (int i=0; i<currExits.length; i++) {
			if(currExits[i] != null) {
				System.out.println(dirs[i] + ": " + currExits[i].shortDesc);
			}
		}
				
		System.out.println("\n" + "Where would you like to go next?");
		
	}
	
	// refactor to add Input class to handle parsing user input
	
	 private static String[] collectInput() { 
		 Scanner sc = new Scanner(System.in);
		 String input = sc.nextLine();
		 String [] inputs = input.split(" "); 
		 //inputs[0] = sc.next(); 
		 sc.close();
		 return inputs; 
	  }
	 
	
	private static void parse (String[] command, Player p) {
		Room currRoom = p.getCurrentRoom();
		switch (command[0]) {
			case ("go"):
				System.out.println("Here we go...");
				break;
			
		}
		
		Room[] exits = currRoom.getExits();
		
		switch (command[1]) {
			
		case ( "north"):
			System.out.println("N");
			if (currRoom.getExit("north") != null) {
				p.setCurrentRoom(currRoom.getExit("north"));
				System.out.println("N-if");
				printRoom(p);
				break;
			}
			else if (currRoom.getExit("north") == null){
				System.out.println("Sorry there's no room in that direction." + "\n" + 
					"Please select another direction.");
				//printRoom(p);
				System.out.println("N-else");
				break;
			}

		case ("south"):
			if (exits[1] != null) {
				p.setCurrentRoom(exits[1]);
				printRoom(p);
				break;
			}
			else if (exits[1] == null){
				System.out.println("Sorry there's no room in that direction." + "\n" + 
					"Please select another direction.");
				System.out.println("S-else");
				break;
			}
		
		case ("east"):
			if (exits[2] != null) {
				p.setCurrentRoom(exits[2]);
				printRoom(p);
				break;
			}
			else if (exits[2] != null){
				System.out.println("Sorry there's no room in that direction." + "\n" + 
					"Please select another direction.");
				//printRoom(p);
				System.out.println("E-else");
				break;
			}
		
		case ("west"):
			
			if (exits[3] != null) {
				p.setCurrentRoom(exits[3]);
				printRoom(p);
				break;
				//manager.init();
			}
			else if (exits[3] == null){
				System.out.println("Sorry there's no room in that direction." + "\n" + 
					"Please select another direction.");
				//printRoom(p);
				System.out.println("W-else");
				break;
			}
			
		}
		
	}
	
	

}
