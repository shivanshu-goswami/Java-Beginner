class C{
    public void show1(){
        System.out.println("in C show");
    }
}

class D extends C{
    public void show2(){
         System.out.println("in D show");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String a[]){
      C obj =(C)new D(); // upcasting, even if you dont write (C) for upcasting , it does it behind the scene
      obj.show1();
      //obj.show2(); gives error cause since object is of D but reference is of C and C has no idea of D

      D obj1=(D) obj; //downcasting, converting the same class object but with other class refernce into
                      // its original class reference
      obj1.show1(); //cause obj is of reference D and D has idea of both show1, show2 cause of inheritance
      obj1.show2();
    }
}
