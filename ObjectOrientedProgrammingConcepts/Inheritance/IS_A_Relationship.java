package ObjectOrientedProgrammingConcepts.Inheritance;

class Manager{
    int salary=100000;
}
class Employee1 extends Manager{
    int id=15;
    int empSal=12500;
}
public class IS_A_Relationship {
    public static void main(String[] args) {
        Employee1 e1=new Employee1();
        System.out.println("Employee\nId:"+ e1.id+"\nSalary:"+e1.empSal);
        System.out.println("\n\nManager\nSalary:"+e1.salary);
    }
}
