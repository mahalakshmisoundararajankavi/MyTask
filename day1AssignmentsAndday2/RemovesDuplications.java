package week3.day1AssignmentsAndday2;

import java.util.HashSet;
import java.util.Set;

public class RemovesDuplications {

	public static void main(String[] args) {
//		Declare a String as "PayPal India"
		String text = "PayPal India";

//		Convert it into a character array
		char[] charArray = text.toCharArray();

//		Declare a Set as charSet for Character
		Set<Character> charSet = new HashSet<Character>();
		
//		Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new HashSet<Character>();
		
//		Iterate character array and add it into charSet
//		if the character is already in the charSet then, add it to the dupCharSet
		for (char c : charArray) {
            if (!charSet.add(c)) {
                dupCharSet.add(c);
            }
        }
//		Check the dupCharSet elements and remove those in the charSet
		charSet.removeAll(dupCharSet);

//		Iterate using charSet
		 for (char c : charSet) {
//				Check the iterator variable isn't equals to an empty space
	            if (c != ' ') {
//	        		print it
	                System.out.print(c);
	            }
	        }




	}

}
