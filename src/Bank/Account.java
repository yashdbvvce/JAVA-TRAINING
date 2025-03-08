package Bank;

public class Account {
    int balance;
    private String AccName;
    private String password;

    Account(int balance, String AccName, String password){
        this.balance = balance;
        this. AccName = AccName;
        this.password = password;
    }

    Account(){
        System.out.println("Account Constrcuted with default values");
        this.balance = 100;
        this.AccName = "Acc Name";
        this.password = "ABCD";
    }

    void deposit(int amount){
        if (amount > 0){
            this.balance += amount;
            System.out.println("Transaction successfull = +"+amount);
            printDetails();
        }
        else{
            System.out.println("Transaction failure");
            printDetails();
        }

    }

    void withdraw(int amount){
        if(amount <= balance){
            this.balance -= amount;
            System.out.println("Transaction successfull = +"+amount);
            printDetails();
        }
        else {
            System.out.println("Transaction failure");
            printDetails();
        }
    }

     void printDetails(){
        System.out.println("Account Name = "+this.AccName);
        System.out.println("Balance = "+this.balance);
    }

    public static void main(String[] args) {
        Account vivek = new Account(1000,"Vivek Suresh","1234");
        vivek.withdraw(5000);
    }

}
