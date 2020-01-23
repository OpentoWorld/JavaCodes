package String;

class StringBuilderOperation {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Happy Learning!");
        System.out.println(s);
        s.insert(0,'a');
        System.out.println(s);//inserting new value to string builder
        s.delete(0,2);
        System.out.println(s);
    }
}
