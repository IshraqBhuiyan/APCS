public class Warrior extends Adventurer{
    private int BonusHealth, rage;
    private String warcry;

    public Warrior(){
	super("Lief");
    }


    //warrior methods

    public void Attack(Adventurer other){
	
    }

    public void SpecialAttack(Adventurer other){
	
    }

    //get methods

    public int getHP(){
	return BonusHealth + super.getHP();
    }

    public int getRage(){
	return rage;
    }


    //set methods

    public void setRage(int rage){
	this.rage = rage;
    }

}