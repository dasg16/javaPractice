package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class PerformActionSet {

	Set<String> se = new HashSet<String>();

	public void addSet() {

		se.add("I am first");
		se.add("I am second");
		se.add("I am third");
		se.add("I am forth");
		se.add("I am fifth");

		System.out.println("Added 5 Strings");

	}

	public void addExtraElement(String value) {

		se.add(value);

		Iterator it = se.iterator();

		while (it.hasNext()) {
			System.out.println("Output after addExtraElement  " + it.next());
		}

	}

	public void getSet() {

		Iterator it = se.iterator();
		while (it.hasNext()) {

			System.out.println("Get Set " + it.next());
		}

	}

	public void getNoSortedUsingHashSet() {

		Set<Integer> hs = new HashSet<Integer>();

		// for (int i = 0; i < count; i = i + 2) {
		// hs.add(i);
		// }

		hs.add(99);
		hs.add(44);
		hs.add(62);
		hs.add(21);

		Iterator it = hs.iterator();
		while (it.hasNext()) {

			System.out.println("After sorting using TreeSet " + it.next());
		}

	}

	public void getSortedUsingTreeSet() {

		Set<Integer> ts = new TreeSet<Integer>();

		// for (int i = 0; i < count; i = i + 2) {
		// hs.add(i);
		// }

		ts.add(99);
		ts.add(44);
		ts.add(62);
		ts.add(21);

		Iterator it = ts.iterator();
		while (it.hasNext()) {

			System.out.println("After sorting using TreeSet " + it.next());
		}

	}

}

public class SetPractice {

	public static void main(String[] args) {

		PerformActionSet pa = new PerformActionSet();

		pa.addSet();

		pa.getSet();

		pa.addExtraElement("I am sixth");

		pa.getNoSortedUsingHashSet();

		pa.getSortedUsingTreeSet();

	}

}
