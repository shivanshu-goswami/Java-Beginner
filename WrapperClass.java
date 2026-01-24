public class WrapperClass {
    public static void main(String a[]){
        int num= 5; //primitive
       // Integer num1= new Integer(7);
        //Integer num1= new Integer(num);//boxing, this line(not error) means syntax is deprecated means
                                            //it can get removed in future versions
        Integer num1=num; //auto boxing
        System.out.println(num1);

       // int num2= num1.intValue(); //unboxing
         int num2=num1;             //auto-unboxing
        System.out.println(num2);

        String str="10";
        int num3= Integer.parseInt(str);
        System.out.println(num3);


    }
}