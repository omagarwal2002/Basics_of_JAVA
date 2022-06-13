package Intellijcodes;
class Marks {
    int phy;
    int chem;
    int maths;

    Marks(int phy, int chem, int maths) {
        this.phy = phy;
        this.chem = chem;
        this.maths = maths;
    }

    int sum() {
        int mark;
        mark = phy + chem + maths;
        return mark;
    }

    void percentage() {
        int totalMarks;
        totalMarks = this.sum();
        double percentage;
        percentage = totalMarks / 3;
        System.out.println("Percentage: " + percentage + "%");
    }
}
public class Thisobject {
    public static void main(String args[]) {
        Marks one = new Marks(94, 73, 92);
        one.percentage();
    }
}
