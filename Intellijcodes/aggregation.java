package Intellijcodes;

//NOTE:: aggregation---> EMPLOYEE {

class Address{
    String country, state;
    int pincode;
    public Address(int pincode, String country, String state){
        this.country=country;
        this.state=state;
        this.pincode=pincode;
    }
}
class aggregation {
int id;
String name;
Address addr;
public aggregation(int id, String name, Address addr){
    this.id=id;
    this.name=name;
    this.addr=addr;
}
void display(){
    System.out.println("ID is "+ id);
    System.out.println("name is "+ name);
    System.out.println("country is "+ addr.country);
    System.out.println("state is "+ addr.state);
}
public static void main(String[] args){
    Address ad1= new Address(1122,"india", "DELHI");
    aggregation h= new aggregation(1, "om",ad1 );
    h.display();
}
}
