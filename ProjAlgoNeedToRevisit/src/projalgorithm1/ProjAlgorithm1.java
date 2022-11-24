
package projalgorithm1;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class ProjAlgorithm1 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int num=in.nextInt();
        int ar[] = new int[num];
        
        for(int i=0;i<num;i++) {
            ar[i]=in.nextInt();
        }
        int k=0;
        while(k < ar.length) {
            System.out.println("The array"+ar[k]);
            k++;
        }
//        System.out.println("Now For Result");
//        
//        for(int i=0;i<num;i++) {
//            System.out.println(ar[i]);
//        }

        List<Object> list = new ArrayList();
        list=Arrays.asList(ar);
        
        k=0;
        while(k < ar.length) {
            System.out.println("The list array"+(int)list.get(k));
            k++;
        }
        
        int pair =0,ele=0,first;
        first=ar[0];
        
        System.out.println("Size is "+list.size());
        
        for(int i=1;i<list.size();i++) {
            for(int j=1;j<list.size();j++) {
                if((int)list.get(i)== first) {
                    ele++;
                    System.out.println(ele);
                    System.out.println("Tryimg");
                }
            }
            list.removeAll(Arrays.asList(first));
            first=(int) list.get(0);
        }
        
//        if(ele%2 != 0) {
//            ele--;
//        }
        System.out.println(""+ele);
    }
    
}
