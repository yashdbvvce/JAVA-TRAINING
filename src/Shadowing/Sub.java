package Shadowing;

public class Sub extends Super {
    public static void Virat(){
        System.out.println("GOAT");
    }

    public static void main(String[] args) {
        Super s1 = new Super();
        s1.Virat();

        Sub s2 = new Sub();
        s2.Virat();

        Super s3 = new Sub();
        s3.Virat();

        Sub s4 = (Sub) s3;
        s4.Virat();
    }
}
