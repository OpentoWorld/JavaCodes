package ControlStatement.Selection_DecisionMakingStatements;

import java.util.Scanner;

class Nested_If_ElseStatements {
    private static void division(float percentage){
        if (percentage>=60&&percentage<=100)
            System.out.println("First Division!!");
        else if (percentage>=50&&percentage<60)
            System.out.println("Second Division!!");
        else if(percentage>=40&&percentage<50)
            System.out.println("Third Division!!");
        else if(percentage>=0&&percentage<40)
            System.out.println("Fail");
        else if(percentage<0)
            System.out.println(percentage+" can't be negative number!!");
        else
            System.out.println(percentage+" can't be greater than 100%");
    }
    public static void main(String[] args) {
        System.out.println("Enter your percentage:");
        Scanner sc=new Scanner(System.in);
        float percent=sc.nextFloat();
        division(percent);
    }
}
