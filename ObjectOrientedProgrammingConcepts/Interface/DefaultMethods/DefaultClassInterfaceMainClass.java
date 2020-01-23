package ObjectOrientedProgrammingConcepts.Interface.DefaultMethods;

class DefaultClassInterfaceMainClass implements Welcome{
    @Override
    public void hello(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        DefaultClassInterfaceMainClass de=new DefaultClassInterfaceMainClass();
        de.say();
        de.hello("Happy learning!!!");
    }
}
