import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Test");
		map.put(2, "Hi");
		map.put(3, "Java");
		map.put(4, "Map");
		map.put(5, "Cool");
		map.put(6, "King");

		HashSet<Integer> st = map.getKeySet();
		for (int x : st) {
			System.out.println(map.get(x));
		}
	}
}
