public class bankaccount{
    public static void main(String[]args){
	
    }
    float balance;
    int account, pin;
    String username, pass;

    //constructors
    public bankaccount(float balance, int account,String username , String pass, int pin){
	Deposit(balance);
	setAccount(account);
	setUser(username);
	setPass(pass);
	setPin(pin);
    }

    public bankaccount(){
	setPin(9999);
	setAccount(999999999);
	
    }

    //set methods

    public void setUser(String user){
	username = user;
    }

    public void setPass(String pass){
	this.pass = pass;
    }

    public void setAccount(int account){
	this.account = account;
    }

    public void setPin(int pin){
	this.pin = pin;
    }

    public void Deposit(float b){
	this.balance += balance;
    }
    
    public boolean Withdraw(float x){
	if ((balance - x) < 0){
	    return false;
	}
	else{
	    return true;
	}
    }

    public boolean authenticate(int account, String password){
        if(this.account == account && password.equals(pass)){
	    return true;
	}

        else{
	    return false;
	}
    }

}
