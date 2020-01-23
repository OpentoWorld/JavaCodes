package ObjectOrientedProgrammingConcepts.Interface.DefaultMethods;

interface Welcome {
    //Default method
    default void say(){
        System.out.println("Hello, Welcome to edureka!!!");
    }
    //Abstract method
    void hello(String msg);
}
