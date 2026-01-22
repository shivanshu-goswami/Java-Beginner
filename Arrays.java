public class Arrays {
    public static void main(String a[]){
        /* 1-D Array
        int nums[]={1,2,3,4}; //static allocation in java same as cpp
        System.out.println(nums[1]);

        int num1[]= new int[4];
        num1[0]=5;
        num1[1]=6;
        num1[2]=7;
        num1[3]=8;
        for(int i=0;i<4;i++){
            System.out.println(nums[i] +" "+num1[i]);
        }
        */
       
        //2-D Array in Java
        int nums[][]=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                int random=(int)(Math.random()*10);
                nums[i][j]=random;
                System.out.print(nums[i][j]+" ");
            }
            System.out.println(); //works as endl in java
        }

        //enchanced for loop in java
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
