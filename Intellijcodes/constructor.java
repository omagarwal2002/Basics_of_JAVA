package Intellijcodes;
class Addition{
    int a;
    int b;
    Addition (){
        System.out.println("Constructor created...");
    }
    Addition(int c, int d){
        a=c;
        b=d;
        System.out.println(a);
        System.out.println(b);
    }
    void sum(){
        int total= a+b;
        System.out.println(total);
    }
}
public class constructor {
    public static void main(String[] args){
        Addition obj= new Addition();//default constructor
        Addition obj1= new Addition(11,12);//parameterised constructor
        obj1.sum();
        obj.sum();
    }
}
