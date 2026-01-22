class Human{
    //private members can only be accessed inside the parent class 
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        //this keyword stores the refernece of the current object
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationAndGettersSetters {
    public static void main(String a[]){
        Human obj= new Human();
        obj.setAge(21);
        obj.setName("shivanshu");
        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}
