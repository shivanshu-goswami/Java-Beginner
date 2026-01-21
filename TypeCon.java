class TypeCon{
    public static void main(String a[]){
        byte b=127;
        int c=12;
        //error incompatible type
        //b=a;

        b=(byte)c; //explicit conversion

        c=b; //implicit conversion cause sizeof(int)>sizeof(float)

        byte n1=10;
        byte n2=30;
        int res=n1*n2;  //type promotion, no need of explicit conversion
        System.out.println(res);

        byte num1=100;
        int num2=258;
        num1=(byte)num2; //num2>range of byte, so result = num2%256 where 256 = range of byte[-128 to 127]
        System.out.println(num1);
    }
}
