
//. Use a Supplier<Integer> to provide two numbers (separately), use
//Function<Integer, Integer> to double them, and print their sum.
package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class SumTwo {
	public static void main(String[] args) {

		Supplier<Integer> supplier1 = () -> 5;
		Supplier<Integer> supplier2 = () -> 10;

		Function<Integer, Integer> function = num -> num*2;

		Consumer<Integer> consumer = sum -> System.out.println(sum);
		
		//Get numbers from suppliers
		int num1=supplier1.get();
		int num2=supplier2.get();
		
		//Apply function to double both numbers
		int value1=function.apply(num1);
		int value2=function.apply(num2);
		
		//calculate sum
		int sum=value1+value2;
		
		//print result
		consumer.accept(sum);
	}

}
