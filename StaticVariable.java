class Mobile{
    String brand;
    int price;
    //String name;
    static String name;

    public void show(){
        System.out.println(brand+":"+price+":"+name);
    }
}

public class StaticVariable {
    public static void main(String a[]){
        Mobile m= new Mobile();
        m.brand="Apple";
        m.price=1000;
       // m.name="iphone"; //since name is static now so can be accessed this way to but its better
                         //to acces it through classname.property i.e, Mobile.name=iphone
        Mobile.name="iphone";


        Mobile n= new Mobile();
        n.brand="Samsung";
        n.price=1200;
        //n.name="Android"; //acces static variable through class name now
        Mobile.name="Android";


       // m.name="realme"; //changing it at one place will change it in all object cause it shares the 
                         //same memory to all object
        Mobile.name="realme";


        m.show();
        n.show();

    }
}
