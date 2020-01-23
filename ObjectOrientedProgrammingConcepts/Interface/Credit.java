package ObjectOrientedProgrammingConcepts.Interface;

class Credit implements Money {
    @Override
    public void operation() {
        System.out.println("Crediting the money!!");
    }
}
