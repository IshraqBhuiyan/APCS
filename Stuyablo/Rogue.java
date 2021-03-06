import java.util.Random;

public class Rogue extends Adventurer{
    private int stamina;

    public Rogue(){
	this("Steve");
    }

    public Rogue(String name){
	this(name, 20);
    }
    
    public Rogue(String name, int stamina){
	super(name, 30, 8, 10, 10);
	this.setStamina(stamina);
    }

    //rogue methods

    public void Attack(Adventurer other){
	Random r = new Random();
	System.out.println(this + " attacks " + other);
	if(hit(other)){
	    int damage = r.nextInt(4)+(getSTR()/2)+1;
	    other.setHP(other.getHP() - damage);
	    System.out.println(" and deals " + damage + " damage!");
	}else{
	    System.out.println(" but unfortunately misses!");
	}
	setStamina(getStamina() + 1);
    }

    public void SpecialAttack(Adventurer other){
	Random r = new Random();
	if(getStamina()>=10){
	    setStamina(getStamina()-2);
	    System.out.println(this + " tries to backstab " + other);
	    if(hit(other) || hit(other)){
		int damage = r.nextInt(getSTR()+getDEX()/2)+2;
		other.setHP(other.getHP() - damage);
		System.out.println(" and causes " + other + " to bleed for " + damage + " damage!");
	    }else{
		System.out.println(" but instead hits a squirrel!");
	    }
	}else{
	    System.out.println("not enough stamina!");
	}
    }

    //get methods

    public int getStamina(){
	return stamina;
    }

    public String getStats(){
	return super.getStats() + " Stamina " + getStamina();
    }
    
    //set methods

    public void setStamina(int stamina){
	this.stamina = stamina;
    }

    public void defaultStats(){
	this.setHP(30);
	this.setStamina(20);
	this.setLife(true);
    }
}
