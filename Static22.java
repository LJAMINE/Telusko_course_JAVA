
class Mobile {

    String brand;
    int price;
    String name;
    // static variable
    static  String type;

    public void show(){
      System.out.println(brand+" "+price+" "+name+" "+type);
    }


    // static method
    public static void show1(){
        System.out.println("in static method");
    }
}

public class Static22 {

    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "apple";
        obj1.name = "iph12";
        obj1.price = 12;
        
        Mobile obj2 = new Mobile();
        obj2.brand = "sumsung";
        obj2.name = "XE";
        obj2.price = 121;
        
        Mobile.type="mobilephone";

        obj1.show();
        obj2.show();

        Mobile.show1();
    }
}
