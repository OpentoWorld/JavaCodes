package ObjectOrientedProgrammingConcepts.Inheritance;

class Vehicle2{
    void property(){
        System.out.println("Vehicle is moving!!");
    }
}
class Bike1 extends Vehicle2{
    void run(){
        System.out.println("Bike has 2 wheels!!");
    }
}
class Car1 extends Vehicle2{
    void run(){
        //It will display, as two run function are there
        System.out.println("Car has 4 wheels, so it can get motion to run!!");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car1 c1=new Car1();
        c1.run();
        c1.property();
    }
}
