//: containers/E20_SimpleHashMapCollisons.java
/****************** Exercise 20 *****************
* Modify SimpleHashMap so it reports
* collisions, and test this by adding the same
* data set twice so you see collisions.
***********************************************/
package thinking.in.java.chapter17;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import net.mindview.util.Countries;

class SimpleHashMap2<K, V> extends SimpleHashMap<K, V> {
	@Override
	public V put(K key, V value) {
		V oldValue = null;
		int index = Math.abs(key.hashCode()) % SIZE;
		MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
		if (buckets[index] == null)
			buckets[index] = new LinkedList<MapEntry<K, V>>();
		// Lines added here:
		else {
			System.out.println("Collision while adding\n" + pair + "\nBucket already contains:");
			Iterator<MapEntry<K, V>> it = buckets[index].iterator();
			while (it.hasNext())
				System.out.println(it.next());
		}
		// End of lines added
		LinkedList<MapEntry<K, V>> bucket = buckets[index];
		boolean found = false;
		int count = 0;
		ListIterator<MapEntry<K, V>> it = bucket.listIterator();
		while (it.hasNext()) {
			MapEntry<K, V> iPair = it.next();
			count++;
			if (iPair.getKey().equals(key)) {
				System.out.println("Already check " + count + " times before found the key.");
				oldValue = iPair.getValue();
				it.set(pair); // Replace old with new
				found = true;
				break;
			}
		}
		if (!found)
			buckets[index].add(pair);
		return oldValue;
	}
}

public class E20_SimpleHashMapCollisons {
	public static void main(String[] args) {
		SimpleHashMap2<String, String> m = new SimpleHashMap2<String, String>();
		m.putAll(Countries.capitals(25));
		System.out.println(m);
		m.putAll(Countries.capitals(25));
		System.out.println(m);
	}
}