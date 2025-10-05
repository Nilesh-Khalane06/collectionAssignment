
//Use Predicate<String> to check if a password length is at least 8. If yes, print
//“Strong Password”. The password should be provided by Supplier<String> .

package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Password {
	public static void main(String[] args) {

		Supplier<String> supplier = () -> "Nilesh";

		Predicate<String> predicate = pass -> pass.length() >= 8;

		Consumer<String> consumer = pass -> System.out.println("Strong Password");
		
		//if pass
		
		String pass=supplier.get();
		if(predicate.test(pass)) {
			consumer.accept(pass);
			
		}else {
			System.err.println("Password should be atleast 8 character");
		}

	}

}
