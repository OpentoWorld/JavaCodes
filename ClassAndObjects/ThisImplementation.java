package ClassAndObjects;

class Message{
    Message(){
        this("Annie");
        System.out.println("Welcome to Java");
    }
    Message(String name){
        System.out.println(name);
    }
}
class ThisImplementation {
    public static void main(String[] args) {
        Message message=new Message();
    }
}
