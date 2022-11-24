
package projcharuppercaselowercase;

import java.util.Scanner;


public class ProjCharUpperCaseLowerCase {

    static char c;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        c=in.next().charAt(c);
        //System.out.println(c);
        
        double a , b, d = 0;
        
        a=in.nextDouble();
        b=in.nextDouble();
        
        switch(c) {
            case '-':
                d=a-b;
                break;
            case '+':
                d=a+b;
                break;
            case '*':
                d=a*b;
                break;
            case '/':
                d=a/b;
                break;
        }
        System.out.println(d);
    }
    
}
