package ObjectOrientedProgrammingConcepts.Inheritance;

class Vehicle4{
    String wheel="Vehicle move because of wheels";
}
class Trucks extends Vehicle4{
    String wheel="Truck has 4 wheels";
    void printWheels(){
        System.out.println(wheel);
        System.out.println(super.wheel);//print wheel of vehicle4 class
    }
}
public class JavaSuperKeyword {
    public static void main(String[] args) {
        Trucks trucks=new Trucks();
        trucks.printWheels();
    }
}
