public class Loops {
    public static void main(String a[]){
        /* While loop
        int i=1;
        while(i<=3){
            System.out.println("Hi"+" "+i);
            int j=1;
            while(j<=2){
                System.out.println("Hello There"+" "+j);
                j++;
            }
            i++;
        }
            */

          /* do-while loop
           int i=5;
           do{
            System.out.println("Hi"+" "+i);
            i++;
           }while(i<=4);
          */

           for(int i=1;i<=5;i++){
            System.out.println("DAY "+i);
               for(int j=9;j<=17;j++){
                if(j<=12){
                    System.out.println("TIME :"+j+" AM");
                }
                else{
                    System.out.println("TIME :"+(j-12)+" PM");
                }
               }
           }
    }
}
