public class Wizard extends Adventurer{
    private int Mana;

    public Wizard(){
	super("Tim");
    }

    //wizard methods

    public void Attack(Adventurer other){

    }

    public void SpecialAttack(Adventurer other){
	
    }

    //get methods

    public int getMana(){
       return Mana;
    }

    
    //set methods

    public int setMana(int Mana){
	this.Mana = Mana;
    }


    
}