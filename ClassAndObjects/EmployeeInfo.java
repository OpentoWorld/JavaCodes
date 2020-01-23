package Class;

import java.util.Scanner;

class ParameterizedConstructor{
    int id;
    String name;
    public ParameterizedConstructor(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return ("Id:"+this.id+"\nName:"+this.name);
    }
}
public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        String name=sc.next();
        ParameterizedConstructor param=new ParameterizedConstructor(id,name);
        System.out.println(param.toString());
    }
}
