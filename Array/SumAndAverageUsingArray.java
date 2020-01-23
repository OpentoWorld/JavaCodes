package Array;

public class SumAndAverageUsingArray {
    public static  void main(String[] args){
        double numbers[]={10.2,5.5,6.2,3.0,5.9};
        double result=0;
        for(int i=0;i<numbers.length;i++){
            result+=numbers[i];
        }
        System.out.println("Sum="+result);
        System.out.println("Average="+result/numbers.length);
    }
}
