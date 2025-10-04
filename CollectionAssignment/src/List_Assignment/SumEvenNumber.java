package List_Assignment;

import java.util.Arrays;
import java.util.List;

//Sum of all even numbers
public class SumEvenNumber {
	public static void main(String[] args) {
		
		int sum=0;
		List<Integer> l=Arrays.asList(2,4,5,6,9);
		
		for (Integer integer : l) {
			if(integer%2==0) {
				sum=sum+integer;
				
				
			}
			
		}
		System.out.println("sum of all even number is: "+sum);
	}

}
