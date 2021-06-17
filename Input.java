package game;

import java.util.Scanner;

import fixtures.Room;

public class Input {
	
	// create display for printing rooms
	private static Displays display = new Displays();
	
	//create Scanner for game input
	private static Scanner sc = new Scanner(System.in);
	
	public static String[] collectInput() { 
		 String input = sc.nextLine();
		 String [] inputs = input.split(" ");   
		 return inputs; 	
	  }

	
	public static void parse (String[] command, Player p) {
		
		String action = command[0].toUpperCase().intern();
		System.out.println("act in In: "+action);
		switch (action) {
			case ("GO"):
				System.out.println("\nHere we go...");
				break;
			case ("quit"):
				 //gameRunning = false;
				break;
			
		}
		
		Room currRoom = p.getCurrentRoom();
		
		/* Right now we've refactored room assignment to one if statement  
		 * but currently getting null pointer on line 47! I'm not sure which is null
		 * current Room (variable currRoom) or the getExit method is returning null
		 */
		
		String dir = command[1].toUpperCase().intern();
		
		Room moveTo = currRoom.getExit(dir);
		
		
		if  (currRoom.getExit(dir) != null) {
			p.setCurrentRoom(currRoom.getExit(dir));
		}
		else {
			System.out.println("Sorry there's no room in that direction\n" + 
					"Please select another direction.\n"
					+ "~~~~~~~~~~  TRY AGAIN ~~~~~~~~~~");
		}
		
		//sc.close();
	}

	
}