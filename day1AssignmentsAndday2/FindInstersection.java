package week3.day1AssignmentsAndday2;

public class FindInstersection {

	public static void main(String[] args) {
		int[][] num = {{3,2,11,4,6,7},{1,2,8,4,9,7}};
		int length = num.length;
		System.out.println(length);
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]);
			}
		}

	}

}
