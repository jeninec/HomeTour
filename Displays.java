package game;

import fixtures.Room;

public class Displays {
	
	public  void printRoom(Player p) {
		Room[] currExits = p.getCurrentRoom().getExits();
		String[] dirs = {"north", "south","east","west"};
		System.out.println("~~~~~~~~~~ CURRENT ROOM ~~~~~~~~~~" +
				"\nYou are currently in " + p.getCurrentRoom().name + "\n"
				+ "\n" + p.getCurrentRoom().longDesc + "\n");
		System.out.println("Exits: ");
		
		for (int i=0; i<currExits.length; i++) {
			if(currExits[i] != null) {
				System.out.println(dirs[i] + ": " + currExits[i].shortDesc);
			}
		}
				
		System.out.println("\n" + "What would you like to do next?");
		
	}
	
	public void printInstructions() {
		System.out.println( "~~~~~~~~~~ INSTRUCTIONS ~~~~~~~~~~" +
				"\nHere are the rules of the game: " +
				"\nActions: go, quit" +
				"\nDirections: north, south, east and west" +
				"\nUse the command 'go' and whichever direction you choose" +
				" to navigate through the house." + 
				"\nLike this: 'go east'" +
				"\nType 'quit' to end the game anywhere.\n"
				); //"\nType quit at entrances and exits to leave the house"
	}
	
	
	
}
