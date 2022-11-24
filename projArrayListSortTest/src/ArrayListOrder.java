import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListOrder {
    public static void main(String[] args) {
        ArrayList<String>list1= new ArrayList<String>();
        list1.add("Lion");
        list1.add("LionKing");
        list1.add("Mufasa");
        list1.add("Nala");
        list1.add("KingNala");
        list1.add("Animals");
        list1.add("Anims");
        list1.add("Fish");
        list1.add("Jelly Fish");
        list1.add("I am the boss");
        
        System.out.println("Before Sorting :----------------------------------------------");
        display(list1);
        
        Collections.sort(list1);
        System.out.println("After Sorting :----------------------------------------------");
        display(list1);
        
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("After Reverse Sorting :----------------------------------------------");
        display(list1);
    }
    
    static void display(List<String> l) {
       for(String str : l) {
            System.out.println(str);
        } 
    }
}
