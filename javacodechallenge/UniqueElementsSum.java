package javacodechallenge;

public class UniqueElementsSum {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int sum = 0;
		int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int[] counts = new int[max + 1];

        for (int num : nums) {
            counts[num]++;
        }

		for (int i = 0; i < counts.length; i++) {
			if(counts[i] == 1) {
				sum += i;
			}
		}
		System.out.println("Sume of Unique Elements : " +sum);
	}

}
