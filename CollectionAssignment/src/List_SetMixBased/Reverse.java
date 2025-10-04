package List_SetMixBased;

import java.util.Arrays;
import java.util.List;

//Create a List<Integer> with some values. Print all elements in reverse order using
//only List methods (no Collections.reverse).
public class Reverse {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,5,3,5,4,55);
		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
			
		}
	}

}
