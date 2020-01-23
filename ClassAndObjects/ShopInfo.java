package Class;

class OverloadedConstructor{
    int itemid;
    int price;
    String name;
    public OverloadedConstructor(int a,int b){
        itemid=a;
        price=b;
        name="XYZ";
    }
    public OverloadedConstructor(int i,int p,String n){
        itemid=i;
        price=p;
        name=n;
    }

    @Override
    public String toString() {
        return ("Item ID:"+itemid+"\nPrice:"+price+"\nName:"+name);
    }
}
class ShopInfo {
    public static void main(String[] args) {
        OverloadedConstructor oc1=new OverloadedConstructor(1,100);
        OverloadedConstructor oc2=new OverloadedConstructor(2,200,"Somobai");
        System.out.println(oc1.toString());
        System.out.println(oc2.toString());
    }
}
