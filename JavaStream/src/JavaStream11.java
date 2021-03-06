import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class JavaStream11 {
	public static void main(String[] args) throws IOException {
		// 11. Stream rows from CSV file, parse data from rows
				Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
				rows2
					.map(x -> x.split(","))
		            .filter(x -> x.length == 3)
					.filter(x -> Integer.parseInt(x[1]) > 15)
					.forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
				rows2.close();
	}
}