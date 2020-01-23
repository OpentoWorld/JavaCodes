package ObjectOrientedProgrammingConcepts.Inheritance.HasARelationship;

public class HasImplementationMainClass {
    public static void main(String[] args) {
        Name name=new Name("Alex","Dsouza");
        EmployeeInfo employeeInfo=new EmployeeInfo(1,name);
        employeeInfo.display();
    }
}
