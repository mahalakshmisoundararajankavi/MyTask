package week3.day1AssignmentsAndday2;

public class printDuplicateInAnArray {

	public static void main(String[] args) {
           int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
           int n = arr.length;
           int count;
              for (int i = 0; i < n-1; i++) {
	             count = 0;
	             for (int j = i+1; j < n; j++) {
		              if(arr[i]==arr[j]) {
			          System.out.println("Matching Values : " + arr[i]);
			          count++;
		         }
	         }
	         if(count>0) {
		        break;
	         }
             }
	}

}
