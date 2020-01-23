package ObjectOrientedProgrammingConcepts.Polymorphism.MethodOverloading;

public class MethodOverloading {
    static void area(int b,int h){
        System.out.println("Area of Triangle:"+(0.5*b*h));
    }
    static void area(int r){
        System.out.println("Area of Circle"+(22*r*r/7));
    }

    public static void main(String[] args) {
        area(7);
        area(6,8);
    }
}
