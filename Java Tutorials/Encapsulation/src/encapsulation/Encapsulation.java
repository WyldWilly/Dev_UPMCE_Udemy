
package encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
        /*
            Encapsulation - Packing properties that way,
                            so there is no direct access to them
                            from other classes
        */


        BankAccount a = new BankAccount();
        
        //a.setBalance(1000);
        a.deposit(1500);        
        if (a.withdraw(240))
            System.out.println("OK");
        else
            System.out.println("NOT ENOUGH MONEY");
        
        System.out.println(a.getaBalance());
        
    }
    
}

class BankAccount
{
    public BankAccount()
    {
        balance = 1000;    
    }
    
    private int balance;
    
    int getaBalance() //getter
    {
        return balance;
    }
    
    private void setBalance(int amount)
    {
        /*
        Can set tons of conditions
        */
        balance = amount;    
    }

    boolean withdraw(int amount)
    {
        if(balance > amount)
//            balance -= amount;
            setBalance(balance - amount);
        else
            return false;
        
        return true;
    }
    
    boolean deposit(int amount)
    {
        setBalance(balance + amount);
        return true;
    }
    
}