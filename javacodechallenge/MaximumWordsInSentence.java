package javacodechallenge;

public class MaximumWordsInSentence {

	public static void main(String[] args) {
		 String[] sentences = { "alice and bob love leetcode","i think so too", "this is great thanks very much"};
	        int maxWords = 0;
	        for (String sentence : sentences) {
	            String[] words = sentence.split(" ");
	            int wordCount = words.length;
	            if (wordCount > maxWords) {
	                maxWords = wordCount;
	            }
	        }

	        System.out.println("Maximum number of words in a single sentence: " + maxWords);

	}

}
