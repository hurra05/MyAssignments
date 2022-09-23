package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		// int[] arr = {1,2,3,4,7,6,8};

		// Sort the array

		// loop through the array (start i from arr[0] till the length of the array)

		// check if the iterator variable is not equal to the array values respectively

		// print the number

		// once printed break the iteration

		Integer[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		List<Integer> arr1 = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			arr1.add(arr[i]);
			Collections.sort(arr1);
		}
		System.out.println(arr1);
		for (int i = 0; i < arr1.size(); i++) {
			if(arr[i]+1!=arr[i+1]) {
				System.out.println(arr[i]+1);
				break;
			}
			}
				
			
		}
		
	
	
	}


