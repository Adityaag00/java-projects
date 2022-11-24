
package projectbinarytooctal;

import java.util.Scanner;

public class ProjectBinaryToOctal {

    
    public static void main(String[] args) {
       
        int[] binary = new int[9];
        int pair_count =0;
        int pair_index=2;
        StringBuilder octal = new StringBuilder(" ");
        int tempOctal;
        int tempBin;
        
        Scanner in = new Scanner(System.in);
        
        for(int i = 0 ; i< 9 ; i++) {
            tempBin=in.nextInt();
            if(tempBin==9) 
                break;
            else
                binary[i]=tempBin;
        }
        
        int pair[] = new int[3];
//        for(int i = 0 ; i< 9 ; i++) {
//            System.out.println(binary[i]);
//        }
        
        
        for(int j= binary.length-1 ; j>=0 ; j--) {              

            if(pair_count>2 || pair_index < 0) {
                tempOctal=(4*pair[0])+(2*pair[1])+(1*pair[2]);
                pair_count=0;
                pair_index=2;
                octal.insert(0, tempOctal);
            }
            pair[pair_index] = binary[j];

            pair_count++;
            pair_index--;
        }
        tempOctal=(4*pair[0])+(2*pair[1])+(1*pair[2]);
        octal.insert(0, tempOctal);
        
        System.out.println(octal);
    }
    
}
