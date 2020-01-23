package ObjectOrientedProgrammingConcepts.Encapsulation;

class Employee{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class GetterAndSetter {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setName("Rakesh Thakur");
        System.out.println("Desired Output is----------"+employee.getName());
    }
}
