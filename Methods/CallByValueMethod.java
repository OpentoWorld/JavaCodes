package Methods;

class CallByValueMethod {
    static int data=5;
    static int operation(int data){
        data=data*2/6;
        return data;
    }

    public static void main(String[] args) {
        System.out.println("Before operation value of data is:"+data+" Value of operation is:"+operation(data));
        CallByValueMethod.data=6;
        System.out.println("After operation value of data is:"+data+" Value of operation is:"+operation(data));
    }
}
