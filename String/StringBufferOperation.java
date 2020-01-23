package String;

class StringBufferOperation {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Welcome to Edureka!");
        s.append("Happy Learning");
        System.out.println(s);

        //insert method
        s.insert(0,'w');
        System.out.println(s);

        StringBuffer sb=new StringBuffer("Hello");
        sb.replace(0,2,"hel");
        System.out.println(sb);

        //delete method
        sb.delete(0,1);
        System.out.println(sb);
        System.out.println(s.reverse());
        System.out.println(s.capacity());
    }
}
