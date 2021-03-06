import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class JavaStream8 {
	public static void main(String[] args) throws IOException {
		// 8. Stream rows from text file, sort, filter, and print
				Stream<String> bands = Files.lines(Paths.get("bands.txt"));
				bands
					.sorted()
					.filter(x -> x.length() > 13)
					.forEach(System.out::println);
				bands.close();
	}
}