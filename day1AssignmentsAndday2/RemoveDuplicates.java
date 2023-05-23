package week3.day1AssignmentsAndday2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		// Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
	   
		//Initialize an integer variable as count	
		int count ;
//		  Split the String into array and iterate over it 
		String[] words = text.split(" ");
//		  Initialize another loop to check whether the word is there in the array
		System.out.println("Words an array : " + Arrays.toString(words));
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i+1; j < words.length; j++) {
				//if it is available then increase and count by 1. 
				count++;
				//if the count > 1 then replace the word as "" 
				if(count > 1) {
					words[j]=" ";
				}
				
			}
		}
	 
	}

}
