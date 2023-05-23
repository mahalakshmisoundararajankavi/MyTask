package week3.day1;

public class Calculator {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
    public void multiple(double a, double b) {
		System.out.println(a*b);
	}
    public void multiple(float a, float b) {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(10, 5);
        c.add(12, 6, 20);
        c.multiple(12.098, 45.0986);
        c.multiple(12.0, 11.0);
	}

}
