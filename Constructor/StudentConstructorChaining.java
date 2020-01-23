package Constructor;

public class StudentConstructorChaining {
    public String sname;
    public int smarks;
    public StudentConstructorChaining(){
        this("Rakesh");
    }
    public StudentConstructorChaining(String sname){
        this(sname,70);
    }
    public StudentConstructorChaining(String sname,int smarks){
        this.smarks=smarks;
        this.sname=sname;
    }
    void display(){
        System.out.println("Student name:"+sname+"\nStudent Marks:"+smarks);
    }

    public static void main(String[] args) {
        StudentConstructorChaining scc=new StudentConstructorChaining();
        scc.display();
    }
}
