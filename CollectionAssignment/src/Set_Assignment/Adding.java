package Set_Assignment;

import java.util.HashSet;
import java.util.Set;

//adding 10 elements in the set with thw dublicates
public class Adding {
	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<>();
		set.add(25);
		set.add(55);
		set.add(35);
		set.add(25);
		set.add(25);
		set.add(20);
		
		for (Integer integer : set) {
			System.out.println(integer);
			
		}
	}

}
