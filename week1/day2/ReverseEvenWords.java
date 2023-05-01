package week1.day2;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] words = test.split(" ");
		System.out.println("Words is an Array : " +Arrays.toString(words));
		for (int i = 0; i < words.length; i++) {
			if(i%2!=0) {
				System.out.println("Odd Index Values : " + words[i]);
			}
		}
		for (int i = words.length-1;i>=0; i--) {
			if(i%2==0) {
				  char[] charArray = words[i].toCharArray();
				  for (int j = charArray.length-1; j >=0; j--) {
					System.out.println(charArray[j]);
				}
				  System.out.println(" ");
			}
		}

	}

}
