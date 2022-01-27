import java.lang.String;
	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.*;
	import java.util.*;
	import java.nio.file.*;
	import java.io.IOException;
public class JavaStream5 {
	public static void main(String[] args) throws IOException {
	//Stream from Array, sort, filter and print
		String[] names = {"Al","Ankit","Kushal","Brent","Sarika","amanda","Hans","Shivika","Sarah"};
			Arrays.stream(names)	//same as Stream.of(names)
				.filter(x -> x.startsWith("S"))
				.sorted()
				.forEach(System.out::println);
}
}