
//8. Create a BiConsumer<String, Integer> that prints a formatted message like:
//"Name: John, Age: 25".
package BiConsumer;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class MassagePrint {
	public static void main(String[] args) {

		Supplier<String> name = () -> "Nilesh";
		Supplier<Integer> age = () -> 21;
		
		BiConsumer<String, Integer> consumer=(x,y)->System.out.println("Name: "+x+","+"Age: "+y);;
		
		String val=name.get();
		int val1=age.get();
		consumer.accept(val, val1);

	}

}
