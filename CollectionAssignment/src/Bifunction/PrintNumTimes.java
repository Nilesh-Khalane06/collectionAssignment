
// Write a BiFunction<String, Integer, String> that repeats a string the
//given number of times. For example, input ("Hi", 3) → Output: "HiHiHi"

package Bifunction;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class PrintNumTimes {
	public static void main(String[] args) {

		Supplier<String> pass1 = () -> "Nilesh";
		Supplier<Integer> pass2 = () -> 3;

		BiFunction<String, Integer, String> function = (str, times) -> {
			String res = "";
			for (int i = 0; i < times; i++) {
				res = res + str;
			}
			return res;
		};

		Consumer<String> consumer = result -> System.out.println(result);
		
		String name=pass1.get();
		int times=pass2.get();
		
		String result=function.apply(name, times);
		
		consumer.accept(result);
		
	}

}
