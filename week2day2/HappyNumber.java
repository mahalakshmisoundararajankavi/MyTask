package week2day2;

public class HappyNumber {
	
    public int getNumber(int num) {
    	int x = 0;
    	int y = 0;
    	for (int i = num; i > num; i--) {
			x=num%10;
			y=y+x*y;
			num=num/10;
		}
		return y;
    	
    }
	public static void main(String[] args) {
		int num = 19;
		int result = num;
		boolean isTrue = true;
		HappyNumber happyNumber = new HappyNumber();
		System.out.println(happyNumber.getNumber(num));
		if(result!=1) {
			System.out.println("Happy Number");
		}
		else {
			System.out.println("Not a Happy");
		}

	}

}
