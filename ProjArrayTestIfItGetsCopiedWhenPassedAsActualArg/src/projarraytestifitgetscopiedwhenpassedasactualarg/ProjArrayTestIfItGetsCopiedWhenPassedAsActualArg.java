
package projarraytestifitgetscopiedwhenpassedasactualarg;

import java.util.Random;
import org.omg.CORBA.ARG_OUT;


public class ProjArrayTestIfItGetsCopiedWhenPassedAsActualArg {
    Random rnd;
    
    public ProjArrayTestIfItGetsCopiedWhenPassedAsActualArg() {
        rnd = new Random();
    }
    
    void arrayTest(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            arr[i]=rnd.nextInt(100);
        }
        System.out.println("In the method");
        print(arr);
    }
    
    void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    void argTest(int test) {
        test+=10;
        System.out.println("In Method "+test);
    }
    
    public static void main(String[] args) {
        ProjArrayTestIfItGetsCopiedWhenPassedAsActualArg t = new ProjArrayTestIfItGetsCopiedWhenPassedAsActualArg();
        int arr[] = new int[12];
        
        for(int i=0;i<arr.length;i++) {
            arr[i]=t.rnd.nextInt(100);
        }
        System.out.println("Inside Main");
        t.print(arr);
        t.arrayTest(arr);
        System.out.println("Again Inside Main");
        t.print(arr);
        
        int test=10;
        System.out.println("In main "+test);
        t.argTest(test);
        System.out.println("In main "+test);
    }
    
}
