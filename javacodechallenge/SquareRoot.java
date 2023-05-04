package javacodechallenge;

public class SquareRoot {

	public static void main(String[] args) {
		int input = 4;
		int squareRoot = input/2;
		for (int i = 1; i < input; i++) {
			squareRoot = squareRoot-(squareRoot*squareRoot-input)/(2*squareRoot);
		}
		int i =1;
		if(i*i == input) {
			System.out.println("Square Root : " +squareRoot);
		}
		else {
			System.out.println("Not Square Root : " +squareRoot);
		}
	}

}
