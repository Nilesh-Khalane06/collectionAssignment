package List_SetMixBased;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//4. Given a List<Integer> and a Set<Integer> , print all elements from the list and set
//that are  present in the both .

public class Present {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,3,6,4,5,7,8);
		Set<Integer> set=new LinkedHashSet<>();
		set.add(6);
		set.add(3);
		set.add(4);
		set.add(5);
		
		System.out.println("Elements that are present in list as well as set");
		for (Integer li : list) {
			if(set.contains(li)) {
				System.out.println(li);
				
			}
			
		}
		
	}

}
