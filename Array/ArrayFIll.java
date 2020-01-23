package Array;

import java.util.Arrays;

public class ArrayFIll {
    public static void main (String args[]) {
        int arr[] = new int[10];
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Enter 10 numbers in the array");
        //for(int i=0;i<arr.length;i++)

        //arr[i]=sc.nextInt();
        Arrays.fill(arr, 6);

        System.out.println("The entered numbers are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
