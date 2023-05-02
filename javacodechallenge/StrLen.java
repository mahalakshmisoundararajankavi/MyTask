package javacodechallenge;

public class StrLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "luffy is still joyboy";
		int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                break;
            }
        }
        System.out.println("Joyboy length is : " + " " +length);

	}

}
