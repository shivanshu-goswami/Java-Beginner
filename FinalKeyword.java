/*final*/ class P{ //if use final here then line 7 will throw error as final keyword stops inheritance
    public /*final */ void show(){ //if used final here then line 8 throw error cause final keyword stops method overriding
        System.out.println("in P");
    }
}

class Q extends P{
    public void show(){
        System.out.println("in Q");
    }
}

public class FinalKeyword {
    public static void main(String a[]){
        // same as const keyword in c++
        final int num=10;
      //  num=11; //since we declared num as final, cant reassign a value to it
        System.out.println(num);


        
    }
}
