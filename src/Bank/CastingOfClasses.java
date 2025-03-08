package Bank;

public class CastingOfClasses {
    public static void main(String[] args) {
        // Up Casting Sub to Supe - No Problem
        Account a = new Savings(6000);
        // a.savingprintDetails() // Not possible
        a.printDetails();// Possible


        // Down casting
         Savings s = (Savings)a;
        s.savingprintDetails();
        // Has details of only super class
    }
}
