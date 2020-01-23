package Class;

class ConstructorChaining {
    public String name;
    public int marks;

    public ConstructorChaining(){
        this("Rakesh");
    }
    public ConstructorChaining(String name){
        this(name,70);
    }
    public ConstructorChaining(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    void display(){
        System.out.println("Name:"+name+"\nMarks:"+marks);
    }

    public static void main(String[] args) {
        ConstructorChaining cc=new ConstructorChaining();
        cc.display();
    }
}
