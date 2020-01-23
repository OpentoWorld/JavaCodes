package ObjectOrientedProgrammingConcepts.Abstraction.Mobile;

abstract class Mobile {
    Mobile(){
        System.out.println("Mobile is the base class!!");
    }
    abstract void run();
    void dialNumber(){
        System.out.println("Number are dialed from Nokia mobile!!!");
    }
}
