package week3.day1;

import java.util.Iterator;

import org.apache.hc.core5.util.CharArrayBuffer;

public class ChangeOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changeme";
		char[] charArray = test.toCharArray();
		for (int i = charArray.length-1; i>=0; i--) {
			if(i%2==0) {
				//System.out.println("even");
				
				
			//System.out.println(Character.toUpperCase(charArray[i]));
			charArray[i]=Character.toUpperCase(charArray[i]);
			
			}
			else {
				//System.out.println("odd");
				
				
			}
		}
		System.out.println(charArray);
		
	}

}
