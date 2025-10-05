
//. Create a program where Supplier<String> provides a username. If username
//starts with “admin” ( Predicate ), print “Access Granted”, else “Access Denied”.

package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UserNameCheck {
	public static void main(String[] args) {

		Supplier<String> supplier = () -> "admin@123";

		Predicate<String> predicate = username -> username.startsWith("admin");

		Consumer<String> consumer = mass -> System.out.println("Access Granted");

		String name = supplier.get();
		if (predicate.test(name)) {
			consumer.accept(name);

		} else {
			System.out.println("Access Denied");
		}

	}

}
