import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class JavaStream7 {
	public static void main(String[] args) throws IOException {
		// 7. Stream from List, filter and print
				List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
				people
					.stream()
					.map(String::toLowerCase)
					.filter(x -> x.startsWith("a"))
					.forEach(System.out::println);
	}
}