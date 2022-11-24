
package projarraylistcollectionmethodtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ProjArrayListCollectionMethodTest {

   public static void main(String[] args) {
       
        String str[] = {"Lion","Tiger","Apple","Hen","Choilen","LionLing","LionAditya"};
        List<String> list1=Arrays.asList(str);
        ArrayList<String> list2=new ArrayList<>();
        
        System.out.println("Copying: --------------------------------------");
        Collections.copy(list2, list1);
        display(list2);
    }
    
    static void display(List<String> l) {
       for(String str : l) {
            System.out.println(str);
        } 
    } 
    
    
}
