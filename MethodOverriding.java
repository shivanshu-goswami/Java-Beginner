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

public class MethodOverriding {
    public static void main(String a[]){
        B obj = new B();
        obj.show(); //B "show" overrides A "show" method
    }
}
