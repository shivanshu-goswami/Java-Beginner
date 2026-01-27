import java.util.ArrayList;
import java.util.Collection;

public class Arraylist {
    public static void main(String a[]){
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(5);
        nums.add(2);
        nums.add(1);
        for(int i : nums){
            System.out.println(i);
        }
    }
}
