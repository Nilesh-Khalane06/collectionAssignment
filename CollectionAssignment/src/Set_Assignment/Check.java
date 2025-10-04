package Set_Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class Check {
	public static void main(String[] args) {
		
		Set<Integer> set=new LinkedHashSet<>();
		set.add(20);
		set.add(12);
	//	set.add(10);
		set.add(101);
		set.add(101);
		
		int checknumber=10;
		boolean b=false;
		
		for (Integer i : set) {
			if(i==checknumber) {
				b=true;
				break;
				
			}
			
		}
		if(b) {
			System.out.println("number is exist");
			
		}else {
			System.out.println("Number is not exist");
		}
	}

}
