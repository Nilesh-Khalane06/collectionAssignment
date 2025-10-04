package List_Assignment;

import java.util.Arrays;
import java.util.List;

//count how many number divisible by 3 and 5
public class CountDivisible {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(15,5,30,45,60,7,6,5);
		int count=0;
		
		for (Integer integer : list) {
			if (integer%3==0 && integer%5==0) {
				count++;
				
			}
		}
		System.out.println("Total number divisible by 3 and 5: "+count);
	}

}
