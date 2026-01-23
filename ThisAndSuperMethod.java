class A extends Object{ //no need to write "extend Object" , it is inbuilt written there
    public A(){
        super(); //this too is inbuilt and no need to explicitly write , it calls constructor of 
                 //its super(parent) class first
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in Para A");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){
        //super();
        //super(5); //o/p ->in Para A , in Para B
        this(); //calls the constructor of the base class first then base class constructor calls super
                //class so o/p-> ibn A, in B, in Para B
        System.out.println("in Para B");
    }
}

public class ThisAndSuperMethod {
    public static void main(String a[]){
       // B obj = new B();  o/p-> in A, in B
      // B obj =new B(5); //o/p-> in A, in Para B with super
     // B obj = new B(5); //op-> in A, in B, in Para B
        
    }
}
