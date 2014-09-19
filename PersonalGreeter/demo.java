public class demo{
    public static void main(String[]args){
	PersonalGreeter hai, haiDere, haiAgain;
	hai = new PersonalGreeter("greeting", "name"); //testing name + greeting constructor + related methods
	System.out.println(hai.greet());
	haiDere = new PersonalGreeter("name"); //testing only name constructor + related methods
	System.out.println(haiDere.greet());
	haiAgain = new PersonalGreeter(); //testing default constructor + related methods
	System.out.println(haiAgain.greet());
    }
}
