public class MutableImmutableString {
    public static void main(String a[]){
        String name="shivanshu";
        //this doesnt append the surname to the existing name string but it creates a new string
        //in string constant pool in heap memory and return this new reference to the "name" in stack 
        name=name+" goswami"; 
        System.out.println(name);
        //both are just 2 seperate variable objects in stack but they store the same reference to the 
        //string karan as karan string is created just once in string constant pool thats why they 
        //returned true on s1==s2 cause they are holding the same address(reference)
        String s1 = "karan";
        String s2= "karan";
        System.out.println(s1==s2);
    }
}
