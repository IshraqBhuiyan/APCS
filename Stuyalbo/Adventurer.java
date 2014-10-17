public class Adventurer{
    private String name;
    private int XP, HP, STR, DEX, INT;

    public Adventurer(){
	this("Lester");
	XP = 0;
	HP = 20;
    }
    
    public Adventurer(String s){
	setName(s);
	XP = 0;
	HP = 20;
    }

    //toString method

    public String toString(){
	return name + " " + (String)HP;
    }

    //Adventurer Class Actions

    public boolean hit(Adventurer other){

    }

    public void Attack(Adventurer other){
	if(hit(other)){
	    other.setHP(other.getHP - 1);
	    System.out.println("YARRRRRR");
	}else{
	    System.out.println("You missed!");
	}
    }

    public void SpecialAttack(Adventurer other){

    }



    //Get Methods
    public String getname(){
	return name;
    }

    public int getHP(){
	return HP;
    }

    public int getXP(){
	return XP;
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

    public void setXP(int experience){
	XP = experience;
    }

    public void setName(String s){
	name = s;
    }

}