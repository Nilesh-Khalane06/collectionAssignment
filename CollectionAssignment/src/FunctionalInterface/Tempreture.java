//Create a Predicate<Double> to check if a temperature is above 37.5 (fever). Use
//Supplier<Double> for temperature, and if true, print “High Temperature”.

package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Tempreture {
	public static void main(String[] args) {

		Supplier<Double> supplier = () -> 38.5;

		Predicate<Double> predicate = temp -> temp > 37.5;

		Consumer<Double> consumer = temp -> System.out.println("High Temperature");
		
		//
		double temp=supplier.get();
		if(predicate.test(temp)) {
			consumer.accept(temp);
			
		}else {
			System.out.println("Temperature Low");
		}
	}

}
