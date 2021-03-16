package day7prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {

	public static void main(String[] agrs){

		// Make the two lists
		List<Integer> list1 = Arrays.asList(4, 9, 4, 3, 6, 8, 7, 1, 3, 10);
		List<Integer> list2 = Arrays.asList(7, 3, 10, 7, 5, 9, 4, 9, 9, 1);
		// Prepare a union
		List<Integer> union = new ArrayList<Integer>(list1);
		union.addAll(list2);
		// Prepare an intersection
		List<Integer> intersection = new ArrayList<Integer>(list1);
		intersection.retainAll(list2);
		// Subtract the intersection from the union
		union.removeAll(intersection);
		// Print the result
		for (Integer n : union) {
		    System.out.println(n);
		}
	}
}