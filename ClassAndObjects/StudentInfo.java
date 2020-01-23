package Class;
//default constructor will automatically create constructor while compiling
class DefaultConstructor {
    int roll;
    String name;
    void display(){
        System.out.println(roll+" "+name);
    }
}

public class StudentInfo{
    public static void main(String[] args) {
        DefaultConstructor st=new DefaultConstructor();
        st.display();
    }
}
