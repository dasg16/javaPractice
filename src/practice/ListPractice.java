package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class PerformAction {

	List<Integer> ls = new ArrayList<Integer>();

	public void addList(int count) {

		for (int i = 0; i < count; i++) {

			ls.add(i);

			System.out.println("Input in add() " + i);

		}

	}

	public void addAtParticularIndex(int index, int value) {

		ls.add(index, value);

		Iterator it = ls.iterator();

		while (it.hasNext()) {
			System.out.println("Output after addAtParticularIndex  " + it.next());
		}

	}

	public void sortList() {

		Collections.sort(ls);

		Iterator it = ls.iterator();

		while (it.hasNext()) {
			System.out.println("Output after Sorted List  " + it.next());
		}

	}

	public void getList() {

		Iterator it = ls.iterator();
		while (it.hasNext()) {

			Object value = it.next();
			int j = (Integer) value;

			int output = ls.get(j);
			System.out.println("Output in get() " + output);

		}

	}

}

public class ListPractice {

	public static void main(String[] args) {

		PerformAction pa = new PerformAction();
		pa.addList(5);

		pa.getList();

		pa.addAtParticularIndex(3, 100);

		pa.sortList();

	}

}
