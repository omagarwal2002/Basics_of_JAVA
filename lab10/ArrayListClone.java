package lab10;

import java.util.ArrayList;

public class ArrayListClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrl= new ArrayList<String>();
		//adding elements to the end
		arrl.add("Fisrt");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		
		System.out.println("Actual ArrayList: "+arrl);
		ArrayList<String> copy= (ArrayList<String>) arrl.clone();
		System.out.println("Cloned ArrayList: "+ copy);
		

	}
}
