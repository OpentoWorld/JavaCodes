package ObjectOrientedProgrammingConcepts.Inheritance.HasARelationship;

public class EmployeeInfo {
    int id;
    Name name;
    EmployeeInfo(int id ,Name name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println("Employee----\nId:"+id);
        System.out.println("Name--------\nFirst name:'"+name.first+"' Last name:'"+name.last+"'");
    }
}
