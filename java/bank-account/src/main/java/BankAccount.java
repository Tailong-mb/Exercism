public class BankAccount{
    //Atributes 
    private int account = 0;
    private boolean isOpen = false;

    //Methods
    public void open(){
        this.isOpen = true;
    }

    public void close(){
        this.isOpen = false;
    }

    public synchronized void deposit(int amount) throws BankAccountActionInvalidException{
        if(!this.isOpen)
            throw new BankAccountActionInvalidException("Account closed");
        else if (amount < 0)
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        else
            this.account += amount;
    }

    public synchronized void withdraw(int amount) throws BankAccountActionInvalidException{
        if (this.account == 0)
            throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        else if (!this.isOpen)
            throw new BankAccountActionInvalidException("Account closed");
        else if (amount < 0)
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        else if ((this.account - amount < 0))
            throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        else
            this.account -= amount;
    }

    public int getBalance() throws BankAccountActionInvalidException{
        if(this.isOpen)
            return this.account;
        else    
            throw new BankAccountActionInvalidException("Account closed");
    }
}