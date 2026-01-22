class Human{
    private String name;
    private int age;

    //default constructor
    public Human(){
        age=21;
        name="Shivanshu";
    }

    //parameterized Constructor
    public Human(int age, String name){
        this.age=age;
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class Constructors {
    public static void main(String a[]){
        Human obj = new Human();
        Human obj1=new Human(30,"John");
        System.out.println(obj.getName()+" : "+obj.getAge());
        System.out.println(obj1.getName()+" : "+obj1.getAge());
    }
}
