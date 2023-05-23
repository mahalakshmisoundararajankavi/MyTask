package javacodechallenge;

public class MajorityArrayElement {

	public static void main(String[] args) {
		int array[] = {2,2,1,1,1,2,2};
		int size = array.length;
		int count =0;
		int max =0;
		int index = -1;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if((array[i] == array[j])) {
					count++;
				}
			}
			
			if(count>max) {
				max=count;
				index = i;
			}
			if(max>size/2) {
				 System.out.println ("Majority element in an array is "+array[index]);  }
		    else {
		    System.out.println ("No Majority Element");  
			}
		}
		

	}

}
