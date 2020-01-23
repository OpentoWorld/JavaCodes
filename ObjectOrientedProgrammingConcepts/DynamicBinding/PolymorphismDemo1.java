package ObjectOrientedProgrammingConcepts.DynamicBinding;

class Vehicle1{
    void run(){
        System.out.println("Vehicle is running!!");
    }
}
class Bus extends Vehicle1{
    void run(){
        System.out.println("Bus is running safety!!");
    }
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        Vehicle1 vehicle1=new Vehicle1();
        vehicle1.run();
    }
}
