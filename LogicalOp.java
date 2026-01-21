public class LogicalOp {
    public static void main(String a[]){
        int x=7;
        int y=5;
        int p=5;
        int q=9;

        // &- AND, |- OR, !- NOT 
        // &&- AND , ||- OR (this is short ciruit means if first condition is checked and sufficient
        // to generate the result then it dont check for other condition)
        boolean res= x>y && p<q;
        System.out.println(res);

        res= x>y && p>q;
        System.out.println(res);

        res= x>y || p<q;
        System.out.println(res);

        res= x>y;
        System.out.println(!res);
    }
}