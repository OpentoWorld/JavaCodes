package Class.Function;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("----------:Menu driven program:----------");

        System.out.println("1.Circle \n2.Triangle \n3.Rectangle \n4.Circle \nEnter number:");
        int c=scanner.nextInt();
        switch (c) {
            //Area of a circle statement
            case 1:
                System.out.printf("Enter radius:");
                double radius = scanner.nextDouble();
                AreaOfCircle areaOfCircle = new AreaOfCircle();
                System.out.println("Area of a Circle:" + areaOfCircle.Circle(radius));
                break;
                //Area of a triangle
            case 2:
                System.out.printf("Enter Base and Height:");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
                System.out.println("Area of a Triangle:" + areaOfTriangle.Triangle(base, height));
                break;
            case 3:
                System.out.printf("Enter Length and Breadth:");
                double length = scanner.nextDouble();
                double breadth = scanner.nextDouble();
                AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
                System.out.println("Area of a Rectangle:" + areaOfRectangle.Rectangle(length, breadth));
                break;
            case 4:
                System.out.printf("Enter Side:");
                double side = scanner.nextDouble();
                AreaOfSquare areaOfSquare = new AreaOfSquare();
                System.out.println("Area of a Square:" + areaOfSquare.Square(side));
                break;

            default:
                System.out.println("Bye");
                break;
        }
    }
}
