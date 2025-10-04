package List_Assignment;

import java.util.Arrays;
import java.util.List;

//5.create price Print only those prices that are greater than 100
public class CountGreter {
	public static void main(String[] args) {
		
		List<Double> d= Arrays.asList(20.02,854.2,66.0,144.2,354.0,55.0);
		
		System.out.println("Those prices greater than 100");
		for (Double price : d) {
			if (price>100) {
				System.out.println(price);
				
			}
			
		}
		
	}

}
