package Abstraction;
public class Earth extends Ddemo {
    public void run(){
        System.out.println("overriden method");
    }

    public static void main(String[] args) {
        Ddemo e1=new Earth();
        e1.walk();
    }
    public void walk()
    {
        System.out.println("method Earth");
    }
}