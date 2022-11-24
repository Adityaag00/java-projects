package projecttrietraversal;

import java.util.*;

public class Main {

    public static class Node {
        HashMap<Character,Node> children = new HashMap<>();
        boolean isLeaf=false;

        public void put(char ch) {
            children.putIfAbsent(ch, new Node());
        }

        public Node get(char ch) {
            return children.get(ch);
        }
    }

    public static void insert(Node root,String str) {
        Node tmp=root;
        for(char ch:str.toCharArray()) {
            tmp.put(ch);
            tmp=tmp.get(ch);
        }
        tmp.isLeaf=true;
    }

    public static void display(Node root,int i,char[] str) {
        if(root.isLeaf==true) {
            for(int k=i;k<str.length;k++) {
                str[k]=' ';
            }
            System.out.println(str);
        }

        for(Map.Entry<Character,Node> entry:root.children.entrySet()) {
            str[i]=entry.getKey();
            display(entry.getValue(), i+1, str);
        }
    }

    public static void main(String[] args) {
        int N=0;
        Scanner in = new Scanner(System.in);
        Node root= new Node();

        N=in.nextInt();
        String str[]= new String[N];

        for(int i=0;i<N;i++) {
            str[i]=in.next();
        }
        for(int i=0;i<str.length;i++) {
            insert(root, str[i]);
        }
        System.out.println("\n\n\n\n\n");
        char strb[]= new char[30];
        display(root, 0, strb);
    }
}