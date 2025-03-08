package Bank;


/* If default constructor is there then no need to call superkey as its already called during the cration of object*/
public class Loan extends Account{
    private int loanAmount;
    Loan(int Balance, String AccountName, String Password, int loanAmount){
        super(Balance,AccountName,Password);
        this.loanAmount = loanAmount;
    }

    void LoanAccountDetaisl(){
        printDetails();
        System.out.println("Loan Amout = "+loanAmount);
    }

    public static void main(String[] args) {
        Loan loan = new Loan(50000, "Vivek","1234",5800000);
        loan.LoanAccountDetaisl();
    }
}
