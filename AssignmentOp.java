public class AssignmentOp {
    public static void main(String a[]){
        int num1=10;
        int num2=7;
        int res1=num1+num2; //addition
        System.out.println(res1);

        int res2=num1-num2; //subtract
        System.out.println(res2);

        int res3=num1*num2; //multiply
        System.out.println(res3);

        int res4=num1/num2;  //divide
        System.out.println(res4);

        int res5=num1%num2; //remainder(modulus)
        System.out.println(res5);

        num1=num1+2;
        num1+=2; //same as num1=num1+2
        num1-=2;
        num1/=2;
        num1*=2;

        num1++; //post increment
        num1--; //post decrement

        ++num1;  //pre increment
        --num1;  //pre decrement

        //difference betweem pre and post

        //post
        int d1=7;
        int res6=d1++; //first assign then increment
        System.out.println(res6); //output=7 

        //pre
        int d2=7;
        int res7=++d2; //first increment then assign
        System.out.println(res7);
    }
}
