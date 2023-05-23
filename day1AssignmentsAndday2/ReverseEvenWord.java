package week3.day1AssignmentsAndday2;

import java.util.Arrays;

public class ReverseEvenWord {

	public static void main(String[] args) {
//		 * Declare the input as Follow
  		String test = "I am a software tester"; 
//	a) split the words and have it in an array
  		String[] words = test.split(" ");
  		System.out.println("Words is an Array : " +Arrays.toString(words));
//	b) Traverse through each word (using loop)
  		for (int i = 0; i < words.length; i++) {
			if(i%2!=0) {
				System.out.println("Odd Index Values : " + words[i]);
			}
		}
//	c) find the odd index within the loop (use mod operator)
  		for (int i = words.length-1;i>=0; i--) {
			if(i%2==0) {
				  char[] charArray = words[i].toCharArray();
				  for (int j = charArray.length-1; j >=0; j--) {
					System.out.println(charArray[j]);
				}
				  System.out.print("");
			}
		}

	}

}
