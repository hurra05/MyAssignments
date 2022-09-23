package assignment1;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		List<Integer>a1=new ArrayList<Integer>();
		List<Integer>b1=new ArrayList<Integer>();
		for (int i = 0; i < b.length; i++) {
		a1.add(a[i]);
		b1.add(b[i]);
		}
			for (int j = 0; j < a1.size();j++) {
				for (int k = 0; k< b1.size(); k++) {
					
		
				if(a1.get(j)==b1.get(k)) {
					System.out.println(a1.get(j));
				}
					
				}
			}
			
		
		

	}

}
