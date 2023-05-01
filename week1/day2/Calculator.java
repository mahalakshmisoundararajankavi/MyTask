package week1.day2;

public class Calculator {
	public int getAdd(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	}
	public float getMult(float a, float b) {
		float result = a*b;
		return result;
		
	}
	public void getSub() {
		System.out.println("Sub");
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.getAdd(2, 4, 2));
		System.out.println(cal.getMult(2, 2));
		cal.getSub();
	}
	

}
