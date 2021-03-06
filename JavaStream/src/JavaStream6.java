import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class JavaStream6 {
	public static void main(String[] args) throws IOException {
		// 6. average of squares of an int array
				Arrays.stream(new int[] {2, 4, 6, 8, 10})
					.map(x -> x * x)
					.average()
					.ifPresent(System.out::println);
	}
}