package lab7;
class userexception extends Exception{
public userexception (String s) {
	super (s) ;
	}
}
public class Q3_User{
void number (int user_number) throws userexception{
	
	if (user_number <500){
		throw new userexception("Exception occured");
	}
}

public static void main (String args[]) {
	Q3_User us = new Q3_User() ;
	try {
		us.number(250) ;
}

	catch (userexception ue) {
		System.out.println("Caught the exception");
		System.out.println(ue.getMessage () );
		}
	}
}