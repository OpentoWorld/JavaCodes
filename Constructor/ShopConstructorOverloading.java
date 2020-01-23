package Constructor;

class Shop{
    int itemid;
    int price;
    String name;
    Shop(int itemid,int price){
        this.itemid=itemid;
        this.price=price;
        this.name="XYZ";
        System.out.println("itemid=" + this.itemid + ", price=" + this.price + ", name=" + this.name);
    }
    Shop(int itemid,int price,String name){
        this.itemid=itemid;
        this.price=price;
        this.name=name;
        System.out.println("itemid=" + this.itemid + ", price=" + this.price + ", name=" + this.name);
    }
}
public class ShopConstructorOverloading {
    public static void main(String[] args) {
        Shop s1=new Shop(1,200);
        Shop s2=new Shop(2,300,"ABC");
    }
}
