public class SwitchStatement {
    public static void main(String a[]){
       /*  int n=2;
        switch(n){
            case 1:
                System.out.println("Monday");
                break; //if you dont write break then after matching with "case x" it will print x
                       // as well as will print all the cases below "case x" too
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number");
        }
    }
*/

/* 
     String day="wed";
     String res="";
     switch(day){
        case "sat","sun"-> res= "6am";
        case "mon" -> res="8am";
        default -> res="7am";
     }
     System.out.println(res);

     */

     /* 
     String day="wed";
     String res="";
     res=switch(day){
        case "sat","sun"->  "6am";
        case "mon" -> "8am";
        default -> "7am";
     };
     System.out.println(res);
     */

     String day="wed";
     String res="";
     res=switch(day){
        case "sat","sun" : yield  "6am";
        case "mon" : yield "8am";
        default : yield "7am";
     };
     System.out.println(res);

   }
}
