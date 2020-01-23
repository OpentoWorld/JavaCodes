package Constructor;

class Student{
    int sid;
    String name;
    Student(int i,String n){
        sid=i;
        name=n;
    }

    @Override
    public String toString() {
        return("Id:"+sid+"\nName:"+name);
    }
}
public class StudentParameterizedConstructor {
    public static void main(String[] args) {
        Student s=new Student(4,"rakesh");
        System.out.println(s.toString());
    }
}
