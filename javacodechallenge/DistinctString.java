package javacodechallenge;

import java.util.HashMap;
import java.util.Map;

public class DistinctString {

	public static void main(String[] args) {
		String[] arr = {"d","b","c","b","c","a"};
		int k = 2;
		int distinctCount = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String string : arr) {
			map.put(string, map.getOrDefault(string, 0) + 1);
		}
		for (String string : arr) {
			if(map.get(string)== 1) {
				distinctCount++;
				if(distinctCount == k) {
					System.out.println("Distinct String :" +string);
					return;
				}
			}
		}
		System.out.println(" ");
	}

}
