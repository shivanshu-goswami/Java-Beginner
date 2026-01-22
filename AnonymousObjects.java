class Car{
    private String brand;
    private int year;

    public Car(){
        brand="Tata";
        year=2026;
        System.out.println("inside constructor");
    }

    public void show(){
        System.out.println(brand+" "+year);
    }
}

public class AnonymousObjects {
    public static void main(String a[]){
        new Car(); //anonymous object;

        //2 new objects got created and their show method was called but their referenced was not stored
        new Car().show();
        new Car().show();
    }
}
