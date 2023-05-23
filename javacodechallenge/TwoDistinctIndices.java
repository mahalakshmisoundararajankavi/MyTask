package javacodechallenge;

import java.util.HashMap;
import java.util.Map;

public class TwoDistinctIndices {

	public static void main(String[] args) {
		int nums[] = {1,2,3,1};
		int k = 3;
		boolean result = true;
		Map< Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				Integer beforeInt = map.get(nums[i]);
				if(Math.abs(i-beforeInt)<=k) {
					result = true;
					//System.out.println(result);
				}
			}
			map.put(nums[i], i);
			System.out.println(k);
			break;
			//System.out.println(result);
		}
		result = true;
		System.out.println(result);
	}

}
