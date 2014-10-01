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
	if(account > 100000000 && account < 999999998){
	    this.account = account;
	}else{
	    this.account = 999999999;
	    System.out.println("Error | Account Number out of bounds");
	}
    }

    public void setPin(int pin){
	this.pin = pin;
    }

    public boolean Deposit(float b){
	if(b > 0){
	    this.balance += balance;
	    System.out.println("Account Balance: " + String.valueOf(balance));
	    return true;
	}else{
	    System.out.println("Error | invalid deposit | Account Balance: " + String.valueOf(balance));
	    return false;
	}
    }
    
    public boolean Withdraw(float x){
	if(x > 0){
	    if ((balance - x) < 0){
		System.out.println("Invalid transaction; Account Balance: " + String.valueOf(balance));
		return false;
	    }else{
		balance -= x;
		System.out.println("Account Balance: " + String.valueOf(balance));
		return true;
	    }
	}else{
	    System.out.println("Error | Invalid withdrawal" + "\n Account Balance: " + String.valueOf(balance));
	    return false;
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

    public String toString(){
	return String.valueOf(account) + String.valueOf(balance) + username;
    }

}
