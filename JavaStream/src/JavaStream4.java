import java.lang.String;
	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.*;
	import java.util.*;
	import java.nio.file.*;
	import java.io.IOException;
public class JavaStream4 {
	public static void main(String[] args) throws IOException {
	//Stream of sorted and FindFirst
			Stream.of("Ava","Aneri","Alberto")
				.sorted()
				.findFirst()
				.ifPresent(System.out::println);
}
}