
//Use a Function<Integer, Integer> to get the cube of a number. Apply it to a
//number supplied by Supplier<Integer> and print the result.
package FunctionalInterface;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Cube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Supplier<Integer> supplier = () -> {
			System.out.println("Enter a number");
			int num = sc.nextInt();
			return num;

		};

		Function<Integer, Integer> function = num -> {
			int result = num * num * num;
			return result;
		};

		Consumer<Integer> consumer = result -> {
			System.out.println("Cube is: " + result);
		};

		int num = supplier.get();
		int result = function.apply(num);
		consumer.accept(result);

	}

}
