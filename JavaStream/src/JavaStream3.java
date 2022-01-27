import java.lang.String;
	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.*;
	import java.util.*;
	import java.nio.file.*;
	import java.io.IOException;
public class JavaStream3 {
	public static void main(String[] args) throws IOException {

		//Integer Stream with sum
		System.out.println(
		IntStream
			.range(1,5)
			.sum());
			System.out.println();
		}
		}