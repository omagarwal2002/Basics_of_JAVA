package lab10;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<String>();
		//adding elements to the end
		list.add("Java");
		list.add("Cric");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");
		System.out.println("before reverse function: "+ list);
		
		Collections.reverse(list);
		System.out.println("Results after reverse operations: ");
		for(String str : list) {
			System.out.println(str);
		}
		//System.out.println("after reverse function: "+ list);
			

	}

}
