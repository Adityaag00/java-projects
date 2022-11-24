
package projectdikstraalgorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ProjectDikstraAlgorithm {
    PriorityQueue<Node> pq;
    static HashSet<Integer> set;
    int dist[];
    
    public ProjectDikstraAlgorithm(int v) {
        pq = new PriorityQueue<>();
        set= new HashSet<>();
        dist= new int[v];
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE,min_ind=-1;
        for(int i=0;i<dist.length;i++) {
            if(set.contains(i)){
                if(min>dist[i]) {
                    min=dist[i];
                    min_ind=i;
                }
            }
        }
        return min_ind;  
    }
    
    public void disktra(ArrayList<ArrayList<Node>> lst,int so) {
        for(int i=0;i<lst.size();i++) {
            dist[i]=Integer.MAX_VALUE;
        }
        dist[so]=0;
        while(!set.isEmpty()){
            int u= getMin();
            if(u==-1)
                break;
            set.remove(u);
            ArrayList<Node> l = lst.get(u);
            for(Node n:l) {
                if(!set.contains(n.node))
                    continue;
                int dis=dist[u]+n.cost;
                if(dis<dist[n.node]){
                    dist[n.node]=dis;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0) {
            set.clear();
            int n=in.nextInt();
            int k=in.nextInt();
            ProjectDikstraAlgorithm pr = new ProjectDikstraAlgorithm(n);
            ArrayList<ArrayList<Node>> lst = new ArrayList<>();
            for (int i = 0; i<n; i++) {
                set.add(i);
            }
            for(int i=0;i<n;i++) {
                ArrayList<Node> tmp = new ArrayList<>();
                lst.add(tmp);
            }
            for(int i=0;i<k;i++) {
                int u= in.nextInt();
                int v= in.nextInt();
                int cost = in.nextInt();
                u--;
                v--;
                lst.get(u).add(new Node(v, cost));
            }
            int a=in.nextInt();
            int b=in.nextInt();
            a--;
            b--;
            pr.disktra(lst,a);
            if(pr.dist[b]==Integer.MAX_VALUE)
                System.out.println("NO");
            else
                System.out.println(pr.dist[b]);
        }
    }
    
    static class Node implements Comparator<Node>{
        int node;
        int cost;

        public Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compare(Node o1, Node o2) {
            return o1.cost-o2.cost;
        }
    }
}
