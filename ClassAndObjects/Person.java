package Class;

class PersonInfo{
    int age;
    String name;
    public PersonInfo(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return("Name:"+this.name+"\nAge:"+this.age);
    }
}

class Person {
    public static void main(String[] args) {
        PersonInfo personInfo=new PersonInfo("Rakesh Thakur",23);
        System.out.println(personInfo.toString());
    }
}
