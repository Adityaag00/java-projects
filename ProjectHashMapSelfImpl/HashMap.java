import java.util.HashSet;
import java.util.Objects;

class HashMap<K, V> {

	static int tabSize = 16;
	@SuppressWarnings({ "unchecked" })
	Node<K, V> tab[] = (Node<K, V>[]) new Node[tabSize];

	public HashMap() {
	}

	public static class Node<K, V> {
		K key = null;
		V value = null;
		Node<K, V> next = null;
		int hash;

		public Node(K key, V value, Node<K, V> next, int hash) {
			this.key = key;
			this.value = value;
			this.next = next;
			this.hash = hash;
		}
	}

	int hash(K key) {
		// System.out.println(Objects.hashCode(key));
		return Objects.hashCode(key);
	}

	public void put(K key, V value) {
		int hash = hash(key);
		int ind = hash % tabSize;
		Node<K, V> tmp = tab[ind];
		if (tab[ind] == null) {
			tab[ind] = new Node<K, V>(key, value, null, hash);
		} else {
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = new Node<K, V>(key, value, null, hash);
		}
	}

	public V get(K key) {
		int hash = hash(key);
		int ind = hash % tabSize;
		// System.out.println(hash+ " "+key);
		Node<K, V> tmp = tab[ind];
		if (tmp == null)
			return null;
		while (tmp != null) {
			if (tmp.hash == hash && tmp.key == key)
				return tmp.value;
			tmp = tmp.next;
		}
		return null;
	}

	public HashSet<K> getKeySet() {
		HashSet<K> st = new HashSet<K>();
		Node<K, V> tmp;
		for (int i = 0; i < tabSize; i++) {
			tmp = tab[i];
			if (tmp == null)
				continue;
			st.add(tmp.key);
			while (tmp.next != null) {
				tmp = tmp.next;
				st.add(tmp.key);
			}
			st.add(tmp.key);
		}
		return st;
	}
}