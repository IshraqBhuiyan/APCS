import java.util.Random;

public class Adventurer{
    private String name;
    private int HP, STR, DEX, INT;

    private Random rand = new Random();

    public Adventurer(){
	this("Lester");
    }
    
    public Adventurer(String name){
	this(name, 20, 0, 0, 0);
    }

    public Adventurer(String name, int HP, int STR, int DEX, int INT){
	this.setName(name);
	this.setHP(HP);
	this.setSTR(STR);
	this.setDEX(DEX);
	this.setINT(INT);
    }

    //toString method

    public String toString(){
	return this.getName() + " " + this.getHP();
    }

    //Adventurer Class Actions

    public boolean hit(Adventurer other, int attack){
	int chance = rand.nextInt(attack);
	if(chance < 2){
	    return true;
	} else{
	    return false;
	}

    }

    public void Attack(Adventurer other){
	if(hit(other, 3)){
	    other.setHP(other.getHP() - 1);
	    System.out.println(this.getName() + " dealt 1 damage to " + other.getName());
	}else{
	    System.out.println(this.getName() + " attempted to hit " + other.getName() + " but failed!");
	}
	System.out.println(this.getStats());
	System.out.println(other.getStats());
    }

    public void SpecialAttack(Adventurer other){
	if(hit(other, 5)){
	    int damage = rand.nextInt(5) + 2;
	    other.setHP(other.getHP() - damage);
	    System.out.println(this.getName() + " successfully dealt a special " + damage + " damage to " + other.getName());
	} else {
	    System.out.println(this.getName() + " failed his/her special attack on " + other.getName());
	}
	System.out.println(this.getStats());
	System.out.println(other.getStats());
    }



    //Get Methods
    public String getName(){
	return name;
    }

    public int getHP(){
	return HP;
    }


    public int getSTR(){
	return STR;
    }

    public int getDEX(){
	return DEX;
    }

    public int getINT(){
	return INT;
    }

    public String getStats(){
	return this.getName() + 
	    "\tHP " + this.getHP() +
	    "\tSTR " + this.getSTR() +
	    "\tDEX " + this.getDEX() +
	    "\tINT " +this.getINT() ; 
    }

    //Set Methods

    public void setHP(int health){
	HP = health;
    }

    public void setSTR(int strength){
	STR = strength;
    }

    public void setDEX(int dexterity){
	DEX = dexterity;
    }

    public void setINT(int intelligence){
	INT = intelligence;
    }

    public void setName(String s){
	name = s;
    }

}
