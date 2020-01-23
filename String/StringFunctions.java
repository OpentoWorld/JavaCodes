package String;

public class StringFunctions {
    public static void main(String[] args){
        String name="Sky is blue!!";
        //Finding ending character
        System.out.println(name.endsWith("!!"));
        //Finding starting character
        System.out.println(name.startsWith("sky"));
        //Finding the length of a string
        System.out.println(name.length());
        //Index of a character
        System.out.println(name.indexOf("is"));
        //Replace a particular string
        System.out.println(name.replace("!!","**"));
        //String to uppercase
        System.out.println(name.toUpperCase());
        //String to lowercase
        System.out.println(name.toLowerCase());
    }
}
