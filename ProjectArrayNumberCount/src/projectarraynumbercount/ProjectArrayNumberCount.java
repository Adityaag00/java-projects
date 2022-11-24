
package projectarraynumbercount;

import java.util.HashMap;
import java.util.Random;


public class ProjectArrayNumberCount {
    static int count=1;
    static int numofrep=0;
    
    public static void main(String[] args) throws NullPointerException{
        int Test[] = new int[]{77,-3,-3,77,22,15,15,1,1};
        
        Random rnd = new Random();
        int replace=5;
        
        for(int i=0;i<Test.length;i++) {
            if(replace==Test[i]) {
                replace=rnd.nextInt(100);
            }
        }
        System.out.println(replace);
        System.out.println("Array");
        
        for(int i=0;i<Test.length;i++) {
            System.out.println(Test[i]);
        }
        
        int[] index=new int[Test.length];
        HashMap<Object,Object> val = new HashMap<>();
        
        for(int i=0;i<Test.length;i++) {                    //{25,5,3,6,-2,-2,5,5,3};
            for(int j=i+1;j<Test.length;j++) {
                if(Test[i]==replace)
                    break;
                if(Test[i]==Test[j]) {
                    count++;
                    index[numofrep]=j;
                    val.put(j, Test[j]);
                    Test[j]=replace;
                    numofrep++;
                }
            }
            if(Test[i]!=replace) {
                System.out.println("Count of "+Test[i]+" is "+count);
            }
            count=1;
        }
        for(int i=0;i<numofrep;i++) {
            Test[index[i]]=(int)val.get(index[i]);
        }
        
        System.out.println("Array");
        
        for(int i=0;i<Test.length;i++) {
            System.out.println(Test[i]);
        }
    }   
}
