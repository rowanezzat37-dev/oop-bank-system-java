public class Account {
    protected int accountNumber;
    protected double balance;
    public Account(){}
    public Account(int accountNumber, double balance){
        setAccountNumber(accountNumber);
        setBalance(balance);
    }
    public void setAccountNumber(int accountNumber){
        if (accountNumber>0){
            this.accountNumber=accountNumber;
        }else {
            System.out.println("Invalid Account number!!!");
        }
    }
    public void setBalance(double balance){
        if (balance>=0){
            this.balance=balance;
        }else {
            System.out.println("Invalid Balance!!!");
        }
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public void print(){
        System.out.println("Account Number: "+ getAccountNumber());
        System.out.println("Balance: "+ getBalance());
    }
    public void increase(double amount){
        if (amount>0){
            this.balance+=amount;
        }else {
            System.out.println("Invalid Amount!!!");
        }
    }

    public void increase(int amount){
        if (amount>0){
            this.balance+=amount;
        }else {
            System.out.println("Invalid Amount!!!");
        }
    }
    public void decrease(double amount){
        if (balance-amount>=0){
            this.balance-=amount;
        }else {
            System.out.println("Balance is not Enough!!!");
        }
    }
    public void decrease(int amount){
        if (balance-amount>=0){
            this.balance-=amount;
        }else {
            System.out.println("Balance is not Enough!!!");
        }
    }
}
