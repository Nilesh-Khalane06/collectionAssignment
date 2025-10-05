//. Use a Supplier<Double> to provide a product price. If the price is greater than
//1000 (use Predicate ), apply a 10% discount (use Function ) and print the final
//price

package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ProductDiscount {
	public static void main(String[] args) {

		Supplier<Double> supplier = () -> 9000.0;

		Predicate<Double> predicate = x -> x > 1000;

		Function<Double, Double> function = x -> x - x * 10 / 100;

		Consumer<Double> consumer = x -> System.out.println("Price after discount: " + x);

		// prices >1000 add 10% discount

		double price = supplier.get();

		if (predicate.test(supplier.get())) {
			consumer.accept(function.apply(supplier.get()));
		}else {
			System.out.println("Price without discount:"+price);
		}

	}

}
