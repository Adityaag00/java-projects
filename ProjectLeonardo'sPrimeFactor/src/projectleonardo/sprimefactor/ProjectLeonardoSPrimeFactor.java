/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectleonardo.sprimefactor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class ProjectLeonardoSPrimeFactor {

    static int primeCount(long n) {
        int[] prime = new int[400];
        int count=0;
        boolean flag=false;

        for(int i=2;i<500;i++) {
            for(int j=2;j<=i/2;j++) {
                if(i%j==0) {
                    flag=true;
                    break;
                }            
            }
            if(flag==false){
                prime[count++]=i;
            }
            flag=false;
        }
        count=0;
        long mul=1;
        
        while(mul<=n) {
            mul*=prime[count++];
            //System.out.println(count+" "+mul);
        }
        
        
        if(count>=1)
            return --count;
        //else
            return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(""));

        int q = Integer.parseInt(scanner.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            long n = Long.parseLong(scanner.nextLine().trim());

            int result = primeCount(n);

            System.out.println(result);
        }
    }
    
}
