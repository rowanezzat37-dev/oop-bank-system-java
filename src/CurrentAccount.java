public class CurrentAccount extends Account{
    private double overdraftLimit;
    public CurrentAccount(){}
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
        super(accountNumber,balance);
        setOverdraftLimit(overdraftLimit);
    }
    public void setOverdraftLimit(double overdraftLimit){
        if (overdraftLimit<=0){
            this.overdraftLimit=overdraftLimit;
        } else {
            this.overdraftLimit = -1* overdraftLimit;
        }
    }
    public double getOverdraftLimit(){
        return overdraftLimit;
    }
    @Override
    public void decrease(double amount){
        if (balance-amount>=getOverdraftLimit()){
            this.balance-=amount;
        }else {
            System.out.println("Balance is not Enough!!!");
        }
    }
    @Override
    public void decrease(int amount){
        if (balance-amount>=getOverdraftLimit()){
            this.balance-=amount;
        }else {
            System.out.println("Balance is not Enough!!!");
        }
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Overdraft Limit: "+ -getOverdraftLimit()+"\n");
    }

}
