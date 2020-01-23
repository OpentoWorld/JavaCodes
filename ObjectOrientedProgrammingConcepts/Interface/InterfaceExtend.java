package ObjectOrientedProgrammingConcepts.Interface;

class InterfaceExtend implements Runnable{
    @Override
    public void walk() {
        System.out.println("Interface:Walkable");
    }

    @Override
    public void run() {
        System.out.println("Interface:Rnnable");
    }

    public static void main(String[] args) {
        InterfaceExtend interfaceExtend=new InterfaceExtend();
        interfaceExtend.walk();
        interfaceExtend.run();
    }
}
