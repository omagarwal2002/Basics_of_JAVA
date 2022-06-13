package lab10;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class CheckKeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating a HashMap of int keys and String values
		HashMap<Integer, String> hashmap= new HashMap<Integer, String>();
		
		//Adding key and value pairs to HashMap
		hashmap.put(15, "armaan");
		hashmap.put(19, "prinit");
		hashmap.put(30, "rahul");
		hashmap.put(33, "arpit");
		hashmap.put(45, "shrey");
		
		//find weather specified key exist or not
		boolean flag = hashmap.containsKey(30);
		System.out.println("Key 30 exist in HashMap? : "+ flag);
		System.out.println();
		
		//find weather specified key exists or not
		boolean flag2 = hashmap.containsValue("shrey");
		System.out.println("Value shrey exist in HashMap? : "+ flag2);
		System.out.println();
		
		//get all keys from given HashMap
		Set<Integer> keys = hashmap.keySet();
			 for (Integer key: keys) {
				 System.out.println(key);
			 }
			 System.out.println();
			 
		//get all the key-value pair as Entry objects
			 Set<Entry<Integer, String>> entries = hashmap.entrySet();
			 for (Entry<Integer, String> ent: entries) {
				 System.out.println(ent.getKey()+ "==> "+ ent.getValue());
			 }

	}

}
