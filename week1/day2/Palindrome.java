package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "madam";
		String rev = " ";
		int length = value.length();
		for (int i = value.length()-1;i>=0; i--) {
			rev = rev + value.charAt(i);
		}
		if(value.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println(value + " " + " is palindrome"  );
		}
		else {
			System.out.println(value + " " + " is not palindrome" );
		}
	}

}
