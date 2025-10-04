package List_Assignment;

import java.util.Arrays;
import java.util.List;

//find the maximum and minimum number
public class FindMaxMin {
	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(2,6,3,9,25,5);
		int min=list.get(0);
		int max=list.get(0);
		
		for (Integer integer : list) {
			if(integer<min) {
				min=integer;	
			}
			if(integer>max) {
				max=integer;
				
			}
			
		}
		System.out.println("Minimum Number: "+min);
		System.out.println("Maximum Number "+max);
	}

}
