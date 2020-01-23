package ObjectOrientedProgrammingConcepts.Interface;

public class InterfaceDemo {
    public static void main(String[] args) {
        Money c=new Credit();
        c.operation();
        Money d=new Debit();
        d.operation();
    }
}
