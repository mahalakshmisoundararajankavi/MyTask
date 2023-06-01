package javacodechallenge;

public class LuckyInteger {

	public static void main(String[] args) {
		int[] arr = {2,2,3,4};
		int maxLucky = -1;
		for (int i = 0; i <= arr.length; i++) {
			int count = 0;
			for (int num : arr) {
				if(num == i) {
					count++;
				}
			}
			if(count ==i && i > maxLucky) {
				maxLucky = i;
			}
		}
		System.out.println(maxLucky);

	}

}
