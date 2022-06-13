package Intellijcodes;
class Add{
    int a;
    int b;
    void sum(){
        int total;
        total= a+b;
        System.out.println(total);
    }
    void sum1(int c , int d){
        a=c;
        b=d;
        int total;
        total=a+b;
        System.out.println(total);
    }
}
public class classobject {
    public static void main(String[] args) {
        Add obj = new Add();
        obj.a=7;
        obj.b=8;
        obj.sum();
        obj.sum1(9 , 9);
    }
}
