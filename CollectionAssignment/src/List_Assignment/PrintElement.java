package List_Assignment;

import java.util.ArrayList;
import java.util.List;
//1.Add 10 interger into the arraylist

public class PrintElement {
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>();
		l.add(23);
		l.add(23);
		l.add(23);
		l.add(23);
		l.add(23);
		
		for (Integer i : l) {
			System.out.print(i+" ");
			
		}
	}

}
