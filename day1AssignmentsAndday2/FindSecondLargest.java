package week3.day1AssignmentsAndday2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		// Here is the input
				int[] data = {3,2,11,4,6,7};
                Arrays.sort(data);
                int firstLargestNumber = data[data.length-1];
                System.out.println("First Largest Number is : " +firstLargestNumber);
                int secondLargestNumber = data[data.length-2];
                System.out.println("Second Largest Number is : " +secondLargestNumber);
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */

	}

}
