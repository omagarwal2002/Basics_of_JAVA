package Intellijcodes;
class Javapathshala {
    int sno;
    String name;
    static String program ="Btech";
    Javapathshala(int serial, String fname){
        sno= serial;
        name= fname;
        System.out.print("sno.:"+ sno + "   ");
        System.out.print("name:"+ name+ "   ");
        System.out.println(("program:"+program));
    }
}
public class Staticvariable2{
    public static void main(String[] args){
        Javapathshala stu1 = new Javapathshala(1, "om");
        Javapathshala stu2 = new Javapathshala(2, "armaan");
        Javapathshala stu3 = new Javapathshala(3, "esha");
        Javapathshala stu4 = new Javapathshala(4, "shubam");
        Javapathshala stu5 = new Javapathshala(5, "rudrakshi");
    }
}