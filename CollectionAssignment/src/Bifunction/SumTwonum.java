
//Create a BiFunction<Integer, Integer, Integer> that takes two
//integers and returns their sum. Use it to add 5 and 10, and print the result.

package Bifunction;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SumTwonum {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> function = (x, y) -> {
			int sum = x + y;
			return sum;

		};

		Supplier<Integer> num1 = () -> 5;
		Supplier<Integer> num2 = () -> 10;
		
		Consumer<Integer> consumer=result->System.out.println("Sum is: "+result);
		
		int res1=num1.get();
		int res2=num2.get();
		
		int result=function.apply(res1, res2);
		
		consumer.accept(result);
	}

}
