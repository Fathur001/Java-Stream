	import java.lang.String;
	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.*;
	import java.util.*;
	import java.nio.file.*;
	import java.io.IOException;
	
public class JavaStream {
	public static void main(String[] args) throws IOException {

	//Integer Stream with skip
	IntStream
		.range(1,5)
		.skip(5)
		.forEach(x -> System.out.println(x));
		System.out.println();
	}
	}

