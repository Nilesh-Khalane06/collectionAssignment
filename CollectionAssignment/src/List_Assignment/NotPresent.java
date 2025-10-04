package List_Assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//4. Given a List<Integer> and a Set<Integer> , print all elements from the list
//that are not present in the set.
public class NotPresent {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 5, 3, 2, 13, 4);
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1);
		set.add(13);
		set.add(4);
		set.add(5);

		for (Integer li : list) {
			boolean b=false;
			for (Integer si : set) {
				if (li != si) {
					b=true;
					break;

				}

			}
			if(!b) {
				System.out.println(li);
				
			}

		}

	}

}
