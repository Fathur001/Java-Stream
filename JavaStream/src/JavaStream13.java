import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class JavaStream13 {
	public static void main(String[] args) throws IOException {
		// 13. Reduction - sum
				double total = Stream.of(7.3, 1.5, 4.8)
					.reduce(0.0, (Double a, Double b) -> a + b);
				System.out.println("Total = " + total);
				
				// 14. Reduction - summary statistics
				IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
					.summaryStatistics();
				System.out.println(summary);
				}
	}