
//Write a BiFunction<Double, Double, Double> that calculates the area of a
//rectangle (length × breadth) and prints the result.
package Bifunction;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class AreaOfRectangle {
	public static void main(String[] args) {

		Supplier<Double> length = () -> 15.0;
		Supplier<Double> breadth = () -> 15.0;

		BiFunction<Double, Double, Double> function = (x, y) -> {
			Double result = x * y;
			return result;
		};

		Consumer<Double> consumer = (res) -> System.out.println("Area of rectangle is: " + res);

		double val1 = length.get();
		double val2 = breadth.get();

		double result = function.apply(val1, val2);
		consumer.accept(result);

	}

}
