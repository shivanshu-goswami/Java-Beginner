class Mobile{
    String brand;
    int price;
    static String name;

    public static void show(Mobile obj){
        //cant access non static variable in static method, only way to do is to pass an object as
        //argument while makinh method call and then to use non-static variable through that object
        System.out.println(obj.brand+":"+obj.price+":"+name);
    }
}

public class StaticMethod {
    public static void main(String a[]){
        Mobile m= new Mobile();
        m.brand="Apple";
        m.price=1500;
        Mobile.name="iphone";

       // m.show(m); work with this also but call static method through class name is preferred
        Mobile.show(m);
    }
}
