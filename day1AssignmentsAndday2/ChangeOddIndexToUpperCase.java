package week3.day1AssignmentsAndday2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		// Convert the String to character array
		char[] upperChare = test.toCharArray();
		//Traverse through each character (using loop)
        for (int i = 0; i <= upperChare.length-1; i++) {
        	//System.out.println(upperChare[i]);
        	//find the odd index within the loop (use mod operator)
			if(i%2!=0) {
				//within the loop, change the character to uppercase, if the index is odd else don't change
			    char c = Character.toUpperCase(upperChare[i]);
			    System.out.print(upperChare[i]);
			    System.out.print(c);
			}
			//System.out.println(c);
		}
      
	}

}
