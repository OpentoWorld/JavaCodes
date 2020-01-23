package Constructor;

class Employee {
    int id;
    int salary;
    static String company = "SRT Traders";
    Employee(int i,int s){
        id=i;
        salary=s;
    }
    void display(){
        System.out.println("Id"+id+"\nSalary:"+salary+"\nCompany:"+company);
    }
}
class JavaStaticKeyword{
    public static void main(String[] args) {
        Employee e1=new Employee(1,20000);
        e1.display();
        Employee e2=new Employee(2,40000);
        e2.display();
    }
}