public class IfElse {
    public static void main(String a[]){
        int x=5,y=2,z=9;
        if(x>y && x>z){
            System.out.println("x won");
        }
        //can avoid y > x condition cause in above 'if', it is already checked in a different way
        else if(y>x && y>z){
            System.out.println("y won");
        }
        else{
            System.out.println("z won");
        }

        // ternary operator
        int n=5;
        String result = (n%2==0)? "Even" : "Odd";
        System.out.println(result);
    }
}
