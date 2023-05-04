package javacodechallenge;

public class PalindromeEmpty {

	public static void main(String[] args) {
		String textInput = "  ";
		boolean notPalindrome = true;
		String result = textInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	    for (int i = 0; i < result.length()-1; i++) {
			if(result.charAt(i) != result.charAt(result.length()-1)) {
				notPalindrome = true;
			}
		}
	    System.out.println(notPalindrome);
	   System.out.println(result + " " + "    : is a empty");
	}

}
