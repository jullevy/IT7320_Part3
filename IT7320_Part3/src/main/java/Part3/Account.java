package Part3;

public class Account {

   private double balance; 

    
    public Account(double initialBalance) {
        
        if (initialBalance > 0.0) {
            this.balance = initialBalance;
        }
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double debit(double withdrawalAmount) {
        double newBalance = balance - withdrawalAmount;
        setBalance(newBalance);
        getBalance();
        
        return newBalance;
    }    
    
    public double credit(double amount) {
        balance = balance + amount; 
        setBalance(balance);
        getBalance();
        
        return balance;
    }

}