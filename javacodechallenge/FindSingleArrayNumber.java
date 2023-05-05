package javacodechallenge;

public class FindSingleArrayNumber {

	public static void main(String[] args) {
		int arr[] = {4,1,2,1,2};
		int result = 0;
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			result ^= arr[i];
			if(count == i) {
				System.out.println("Single Element an  array number: " +result);
			}
			}
	}
}
