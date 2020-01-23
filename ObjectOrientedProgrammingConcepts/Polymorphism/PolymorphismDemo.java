package ObjectOrientedProgrammingConcepts.Polymorphism;

class Man{
    void pay(){
        System.out.println("Paying Bill!!");
    }
}
class Millionaire extends Man{
    void pay(){
        System.out.println("Millionaire is paying bill and giving tips also");
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        Man obj=new Millionaire();
        obj.pay();
    }
}
