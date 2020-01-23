package Methods;

import java.util.Scanner;

class MethodOverloading {
    private static float shape(float radius){
        return(22*radius*radius/7);//area of a circle
    }
    private static float shape(float length,float breadth){
        return (length*breadth);//area of rectangle
    }
    private static float shape(float length,float breadth,float height){
        return (length*breadth*height);//volume of cuboid
    }

    public static void main(String[] args) {
        System.out.println("Area of Circle"+shape(7));
        System.out.println("Area of Rectangle:"+shape(50,60.2f));
        System.out.println("Surface Area of Cuboid:"+shape(12,13,6.5f));
    }
}
