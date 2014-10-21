import java.util.Random;

public class Rogue extends Adventurer{
    private int endurance;
    private Random rand = new Random();

    public Rogue(){
	this("Steve");
    }

    public Rogue(String name){
	this(name, 5);
    }
    
    public Rogue(String name, int endurance){
	super(name, 20, 0, 10, 0);
	this.setEndurance(endurance);
    }

    //rogue methods

    public void SpecialAttack(Adventurer other){
	int damage = rand.nextInt(5) + 4;
	if(super.hit(other, 5)){
	    other.setHP(other.getHP() - damage);
	    this.setEndurance(this.getEndurance() - 2);
	    System.out.println(this.getName() + " dealt " + damage + " to " + other.getName());
	}else{
	    System.out.println(this.getName() + " missed " + other.getName());
	}
	System.out.println(this.getStats());
	System.out.println(other.getStats());
    }

    //get methods

    public int getEndurance(){
	return endurance;
    }

    
    //set methods

    public void setEndurance(int endurance){
	this.endurance = endurance;
    }
}
