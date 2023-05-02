package javacodechallenge;

public class LengthOfValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                break;
            }
        }
        System.out.println("World length is : " + " " +length);
	}

}
