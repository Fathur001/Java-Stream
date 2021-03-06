import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class JavaStream9 {
	public static void main(String[] args) throws IOException {
		// 9. Stream rows from text file and save to List
				List<String> bands2 = Files.lines(Paths.get("bands.txt"))
					.filter(x -> x.contains("jit"))
					.collect(Collectors.toList());
				bands2.forEach(x -> System.out.println(x));
	}
}