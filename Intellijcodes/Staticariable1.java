package Intellijcodes;
class Counter {
    static int count = 0;

    Counter() {
        count++; // 1--> 2-->3
        System.out.println(count);
    }

}
public class Staticariable1 {
    public static void main(String args[]) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
