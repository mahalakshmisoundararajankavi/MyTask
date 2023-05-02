package javacodechallenge;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "fly me   to   the moon";
		int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                break;
            }
        }
        System.out.println("Moon length is : " + " " +length);
	}

}
