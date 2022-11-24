
package projecthackerrankfirst;

import java.util.Scanner;


public class ProjectHackerrankFirst {

    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        String str=sc.nextLine();
        String ktr=sc.nextLine();
        String ptr=sc.nextLine();

        task(str);
        task(ktr);
        task(ptr);

        System.out.println("================================");

    }

    public static void task(String str) {
        int apl=0,i,k=0;
        StringBuilder num =new StringBuilder(3);
        StringBuilder stb =new StringBuilder(15);
        

        for(i=0;i<str.length();i++) {
            if(str.charAt(i) >=48 && str.charAt(i)<=57) {
                num.append(""+str.charAt(i));
                k++;
            }  
            if((str.charAt(i) >=65 && str.charAt(i) <=90)) {
                stb.append(str.charAt(i));
                apl++;
            }
            if((str.charAt(i) >=97 && str.charAt(i) <=122)) {
                stb.append(str.charAt(i));
                apl++;
            } 
        }
        while(apl<15) {
            stb.append(" ");
            apl++;
        }
            
        
        while(k<3) {
            num.insert(0,"0");
            k++;
        }
        
        print(stb,num);
    }

    private static void print(StringBuilder stb, StringBuilder num) {
        System.out.println(""+stb+num);
        
    }
}
