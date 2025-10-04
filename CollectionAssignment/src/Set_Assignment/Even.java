package Set_Assignment;

import java.util.HashSet;
import java.util.Set;

//count how many even number are present in set
public class Even {
	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<>();
		set.add(22);
		set.add(12);
		set.add(22);
		set.add(32);
		set.add(23);
		set.add(25);
		set.add(32);
		
		int evencount=0;
		for (Integer i : set) {
			if(i%2==0) {
				evencount++;
			}
			
		}
		System.out.println(evencount);
	}

}
