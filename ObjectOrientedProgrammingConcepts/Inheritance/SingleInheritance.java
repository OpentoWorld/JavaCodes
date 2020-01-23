package ObjectOrientedProgrammingConcepts.Inheritance;

class Vehicle{
    void property(){
        System.out.println("Wheels!!");
    }
}
class Bike extends Vehicle{
    void run(){
        System.out.println("Bike is running!!");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Bike b=new Bike();
        b.run();
        b.property();
    }
}
