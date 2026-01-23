class A{
    public void show(){
        System.out.println("in A");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B");
    }
}
class C extends A{
    public void show(){
        System.out.println("in C");
    }
}
class D{

}

public class DynamicMethodDispatch {
    public static void main(String a[]){
        A obj = new A();
        obj.show();

        obj= new B(); //will call method of B cause obj now stores the reference of B object in static memory
        obj.show();

        obj=new C(); //same reason as above but this time for C
        obj.show();

       // obj = new D(); can't assign reference of D as it is not a extended class of A
    }
}
