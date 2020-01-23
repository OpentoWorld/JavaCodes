package ObjectOrientedProgrammingConcepts.Polymorphism.MethodOverloading;

public class MethodOverload {
    public void display(int x){
        System.out.println("Passes Integer Parameter!!");
    }
    public void display(String y){
        System.out.println("Passes String Parameter!!");
    }
    public static void main(String[] args) {
        MethodOverload methodOverload=new MethodOverload();
        methodOverload.display(2);
        methodOverload.display("s");
    }
}
