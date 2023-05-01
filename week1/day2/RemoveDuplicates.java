package week1.day2;

import java.util.Arrays;

public class RemoveDuplicates {
     
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count;
		String[] words = text.split(" ");
		System.out.println("Words are array: " + Arrays.toString(words));
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i+1; j < words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
					if(count > 1) {
						words[j]=" ";
					}
				}
			}
		}
		String result = " ";
		for (String word : words) {
			if(!word.equals(" ")) {
				result += word + " ";
			}
		}
		System.out.println("String with out duplicate words " + result.trim());
	}
	    
}
