package Intellijcodes;

public class Methodoverloading {
    void test(){
        System.out.println("no parameter");
    }
    void test(int a){
        System.out.println("one parameter= "+ a);
    }
    void test(int a, int b){
        System.out.println("two parameters= "+a +" and "+ b);
    }
    void test(double a){
        System.out.println("one parameter as double= "+ a);
    }

}
class main {
    public static void main(String[] args){
        Methodoverloading d1= new Methodoverloading();
        d1.test();
        d1.test(4);
        d1.test(1, 3);
        d1.test(1.665);
    }

}
