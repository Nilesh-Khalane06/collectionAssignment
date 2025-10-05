//Use a Supplier<Integer> to provide a number, a Predicate to check if it’s
//positive, and a Consumer to print “Positive Number” if true

package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PrintPositiveNumber {
	public static void main(String[] args) {

		Predicate<Integer> predicate = x -> x >= 0;
		
		Supplier<Integer> supplier=()-> 10;
		
		Consumer<Integer> consumer=x->System.out.println("positive number");
		
		
		//if number is positive then print it
		if(predicate.test(supplier.get())) {
			consumer.accept(supplier.get());
			
			
		}
	}
	
	

}
