package ControlStatement.Selection_DecisionMakingStatements;

import java.util.Scanner;

class If_ElseStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("First number:");
        int a=sc.nextInt();
        System.out.printf("Second number:");
        int b=sc.nextInt();
        int big;
        if (a>b)
            big =a;
        else
            big=b;
        System.out.println("Larger="+big);
    }
}
