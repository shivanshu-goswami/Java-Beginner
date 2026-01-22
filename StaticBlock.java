class Mobile{
    String brand;
    int price;
    static String name;

    static{
        //this block is executed before object creation as the class loads by class loader in JVM
        //but if object isnt created then class also doesnt load and static block is also not executed
        //but we can explicitly loead class by Class.forName("Mobile") even when object isnt created
        name="Phone";
        System.out.println("inside static block");
    }

    public Mobile(){
        //can initialise static variable here too but it will be initialised again and again with
        //creation of every new object thats why created it in static block so that it will be initialised
        //just once there
        brand="local";
        price=100;
        System.out.println("inside constructor");
    }
}

public class StaticBlock {
    public static void main(String a[])throws ClassNotFoundException{
       Class.forName("Mobile"); //to explicitly load class when object not created, add exception too as written above
        // Mobile m= new Mobile();
        // Mobile n=new Mobile();

    }
}
