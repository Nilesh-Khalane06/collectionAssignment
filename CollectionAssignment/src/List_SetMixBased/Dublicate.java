package List_SetMixBased;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Create a List<Integer> with some duplicate numbers. Convert it to a
//Set<Integer> and print both to show difference.

public class Dublicate {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(23,21,23,12,10,33,10);
		
		Set<Integer> set=new LinkedHashSet<>(list);
		
		System.out.println("Original list"+list);
		System.out.println("set"+set);
		
		for (Integer i : set) {
			System.out.println(i);
			
		}
	}

}
