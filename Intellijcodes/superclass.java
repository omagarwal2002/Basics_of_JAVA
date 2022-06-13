package Intellijcodes;
//used to refer parent class instance variable
//to invoke immediate parent class method
//to invoke immediate parent class constructor.
class Vehicl{
    int speed =50;
}
class Bike extends Vehicl {
    int speed = 100;

    void display() {
        System.out.println((speed));
        System.out.println((super.speed));
    }
}
 public class superclass {
    //}
    public static void main(String[] args){
        Bike b= new Bike();
        b.display();
    }
}