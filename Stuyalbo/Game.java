import java.util.Random;
import java.util.Scanner;

Public class Game{
    
    public static void main(String[]args){
	Random rand = new Random();
	Scanner in = new Scanner();
	Adventurer player;
	
	System.out.println("Select a class to play. \n a) Warrior \n b) Wizard \n c) Rogue");
	String ClassSelect = in.nextLine();
	while(!ClassSelect.equals("a") || !ClassSelect.equals("b") || !ClassSelect.equals("c")){
	    System.out.println("Invalid choice");
	    ClassSelect = in.nextLine();
	}

	if(ClassSelect.equals("a")){
	    player = new Warrior();
	} else if(ClassSelect.equals("b")){
		player = new Wizard();
	} else{
	    player = new Rogue();
	}

	Adventurer opponent = new Adventurer();

	System.out.println("Oh noes, an opponent has appeared: " + opponent.getStats());
	System.out.println("This is you: " + player.getStats());
	
    }
}
