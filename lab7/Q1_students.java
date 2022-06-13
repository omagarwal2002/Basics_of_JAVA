package lab7;

class Student {

    public String Name;

    public int Roll_No;

    public Student(){ }

    public Student(String N, int R)

    {
        Name = N;
        Roll_No = R;
        System.out.println("Name : "+Name+"		"+"Roll_no : "+Roll_No);

    }

    public void print(String P, int K)

    {
        Name = P;
        Roll_No = K;
        System.out.println("Name : "+Name+"		"+"Roll_no : "+Roll_No);

    }
}

public class Q1_students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] Stu;

        Stu = new Student[10];

        Stu[0] = new Student("Naman", 91);
        Stu[1] = new Student("Gaurav", 92);
        Stu[2] = new Student("Rahul", 93);
        Stu[3] = new Student("Ram", 94);
        Stu[4] = new Student("Shyam", 95);
        Stu[5] = new Student("Jatin", 96);
        Stu[6] = new Student("Loki", 97);
        Stu[7] = new Student("Riya", 98);
        Stu[8] = new Student("GoPro", 99);
        Stu[9] = new Student("Supremes", 100);

        try {
            Stu[10] = new Student();

            Stu[10].print("oly", 111);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Do not cross size of array sir." + e);
        }
    }

}



