package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] nums = {2,3,4,2,3,5,7,6,7};
		
		Set<Integer> numbers = new HashSet<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			numbers.add(nums[i]);
		}
		System.out.println(numbers);
	}

}
