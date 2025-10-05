
//9. Write a BiConsumer<Integer, Integer> that prints the result of addition,
//subtraction, multiplication, and division of the two numbers.

package BiConsumer;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class MathematicalOperation {
	public static void main(String[] args) {

		Supplier<Integer> num1 = () -> 10;
		Supplier<Integer> num2 = () -> 0;

		BiConsumer<Integer, Integer> consumer = (x, y) -> {
			System.out.println("Additon is: " + (x + y));
			System.out.println("Subtraction is:" + (x - y));
			System.out.println("Multiplication is: " + (x * y));
			if (y != 0) {
				System.out.println("Division is: " + (x / y));
			} else {
				System.out.println(" Division not possible(Divide by zero not possible)");
			}
		};

		int val1 = num1.get();
		int val2 = num2.get();

		consumer.accept(val1, val2);
	}

}
