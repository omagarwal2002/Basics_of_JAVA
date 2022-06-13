package Intellijcodes;
class vehicle{
    vehicle(){
        System.out.println("vehicle is created");
    }
}
class superConstructor extends vehicle{
	superConstructor(){
        super();
        System.out.println("bike is created");
    }
    public static void main(String[] args){
    	superConstructor c= new superConstructor();
    }
}
//NOTE:  superConstructor--->  car

