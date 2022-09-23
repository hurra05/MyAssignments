package assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * // Here is the input
		int[] data = {3,2,11,4,6,7};

		
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		int[] data= {3,2,11,4,6,7};
		
		Set<Integer>data1 =new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			data1.add(data[i]);
			
		}


	Object[] array = data1.toArray();
	//int val=array.length-2;
	System.out.println(array[array.length-2]);
}

}
	
