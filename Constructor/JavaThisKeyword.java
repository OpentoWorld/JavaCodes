package Constructor;

class ClassInfo{
    int rollno;
    String name;
    ClassInfo(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    void display(){
        System.out.println(rollno+" "+name);
    }
}
public class JavaThisKeyword {
    public static void main(String[] args) {
        ClassInfo ci1=new ClassInfo(10,"John");
        ClassInfo ci2=new ClassInfo(20,"Alice");
        ci1.display();
        ci2.display();
    }
}
