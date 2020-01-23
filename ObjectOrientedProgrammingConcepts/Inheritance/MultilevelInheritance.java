package ObjectOrientedProgrammingConcepts.Inheritance;

class Vehicle3{
    void run3(){
        System.out.println("Vehicle is the parent class");
    }
}
class Bike3 extends Vehicle3{
    void run2(){
        System.out.println("Bike has some properties of Vehicle");
    }
}
class Cycle3 extends Bike3{
    void run1(){
        System.out.println("Cycle has some properties of bike");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Cycle3 c=new Cycle3();
        c.run1();
        c.run2();
        c.run3();
    }
}
