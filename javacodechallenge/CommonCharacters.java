package javacodechallenge;

public class CommonCharacters {

	public static void main(String[] args) {
		String[] words = {"bella","label","roller"};
		String matchValue = words[0];
		String temp = "";
		for (int i = 1; i < words.length; i++) {
			for (char c :matchValue.toCharArray()) {
				if(words[i].contains(c + "")) {
					temp += c;
					words[i] = words[i].replaceFirst(c + "", "");
				}
			}
			matchValue = temp;
			temp = "";
		}
		char[] result = matchValue.toCharArray();
		System.out.println(result);
	}

}
