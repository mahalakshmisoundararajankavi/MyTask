package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test ="changeme";
		char[] cs = test.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			//System.out.println(i);
			if(i%2!=0) {
				test=test.toUpperCase();
				System.out.println(i + " " +test);
			}
		}
		

	}

}
