public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(){}

    public SavingsAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber,balance);
        setInterestRate(interestRate);
    }
    public void setInterestRate(double interestRate){
        if (interestRate>=0){
            this.interestRate=interestRate/100;
        }else {
            System.out.println("Invalid Interest Rate!!!");
        }
    }
    public double getInterestRate(){
        return this.interestRate;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Interest Rate: "+ (getInterestRate()*100)+"%\n");
    }
    public void effectOfInterestRate(){
        System.out.println("After Interest Rate: "+ (getBalance()+ getInterestRate()*this.getBalance()));
    }

}

