package lab10;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrl= new ArrayList<String>();
		//adding elements to the end
		arrl.add("Fisrt");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Fourth");
		
		Iterator<String> itr= arrl.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
