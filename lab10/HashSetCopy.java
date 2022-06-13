package lab10;
import java.util.HashSet;
public class HashSetCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		//add elements to HashSet
		hs.add("first");
		hs.add("second");
		hs.add("third");
	    System.out.println(hs);
	    
	    HashSet<String> subset = new HashSet<String>();
	    subset.add("s1");
	    subset.add("s2");
	    hs.addAll(subset);
	    
	    //copy another collection object to HasSet object.
	    System.out.println("HashSet contents after adding another collection");
	    System.out.println(hs);
	    
	    //delete all entries at one call from HashSet
	    hs.clear();
	    System.out.println("Content after clear:");
	    System.out.println(hs);
	    

	}

}
