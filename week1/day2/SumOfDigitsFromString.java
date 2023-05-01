package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method1
		 String text = "Tes12Le79af65";
		 int sum = 0;
		 String digitsOnly = text.replaceAll(" \\D", " ");
         System.out.println("Digits Only" + " " +digitsOnly);
         char[] ca = digitsOnly.toCharArray();
         for (char c : ca) {
			int num = Character.getNumericValue(c);
			sum += num;
		}
         //Method2
         System.out.println("Sum od digits : " + sum);
         char[] chars = text.toCharArray();
         for (char c : chars) {
             if (Character.isDigit(c)) {
                 int num = Character.getNumericValue(c);
                 sum += num;
             }
         }
         System.out.println("Sum of digits: " + sum);
	}

}
