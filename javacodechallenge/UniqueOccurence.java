package javacodechallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurence {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 1, 1, 3};
		Map<Integer, Integer> map = new HashMap();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> set = new HashSet();
        for (int count : map.values()) {
            if (set.contains(count)) {
                System.out.println("Result: false");
                return;
            }
            set.add(count);
        }

        System.out.println("Result: true");
    }

	}


