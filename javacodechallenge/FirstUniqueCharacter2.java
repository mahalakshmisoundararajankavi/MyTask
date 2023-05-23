package javacodechallenge;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter2 {

	public static void main(String[] args) {
		String s = "aabb";
		char[] arrValue = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : arrValue) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i))==1) {
				index=i;
				break;
			}
		}
        System.out.println("Index Value :  " +index);
	}

}
