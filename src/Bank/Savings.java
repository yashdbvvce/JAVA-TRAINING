package Bank;

public class Savings extends Account{
    int balance = 1000000;
    int savingsAmount;
    Savings(int savingsAmount){
        this.savingsAmount = savingsAmount;
    }

    void savingprintDetails(){
        System.out.println(this.savingsAmount);
        System.out.println(super.balance);
    }

    public static void main(String[] args) {
        Savings s = new Savings(500000);
        System.out.println(s.balance);
        s.printDetails();
    }
}
