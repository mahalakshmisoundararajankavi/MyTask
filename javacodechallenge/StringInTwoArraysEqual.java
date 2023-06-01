package javacodechallenge;

public class StringInTwoArraysEqual {

	public static void main(String[] args) {
		String[] arrayOne = {"a"+"bc"};
		String[] arraytwo = {"ab"+"c"};
		boolean isTrue = true;
		String one = " ";
		String two = " ";
		for (int i = 0; i < arrayOne.length; i++) {
			one=one+arrayOne[i];
			System.out.print(one);
		}
		System.out.println(" ");
		for (int j = 0; j < arraytwo.length; j++) {
			two=two+arraytwo[j];
			System.out.print(two);
		}
		System.out.println(" ");
		if(one.equals(two)) {
			System.out.println("Print it is equals to array one and array two " + one + "=" +two);
			System.out.println(true);
		}
		else {
			System.out.println("Not equals to");
			System.out.println(false);
		}

	}

}
