package ObjectOrientedProgrammingConcepts.Interface.MultipleInheritance;

class Animal implements Run,Walk {
    @Override
    public void run() {
        System.out.println("Walkable Interface!!");
    }

    @Override
    public void walk() {
        System.out.println("Runnable Interface");
    }
}
