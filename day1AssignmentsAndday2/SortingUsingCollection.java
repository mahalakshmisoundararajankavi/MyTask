package week3.day1AssignmentsAndday2;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)	
		String[] values = {"HCL","Wipro","Aspire System","CTS"};
       // String rev = " ";
		// get the length of the array		
		int length = values.length;

		// sort the array	
		Arrays.sort(values,Collections.reverseOrder());

		// Iterate it in the reverse order
		for (String s : values) {
			System.out.println(s);
		}

		// print the array
			
		// Required Output: Wipro, HCL , CTS, Aspire Systems
	}

}
