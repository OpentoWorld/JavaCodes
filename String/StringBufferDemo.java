package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sf=new StringBuffer("Happy Coding");
        StringBuffer newString=sf.append("!!!");
        System.out.println(newString);
        newString.insert(0,'w');
        System.out.println(newString);
        newString.reverse();
        System.out.println(newString);
    }
}
