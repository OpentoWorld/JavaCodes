package Constructor;
//Assigning null values to student id and name
//Automatic creation of constructor
class Student1{
    int sid;
    String name;
    public void display(){
        System.out.print("Id:"+sid+"\nName:"+name);
    }
}
public class StudentDefaultConstructor {
    public static void main(String[] args) {
        Student1 student1=new Student1();
        student1.display();
    }
}
