package Abstraction;


interface i{
     int a = 100;
}

interface A{
    int a = 200;
}

public class Sample implements i, A {
    static {
        System.out.println(i.a);
    }

    public static void main(String[] args) {
        Sample s = new Sample();
    }

}
