package ControlStatement.Iteration;

class ForEachLoop {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4};
        int sum=0;
        for (int i:arr) {
            sum=sum+i;
        }
        System.out.println("Addition of array element:"+sum);
    }
}
