package game;

import java.util.Scanner;

import fixtures.Fixture;
import fixtures.Room;
import fixtures.Appliances;

public class Input {
	
	//create Scanner for game input
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean running = true;
	
	public static String[] collectInput() { 
		 String input = sc.nextLine();
		 String [] inputs = input.split(" ");   
		 return inputs; 	
	  }

	
	public static void parse (String[] command, Player p) {
		
		String action = command[0].toUpperCase().intern();
		
		
		switch (action) {
			case ("GO"):
				System.out.println("\nHere we go...");
			if (command.length>1 && running) {
				String dir = command[1].toUpperCase().intern();
				Room currRoom = p.getCurrentRoom();

				if  (currRoom.getExit(dir) != null) {
					p.setCurrentRoom(currRoom.getExit(dir));
				}
				else {
					System.out.println("Sorry there's no room in that direction\n" + 
							"Please select another direction.\n"
							+ "~~~~~~~~~~  TRY AGAIN ~~~~~~~~~~");
				}
				
			}
				break;
			case ("PUT"):
				System.out.println("Try it on!");
				break;
				
			case ("SEE"):
				
				seeItems(p);
			//System.out.println("In see switch");
				break;	
				
			case ("ON"):
				interact(p,action);
				break;
				
			case ("OFF"):
				interact(p,action);
				break;
				
			case ("QUIT"):
				//return false;
				quitGame();
				//break;
			
		}
	
		
		
	}
	
	public static boolean quitGame() {
		return false;
	}
	
	private static void seeItems(Player p) {
		
		if (p.getCurrentRoom().getItems() != null) {
			Fixture[] roomItems = p.getCurrentRoom().getItems();
			System.out.println("This room has: ");
			
			for (int f=0; f< roomItems.length; f++) {
				System.out.println(roomItems[f].shortDesc + " ");
				if (roomItems[f] instanceof Appliances) {
					System.out.println("   *can turn on and off");
					//((Appliances) roomItems[f]).powerOn();
				}
				
			}
			System.out.println("\n");
		}
	}
	
	private static void interact(Player p, String state) {
		
		if (p.getCurrentRoom().getItems() != null) {
			Fixture[] roomItems = p.getCurrentRoom().getItems();
			
			for (int f=0; f< roomItems.length; f++) {
				if (roomItems[f] instanceof Appliances && state == "ON") {
					((Appliances) roomItems[f]).powerOn();
				}
				if (roomItems[f] instanceof Appliances && state == "OFF") {
					((Appliances) roomItems[f]).powerOff();
				}
				
			}
			System.out.println("\n");
		}
	}

}