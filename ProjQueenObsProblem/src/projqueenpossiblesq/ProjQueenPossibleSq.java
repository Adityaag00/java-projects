/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projqueenpossiblesq;

import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class ProjQueenPossibleSq {

    /**
     *
     * @param n
     * @param ob
     * @param q
     * @param ob
     */
    public static int calcSq(int n,int ob,Point q,Point[] obj) {
        int d1,d2,d3,d4,r1,r2,c1,c2,ans=0;
        
        d1=Math.min(q.x-1,q.y-1);
        d2=Math.min(n-q.x,n-q.y);
        d3=Math.min(n-q.x,q.y-1);
        d4=Math.min(q.x-1,n-q.y);
        r1=q.y-1;
        r2=n-q.y;
        c1=q.x-1;
        c2=n-q.x;
        
        for(int i=0;i<ob;i++) {
            if(q.x>obj[i].x && q.y>obj[i].y && q.x-obj[i].x==q.y-obj[i].y) {
                d1=Math.min(d1,q.x-obj[i].x-1);
            }
            else if(q.x>obj[i].x && q.y>obj[i].y && obj[i].x-q.x==obj[i].y-q.y) {
                d2=Math.min(d2,obj[i].x-q.x-1);
            }
            else if(q.x<obj[i].x && q.y>obj[i].y && obj[i].x-q.x==q.y-obj[i].y) {
                d3=Math.min(d3,obj[i].x-q.x-1);
            }
            else if(q.x>obj[i].x && q.y<obj[i].y && q.x-obj[i].x==obj[i].y-q.y) {
                d4=Math.min(d4,obj[i].y-q.y-1);
            }
            else if(q.y>obj[i].y && q.x==obj[i].x) {
                r1=Math.min(r1, q.y-obj[i].y-1);
            }
            else if(q.y<obj[i].y && q.x==obj[i].x) {
                r2=Math.min(r2, -q.y+obj[i].y-1);
            }
            else if(q.x>obj[i].x && q.y==obj[i].y) {
                c1=Math.min(c1, q.x-obj[i].x-1);
            }
            else if(q.x<obj[i].x && q.y==obj[i].y) {
                c2=Math.min(c2, obj[i].x-q.x-1);
            }
            
        }
        ans=d1+d2+d3+d4+r1+r2+c1+c2;
        return ans;
    } 
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Point q = new Point();
        Point obj[] = new Point[30];
        int ob,x,y,chess;
        chess=in.nextInt();
        q.x=in.nextInt();
        q.y=in.nextInt();
        ob=in.nextInt();
        
        for(int i=0;i<ob;i++) {
            x=in.nextInt();
            y=in.nextInt();
            obj[i]=new Point(x, y);
        }
        int res=calcSq(chess, ob, q, obj);
        
        System.out.println("Result = "+res);
    }
    
}
