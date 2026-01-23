public class Inheritance {
    public static void main(String a[]){
        //We can write all the classes(inherited ones also) in this file also
        MultiLevelInheritance obj = new MultiLevelInheritance();
        int r1= obj.add(4,6);
        int r2= obj.sub(15,5 );
        int r3=obj.multi(2,5);
        int r4=obj.div(20,2);
        double r5=obj.power(2,5);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}
