package Intellijcodes;
class parent{
    float salary= 40000;
}
class Inheritence extends parent{
    int bonus= 1000;

public static void main(String[] args){
Inheritence p= new Inheritence();
System.out.println("salary is "+ p.salary);
System.out.println("bonus is "+ p.bonus);
}
}