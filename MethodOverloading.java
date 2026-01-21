class abc{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2,int n3){
        return n1+n2+n3;
    }
    //can't overload by just changing return type but if parameters aree also changed then 
    //changing return type will also be fine and won't throw error
    public double add(double n1, int n2){
        return n1+n2;
    }
    /* this will give error cause changing only return type wont overload the method
    public double add(int n1, int n2){
        return n1+n2;
    }
        */
}

public class MethodOverloading {
    public static void main(String a[]){
        abc obj=new abc();

       int res1= obj.add(4,6);
       System.out.println(res1);

       double res2= obj.add(4.5,6);
       System.out.println(res2);

       int res3= obj.add(1,2,7);
       System.out.println(res3);

    }
}
