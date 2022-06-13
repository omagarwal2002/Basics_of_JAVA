package lab10;
import java.util.*;

class Student{
	int rollNo;
	String name;
	
	Student(int r, String s){
		rollNo= r;
		name=s;
	}
}

public class HashSetSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//objects of student
		Student stu1= new Student(1, "Raman");
		Student stu2= new Student(2, "abhisheak");
		Student stu3= new Student(3, "rahul");
		Student stu4= new Student(4, "kartikeya");
		
		//new empty LinkedHashSet of type Student
		
		LinkedHashSet<Student> set =new LinkedHashSet<>();
		
		//add objects to set
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		
		//return true if set contains the object otherwise false
		
		if (set.contains(stu4)) {
			System.out.println(stu4.name+" is present in set.");
		}else {
			System.out.println(stu4.name+" is not present in set.");
		}
		
		//using iterative LinkedHashSet
		for(Student stu: set) {
			if (stu==stu2) {
				System.out.println(stu.name+" present in set");
			}
		}

	}

}
