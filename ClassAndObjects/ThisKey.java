package ClassAndObjects;


class ClassInfo{
    int rollno;
    String name;
    ClassInfo(int rollno,String name){
        this.name=name;
        this.rollno=rollno;
    }
    void display(){
        System.out.println(rollno+ "   "+name);
    }
}
class ThisKey {
    public static void main(String[] args) {
        ClassInfo ci=new ClassInfo(10,"John");
        ci.display();
    }
}
