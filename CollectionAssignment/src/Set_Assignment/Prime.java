package Set_Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

//create a set and only print the prime numbers
public class Prime {
	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>();
		Set<Integer> newset = new LinkedHashSet<>();

		set.add(12);
		set.add(11);
		set.add(7);
		set.add(17);
		set.add(22);
		set.add(23);
		set.add(32);

		int count = 0;
		for (Integer i : set) {
			if (i <= 1) {
				continue;

			}

			boolean b = true;
			for (int a = 2; a < i / 2; a++) {
				if (i % a == 0) {
					b = false;
					break;

				}
			}

			if (b) {
				System.out.println(i);

			}

		}

	}

}
