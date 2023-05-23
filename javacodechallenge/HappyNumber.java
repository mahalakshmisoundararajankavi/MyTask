package javacodechallenge;

public class HappyNumber {

	public static void main(String[] args) {
		int nums = 19;
		int sum = 0;
		int temp;
		while(nums>0) {
			temp = nums%10;
			sum+=(temp*temp);
			nums=nums/10;
		}
		nums=sum;
		if(sum != 1) {
			System.out.println("It is Happy Number");
		}
		else {
			System.out.println("It is unhappy");
		}
	}

}
