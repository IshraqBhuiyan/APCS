import java.util.Random;

public class Warrior extends Adventurer{
    private int  rage;
    private String warcry;
    private Random rand = new Random();

    public Warrior(){
	this("Lief");
    }

    public Warrior(String name){
	this(name,"Valhalllaaaaa!!", 3, 4);
    }

    public Warrior(String name, String warcry, int STR, int rage){
	super(name, 25, STR, 0, 0);
	this.setWarcry(warcry);
	this.setRage(rage);
    }

    //warrior methods

    public void Attack(Adventurer other){
	if(super.hit(other, 3)){
	    other.setHP(other.getHP() - this.getSTR());
	    System.out.println(this.getName() + " dealt " + this.getSTR() + " damage to " + other.getName());
	} else {
	    System.out.println(this.getName() + " missed " + other.getName());
	}
    }

    public void SpecialAttack(Adventurer other){
	int damage = rand.nextInt(rage) + this.getSTR();
	if(super.hit(other, 5)){
	    other.setHP(other.getHP() - damage);
	    System.out.println(this.getName() + " dealt " + damage + " damage to " + other.getName() + " in a special attack!");
	} else {
	    System.out.println(this.getName() + " missed " + other.getName());
	}
    }

    //get methods

    public int getRage(){
	return rage;
    }

    public String getStats(){
	return super.getStats() + "\tRage " + this.getRage();
    }


    //set methods

    public void setRage(int rage){
	this.rage = rage;
    }
    
    public void setWarcry(String warcry){
	this.warcry = warcry;

    }
}
