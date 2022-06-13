package Intellijcodes;
class Java {
    int sno;
    String Name;
    static String Program = "Btech";

    Java(int sno, String Name) {
        this.sno = sno;
        this.Name = Name;
    }

    void display() {
        System.out.print("S.No:" + sno+"    ");
        System.out.print("Name:" + Name+"    ");
        System.out.println("Program:" + Program);
    }
}
    public class Thisvariable {
        public static void main(String[] args) {
            Java mentor1 = new Java(1, "om");
            Java mentor2 = new Java(2, "shubam");
            Java mentor3 = new Java(3, "ashu");
            Java mentor4 = new Java(4, "shreshtha");
            Java mentor5 = new Java(5, "rahul");
            Java mentor6 = new Java(5, "armaan");
            mentor1.display();
            mentor2.display();
            mentor3.display();
            mentor4.display();
            mentor5.display();
            mentor6.display();
        }
    }
