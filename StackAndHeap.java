class Calculator{
    int num=5; //its an instance variable and not local variable
    public int add(int n1, int n2){ //method stored in stack space and each method has its own stack
        return n1+n2;
    }
}

public class StackAndHeap {
    public static void main(String a[]){
      Calculator obj=new Calculator();//refrence stored in stack but actual space allocated in heap
      Calculator obj1= new Calculator(); //same as above explaination
      obj.num=8;
      System.out.println(obj.num); //in heap memory allocated to both obj is different
      System.out.println(obj1.num); // so changing num in one object space wont affect other
    }
}
