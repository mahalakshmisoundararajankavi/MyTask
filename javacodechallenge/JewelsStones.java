package javacodechallenge;

public class JewelsStones {

	public static void main(String[] args) {
		String jewels = "aA",  stones = "aAAbbbb";
		char[] jewelArr = jewels.toCharArray();
		char[] stoneArr = stones.toCharArray();
		int count = 0;
		for (int i = 0; i < jewelArr.length; i++) {
			for (int j = 0; j < stoneArr.length; j++) {
				if(jewelArr[i]==stoneArr[j]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
