package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0;
		int lastNum = 1;
		int sum;
		System.out.println(firstNum+ " " + lastNum);
		for(int i = 0; i<= 11; i++) {
			sum = firstNum+lastNum;
			System.out.println(" "+ sum);
			firstNum = lastNum;
			lastNum = sum;
		}

	}

}
