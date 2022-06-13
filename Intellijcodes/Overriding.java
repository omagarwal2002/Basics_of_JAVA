package Intellijcodes;

class Base{
    void show(){
        System.out.println("I am Base");
    }
    }
class Overriding extends  Base {
    void show(){
        System.out.println("I am derived");
    }
//}
//class  mainClas{
    public static void main(String[] args){
        Base obj1= new Base();
        obj1.show();

        Overriding obj2= new Overriding();
        obj2.show();
    }
}
//we cant override any method if we used final keyword with it
//if we use static then the parent class output will be shown only
//if any method is private then we cant access anything from in it.
//instance of return boolean value and used to check inheritence, for null class it gives false
