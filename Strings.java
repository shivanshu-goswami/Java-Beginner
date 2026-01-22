public class Strings {
    public static void main(String a[]){
        String str= new String("Shivanshu"); //String is a class so can be accessed as class and objects
        System.out.println(str);
        System.out.println(str.charAt(1));
        System.out.println(str.concat(" Goswami"));

        String name="Shivanshu"; //it too is correct, it creates object for you by itself, no need for  
        System.out.println(name); //explicitly writing
    }
}
