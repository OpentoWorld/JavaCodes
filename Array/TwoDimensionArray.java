package Array;

import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String[] args){
        int[][] array=new int[2][2];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<2;i++)
            for (int j=0;j<2;j++)
                array[i][j]=scanner.nextInt();
        System.out.println("Array elements are:");
        for (int i=0;i<2;i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(array[i][j] + "   ");
            System.out.println();
        }
    }
}
