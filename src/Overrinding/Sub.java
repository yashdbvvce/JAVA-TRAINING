package Overrinding;
public class Sub extends Super {
    public void Virat(){
        System.out.println("GOAT");
    }

    public static void main(String[] args) {
        // Depends on the object created at right !.
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
