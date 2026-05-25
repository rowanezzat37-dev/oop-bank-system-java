public class Main {
    public static void main(String[] args) {
        System.out.println("==================\n  SAVING ACCOUNT\n==================");
        SavingsAccount sa = new SavingsAccount(1,1000,5);
        sa.print();
        sa.decrease(500);
        sa.print();
        sa.effectOfInterestRate();
        sa.increase(100);
        sa.print();
        sa.decrease(700);
        sa.print();

        System.out.println("\n\n==================\n CURRENT ACCOUNT\n==================");
        CurrentAccount ca = new CurrentAccount(2,1500,200);
        ca.print();
        ca.decrease(500);
        ca.print();
        ca.increase(-50);
        ca.print();
        ca.decrease(1100);
        ca.decrease(300);
        ca.print();
    }
}

