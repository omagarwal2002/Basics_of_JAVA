package Intellijcodes;
class Student {
    int rollno;
    String name;
    String course;
    float fee;

    Student(int rollno1, String name1, String course1) {
        this.rollno = rollno1;
        this.name = name1;
        this.course = course1;
    }

    Student(int rollno1, String name1, String course1, float fee1) {
        this(rollno1,name1,course1);
        fee = fee1;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }
}

public class Thisconstructor {
    public static void main(String args[]) {
        Student s1 = new Student(111, "ankit", "java");
        Student s2 = new Student(112, "sumit", "java", 6000f);
        s1.display();
        s2.display();
    }
}

