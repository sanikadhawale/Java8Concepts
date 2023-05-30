package example;

import java.util.*;
import java.util.stream.Stream;

public class StreamAPI {

	//Stream API examples
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(6, 5, 2, 8, 1);
		
		Stream<Integer> data = nums.stream();
		Stream<Integer> sortedData = data.sorted();
		sortedData.forEach(n -> System.out.print(n+" "));
		
		System.out.println();
		
		//The above can also be written as: 
		nums.stream().sorted().map(n -> n*2).forEach(n -> System.out.print(n+" "));
		
		
		//important map reduce!!
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Example 1: Sum of all numbers using reduce
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("\nSum: " + sum);
				
	}

}
