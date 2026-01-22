public class StringBufferAndStringBuilder {
    public static void main(String a[]){
        StringBuffer sb= new StringBuffer("shivanshu");
        //inbuilt methods of String Buffer which we can use
        System.out.println(sb.capacity()); //original capacity is 16 bytes, shivanshu adds it up to 25
        System.out.println(sb.length()); //length remains same as the input string given
        sb.charAt(1);
        sb.append(" goswami");
        sb.insert(1,"a");
         System.out.println(sb);
         sb.deleteCharAt(1);
         String str= sb.toString();
         System.out.println(str);
         System.out.println(sb.substring(0, 5));
         sb.setLength(30);
         sb.ensureCapacity(100);

         //Note: Only difference between string buffer and string builder is that string buffer is
         // thread safe while string builder is not


    }
}
