package lab4;

class Player {
	
    String name;
    int age;
    int no_matches;
    int ranking; 
    String type;
 
    Player(String t,String n, int a, int nom, int rank)
    {
        name = n;
        type=t;
        age = a;
        no_matches = nom;
        ranking = rank;
    } 
    
	public void show()
	{
	
    System.out.println("Sport: "+ type);
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("No of Mathces: "+no_matches);
    System.out.println("Rank: "+ranking);
	
	}

}

class Cricket_Player extends Player {
    int runs;
    int centuries;

    public Cricket_Player(String t, String n, int a, int nom, int rank, int r, int cent) {
        super(t, n, a, nom, rank);
        runs = r;
        centuries = cent;
    }

    public void show()
    {
    	System.out.println("\n--------------------------");
    	super.show();
        System.out.println("Total Runs: "+runs);
        System.out.println("No of Centuries: "+centuries);	       
    }

}

class Football_Player extends Player {

	 int goals;
	    int fouls;

	    public Football_Player(String t,String n, int a, int nom, int rank, int g, int foul) {
	        super(t, n, a, nom, rank);
	        goals = g;
	        fouls = foul;       
	    }

	    public void show()
	    {
	    	System.out.println("\n--------------------------");
	    	super.show();
	        System.out.println("Total Goals: "+goals);
	        System.out.println("No of faul "+fouls);       
	    }   
}


class Hockey_Player extends Player {
	int goals;
    int noyellocard;

    public Hockey_Player(String t,String n, int a, int nom, int rank, int g, int ycard) {
        super(t, n, a, nom, rank);
        goals = g;
        noyellocard = ycard;}
        
	 public void show()
	    {
			System.out.println("\n--------------------------");
			super.show();
	        System.out.println("Total Goals: "+goals);
	        System.out.println("No of yellow card: "+noyellocard);	       
	    }
}


public class L04_q2 {
    
    	public static void main(String args[])
    	{
        Cricket_Player cp = new Cricket_Player("Cricket","Virat",31,100,2,10023,70);
        Football_Player fp = new Football_Player("Football","Messi",32,300,20,103,2);
        Hockey_Player hp = new Hockey_Player("Hockey","Manpreet",22,3,2,10,4);
        cp.show();
        fp.show();
        hp.show();
    	}
    }

