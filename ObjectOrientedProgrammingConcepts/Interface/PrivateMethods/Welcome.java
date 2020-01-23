package ObjectOrientedProgrammingConcepts.Interface.PrivateMethods;

interface Welcome {
    default void say(){
        sayhello();
    }
    //Private method
    private void sayhello(){
        System.out.println("Hi, I am private method\nWelcome to Edureka!!");
    }
}
