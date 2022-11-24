import java.util.*;

public class Huffman {

   static Map<Character, String> ans = new HashMap<>();
   static Map<Character, Integer> freq = new HashMap<>();

   static class Node {
      Node left;
      Node right;
      int weight;
      boolean leaf = false;
      char ch;

      Node(Node left, Node right, int weight, char ch) {
         this.left = left;
         this.right = right;
         this.weight = weight;
         this.ch = ch;
      }
   }

   static class Comparator implements java.util.Comparator<Node> {
      @Override
      public int compare(Huffman.Node o1, Huffman.Node o2) {
         return o1.weight - o2.weight;
      }
   }

   static void freqCount(String s) {
      for (char ch : s.toCharArray()) {
         freq.merge(ch, 1, Integer::sum);
      }
   }

   static Node createBinaryMergeTree(String s) {
      freqCount(s);
      PriorityQueue<Node> heap = new PriorityQueue<>(new Comparator());
      for (Map.Entry<Character, Integer> e : freq.entrySet()) {
         System.out.println(e.getKey() + "           " + e.getValue());
         heap.add(new Node(null, null, e.getValue(), e.getKey()));
      }
      while (heap.size() > 1) {
         Node n1 = heap.poll();
         Node n2 = heap.poll();
         heap.add(new Node(n1, n2, n1.weight + n2.weight, '#'));
      }
      return heap.poll();
   }

   static void createHuffManCode(Node root, String s) {
      if (root.left == null && root.right == null && Character.isLetter(root.ch)) {
         ans.put(root.ch, s);
         return;
      }
      createHuffManCode(root.left, s + "0");
      createHuffManCode(root.right, s + "1");
   }

   static void decodeHuffManCode(Node root, String s) {
      Node tmp = root;
      for (char ch : s.toCharArray()) {
         if (ch == '0') {
            tmp = tmp.left;
         } else
            tmp = tmp.right;
         if (tmp.left == null && tmp.right == null && Character.isAlphabetic(tmp.ch)) {
            System.out.print(tmp.ch);
            tmp = root;
         }
      }
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String s = in.next();
      Node root = createBinaryMergeTree(s);
      createHuffManCode(root, "");
      System.out.println("\n");
      for (Map.Entry<Character, String> e : ans.entrySet()) {
         System.out.println(e.getKey() + "          " + e.getValue());
      }
      System.out.println("\n");
      String code = "";
      for (char ch : s.toCharArray()) {
         code += ans.get(ch);
      }
      System.out.println(code);
      System.out.println("\n");
      decodeHuffManCode(root, code);
   }
}