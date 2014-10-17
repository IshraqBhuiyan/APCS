public class Rogue extends Adventurer{
    private int endurance;

    public Rogue(){
	super("Steve");
    }

    //rogue methods

    public void SpecialAttack(Adventurer other){
	
    }

    //get methods

    public int getEndurance(){
	return endurance;
    }

    
    //set methods

    public void setEndurance(int endurance){
	this.endurance = endurance;
    }