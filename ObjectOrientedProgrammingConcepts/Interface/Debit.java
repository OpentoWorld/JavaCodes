package ObjectOrientedProgrammingConcepts.Interface;

class Debit implements Money {
    @Override
    public void operation() {
        System.out.println("Debiting the money!!");
    }
}
