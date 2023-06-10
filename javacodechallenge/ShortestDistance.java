package javacodechallenge;

public class ShortestDistance {

	public static void main(String[] args) {
		String s = "aaab";
        char c = 'b';
        int[] result = new int[s.length()];
        int prev = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            result[i] = i - prev;
        }

        for (int distance : result) {
            System.out.print(distance + " ");
        }
       
	}

}
