package Constructor;

class Message{
    Message(){
        this("Annie");
        System.out.println("Welcome to Java Programming");
    }
    Message(String n){
        System.out.println(n);
    }
}
public class JavaThisKeyword1 {
    public static void main(String[] args) {
        Message m=new Message();
    }
}
