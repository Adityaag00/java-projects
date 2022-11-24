/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author Aditya
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] selection = {5,2,10,25,1,5,5,88,6,69};
        
        int max,temp;
        
        for(int i=0;i<selection.length;i++) {
            for (int j=i+1;j<selection.length;j++) {
                if(selection[j]<selection[i]) {
                    temp=selection[i];
                    selection[i]=selection[j];
                    selection[j]=temp;
                }
            }
        }
        int i=0;
        while (i<selection.length) {
            System.out.println(selection[i]);
            i++;
        }
    }
    
}
