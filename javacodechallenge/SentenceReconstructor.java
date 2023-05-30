package javacodechallenge;

public class SentenceReconstructor {

	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";
		int index;
		String[] splitArr = s.split(" ");
        int len = splitArr.length;
        String[] result = new String[len];
        
        for (String e : splitArr) {
			index = Character.getNumericValue(e.charAt(e.length()-1));
			 String value = e.substring(0, e.length()-1);
			result[index-1] = value;
		}
        for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
