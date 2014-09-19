public class PersonalGreeter {
    private String greeting, name;
    
    //constructors
    public PersonalGreeter(String greeting,String name){
	setGreet(greeting);
	setName(name);
    }

    public PersonalGreeter(String name){
	setGreet("Hello");
	setName(name);
    }

    public PersonalGreeter(){
	setGreet("Hello");
	setName("Bob");
    }

    //methods

    public void setGreet(String x){
	greeting = x;
    }

    public void setName(String x){
	name = x;
    }

    public String getGreet(){
	return greeting;
    }

    public String getName(){
	return name;
    }

    public String greet(){
	return greeting + " " + name + "!";
    }
}
