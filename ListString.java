package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lst=new ArrayList<String>();
		lst.add("Adam");
		lst.add("Ben");
		lst.add("zara");
		lst.add("Adam");
		lst.add("charlie");
		lst.add("James");
		lst.add("Ben");
		System.out.println(lst);
		//remove data
		lst.remove(3);
		System.out.println(lst);
		//get index
		lst.get(2);
		System.out.println(lst.get(2));
		//contain
		lst.clear();
		System.out.println(lst);
		//is empty
		System.out.println(lst.isEmpty());
		System.out.println(lst.contains(2));
		
		
		
	}

}
