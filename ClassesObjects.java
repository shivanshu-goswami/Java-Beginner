class Calculator{
    int a; //same as we initialise propertry in c++
    public int add(int n1, int n2){  //initialising method
        int sum=n1+n2;
        return sum;
    }
}

public class ClassesObjects{
    public static void main(String a[]){
        int num1=2;
        int num2=8;
        Calculator obj = new Calculator();
        int result =obj.add(num1,num2);
        System.out.println(result);
    }
}
