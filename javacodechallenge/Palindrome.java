package javacodechallenge;

public class Palindrome {

	public static void main(String[] args) {
		String textInput = "A man, a plan, a canal: Panama";
		boolean isPalindrome = true;
		String result = textInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	    for (int i = 0; i < result.length()-1; i++) {
			if(result.charAt(i) != result.charAt(result.length()-1)) {
				// System.out.println(result);
			}
		}
	    
	   System.out.println(result + " " + " is a palindrome");
	}

}
