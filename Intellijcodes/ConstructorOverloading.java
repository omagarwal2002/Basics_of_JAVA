package Intellijcodes;

public class ConstructorOverloading {
    double height, width, depth;
    ConstructorOverloading(){
        System.out.println("no parameters passed");
        height=width=depth=-1;
    }
    ConstructorOverloading(double h, double w, double d){
        height=h;
        width=w;
        depth=d;
    }
    ConstructorOverloading(double len){
        height=width=depth=len;
    }
    ConstructorOverloading(ConstructorOverloading ob){
        System.out.println("box object has been passed");
        height= ob.height;
        width= ob.width;
        depth= ob.depth;
    }
    double volume(){
        return height*width*depth;
    }
//}
//class MainClass
//{
    public static void main(String[] args)
    {
        ConstructorOverloading b1= new ConstructorOverloading();
        ConstructorOverloading b2= new ConstructorOverloading(10, 12, 13);
        ConstructorOverloading b3= new ConstructorOverloading(15);
        ConstructorOverloading b4= new ConstructorOverloading(b2);
        System.out.println("v1= "+ b1.volume());
        System.out.println("v2= "+ b2.volume() );
        System.out.println("v3= "+ b3.volume());
    }
}