class Laptop{
    String model;
    int price;
    //both these methods are of Object class and if we dont write them here then they will be called 
    // from Object class and those inbuilt methods output will be 
    // returned (which is a hexadecimal value of hash code)
    public String toString(){ 
        return "model : "+model +" price : "+ price;
    }
  //in inbuilt equal method of object class, it checks this==l , ie, refernce og both object
  //or hexadecimal value of both object same or not, if yes, only then both objects are considered equal
    public boolean equals(Laptop l){
        return ((this.model==l.model)&&(this.price==l.price));
    }
}

public class ObjectClassToStringHashcode {
    public static void main(String a[]){
        Laptop l1= new Laptop();
        l1.model="Apple";
        l1.price=100;

        Laptop l2=new Laptop();
        l2.model="Samsung";
        l2.price=120;

        System.out.println(l1); //same as printing l1.toString();
        System.out.println(l1.toString());
        System.out.println(l1.equals(l2)); 
    }
}
