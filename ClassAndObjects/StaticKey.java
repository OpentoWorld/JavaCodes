package Class;

class EmployeeInfo1{
    int id;
    int salary;
    static String company="SRT Traders";
    EmployeeInfo1(int i,int s){
        id=i;
        salary=s;
    }
    void display(){
        System.out.println(id+" "+salary+" "+company);
    }
}
class StaticKey {
    public static void main(String[] args) {
        EmployeeInfo1 ei=new EmployeeInfo1(25,25000);
        ei.display();
    }
}
